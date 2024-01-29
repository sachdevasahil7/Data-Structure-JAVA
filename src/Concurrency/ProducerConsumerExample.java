package Concurrency;

/**
 * @author Sahil on 29/01/2024
 */
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerExample {

    static class Producer implements Runnable {
        private final BlockingQueue<Integer> queue;

        public Producer(BlockingQueue<Integer> queue) {
            this.queue = queue;
        }

        public void run() {
            try {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Producing: " + i);
                    queue.put(i); // Put item into the queue
                    Thread.sleep(1000); // Simulate some work
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    static class Consumer implements Runnable {
        private final BlockingQueue<Integer> queue;

        public Consumer(BlockingQueue<Integer> queue) {
            this.queue = queue;
        }

        public void run() {
            try {
                while (true) {
                    Integer value = queue.take(); // Take item from the queue
                    System.out.println("Consuming: " + value);
                    Thread.sleep(2000); // Simulate some work
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(5); // Create a bounded blocking queue

        // Create producer and consumer threads
        new Thread(new Producer(queue)).start();
        new Thread(new Consumer(queue)).start();

    }
}