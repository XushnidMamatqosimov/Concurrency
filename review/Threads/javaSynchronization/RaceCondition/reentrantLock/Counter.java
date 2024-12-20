package Threads.javaSynchronization.RaceCondition.reentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    private int counter = 0;
    ReentrantLock lock = new ReentrantLock();

    public void increment(){
        lock.lock();
        try {
            counter++;
        }finally {
            lock.unlock();
        }
    }

    public int getCounter(){
       lock.lock();
       try {
           return counter;
       } finally {
           lock.unlock();
       }
    }
}
