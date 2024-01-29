package Concurrency;

/**
 * @author Sahil on 29/01/2024
 */
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;


/*
Imagine you have an application where you have multiple readers and a single writer.
 You are asked to design a lock which lets multiple readers read at the same time,
 but only one writer write at a time.

Tips to help solve the problem:
Define the APIs your class will expose. In this case you’ll need two for writer and two for reader. These are:
acquireReadLock
releaseReadLock
acquireWriteLock
releaseWriteLock

Think about each use case that you need to satisfy.

* */

class ReaderWriterLock {
    private ReentrantLock lock;
    private Condition noWriter;
    private int readers;

    public ReaderWriterLock() {
        lock = new ReentrantLock();
        noWriter = lock.newCondition();
        readers = 0;
    }

    public void acquireReadLock() throws InterruptedException {
        lock.lock();
        try {
            while (!noWriter()) {
                noWriter.await(); // Wait while a writer is writing
            }
            readers++;
        } finally {
            lock.unlock();
        }
    }

    public void releaseReadLock() {
        lock.lock();
        try {
            readers--;
            if (readers == 0) {
                noWriter.signal(); // Signal writers that all readers have released the lock
            }
        } finally {
            lock.unlock();
        }
    }

    public void acquireWriteLock() throws InterruptedException {
        lock.lock();
        try {
            while (readers > 0 || !noWriter()) {
                noWriter.await(); // Wait while readers are reading or a writer is writing
            }
        } finally {
            lock.unlock();
        }
    }

    public void releaseWriteLock() {
        lock.lock();
        try {
            noWriter.signal(); // Signal readers and writers that the write lock is released
        } finally {
            lock.unlock();
        }
    }

    private boolean noWriter() {
        return !lock.hasWaiters(noWriter);
    }

    public static void main(String[] args) {
        ReaderWriterLock lock = new ReaderWriterLock();

        // Create multiple reader threads
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                try {
                    lock.acquireReadLock();
                    System.out.println(Thread.currentThread().getName() + " is reading...");
                    Thread.sleep(1000); // Simulate reading
                    lock.releaseReadLock();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }

        // Create a writer thread
        new Thread(() -> {
            try {
                lock.acquireWriteLock();
                System.out.println(Thread.currentThread().getName() + " is writing...");
                Thread.sleep(2000); // Simulate writing
                lock.releaseWriteLock();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}