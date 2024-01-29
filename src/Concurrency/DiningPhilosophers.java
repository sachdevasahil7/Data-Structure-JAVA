package Concurrency;

/**
 * @author Sahil on 29/01/2024
 */
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


/*
How would you solve a situation wherein 5 philosophers are eating at a roundtable,
 with each philosopher needing a fork in each hand in order to eat, but there are only 5 forks present?

Ans : Each philosopher is represented by a Philosopher object, extending the Thread class.
Each fork is represented by a Lock object, specifically a ReentrantLock.
The run() method of the Philosopher class contains the main logic of the philosopher's behavior: thinking, picking up forks, eating, and releasing forks.
In the main method, we initialize the forks and philosophers, and then start all philosopher threads.
This Java implementation follows the same resource hierarchy solution as the Python version to avoid deadlock.
* */
class Philosopher extends Thread {
    private int id;
    private Lock leftFork;
    private Lock rightFork;

    public Philosopher(int id, Lock leftFork, Lock rightFork) {
        this.id = id;
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    public void run() {
        try {
            while (true) {
                // Thinking
                System.out.println("Philosopher " + id + " is thinking");

                // Pick up forks
                leftFork.lock();
                rightFork.lock();

                // Eating
                System.out.println("Philosopher " + id + " is eating");
                Thread.sleep(1000); // Simulating eating time

                // Release forks
                leftFork.unlock();
                rightFork.unlock();

                // Rest before next cycle
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class DiningPhilosophers {
    public static void main(String[] args) {
        int numPhilosophers = 5;
        Lock[] forks = new Lock[numPhilosophers];
        Philosopher[] philosophers = new Philosopher[numPhilosophers];

        // Initialize forks
        for (int i = 0; i < numPhilosophers; i++) {
            forks[i] = new ReentrantLock();
        }

        // Create philosophers
        for (int i = 0; i < numPhilosophers; i++) {
            philosophers[i] = new Philosopher(i, forks[i], forks[(i + 1) % numPhilosophers]);
        }

        // Start philosophers
        for (Philosopher philosopher : philosophers) {
            philosopher.start();
        }
    }
}
