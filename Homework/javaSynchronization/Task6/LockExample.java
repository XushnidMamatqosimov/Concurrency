package javaSynchronization.Task6;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {
    Lock lock = new ReentrantLock();
    private int son = 1;

    public void multiply(int multiplier) {
        lock.lock();
        try {
            if (multiplier != 0) {
                son *= multiplier;
                System.out.println(Thread.currentThread().getName() + " Result : " + son);
            }
        } finally {
            lock.unlock();
        }
    }
}
