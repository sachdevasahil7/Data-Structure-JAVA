package CoreJava.deadlock;

import java.util.concurrent.locks.Lock;

/**
 * @author Sahil on 11/07/2024
 */
public class Runnable2 implements Runnable{

    private Lock lock1;
    private  Lock lock2;

    Runnable2(Lock lock1, Lock lock2){
    this.lock1=lock1;
    this.lock2=lock2;
    }

    @Override
    public void run() {
        System.out.println("thread "+Thread.currentThread().getName() +" trying to get lock");
        lock2.lock();
        System.out.println("thread "+Thread.currentThread().getName()+"takes lock 1");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        //do nothing 
        }
        System.out.println("thread "+Thread.currentThread().getName()+" trying to take lock");
        lock1.lock();
        System.out.println("thread "+Thread.currentThread().getName()+" takes lock2");
        lock2.unlock();
        lock1.unlock();
    }

}
