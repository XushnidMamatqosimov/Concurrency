package javaSynchronization.Task6;

import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {

        LockExample locker = new LockExample();

        var th1 = new Thread(()-> {
            for (int i = 0; i < 5; i++) {
                locker.multiply(i);
            }
        }, "Thread One ");

        var th2 = new Thread(()-> {
            for (int i = 0; i < 5; i++) {
                locker.multiply(i+1);
            }
        }, "Thread Two ");

        th1.start();
        th2.start();



    }
}
