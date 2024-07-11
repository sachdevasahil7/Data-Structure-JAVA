package CoreJava.deadlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Sahil on 11/07/2024
 */
public class ThreadClass {
    public static void main(String[] args) {
        Lock lock1= new ReentrantLock();
        Lock lock2= new ReentrantLock();

        Runnable1 runnable1= new Runnable1(lock1,lock2);
        Runnable2 runnable2= new Runnable2(lock1,lock2);
        Thread thread1= new Thread(runnable1,"thread 1");
        Thread thread2= new Thread(runnable2,"thread 2");
        thread1.start();
        thread2.start();


    }
}
