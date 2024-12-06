package javaSynchronization.Task8;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLockExample {
    private final Lock lock1 = new ReentrantLock();
    private final Lock lock2 = new ReentrantLock();

    private int son = 1;

    public void method1(int adder) {
        lock1.lock();
        try {
            Thread.sleep(100);
            lock2.lock();
            try {
                if (son > 0) {
                    son += adder;
                    System.out.println(Thread.currentThread().getName() + son);
                }
            } finally {
                lock2.unlock();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock1.unlock();
        }
    }

    public void method2(int adder) {
        lock2.lock();
        try {
            Thread.sleep(100);
            lock1.lock();
            try {
                son += adder;
                System.out.println(Thread.currentThread().getName() + son);
            }finally {
                lock1.unlock();
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            lock2.unlock();
        }

    }

}
