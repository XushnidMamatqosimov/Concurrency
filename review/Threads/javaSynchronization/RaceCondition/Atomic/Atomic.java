package Threads.javaSynchronization.RaceCondition.Atomic;

public class Atomic {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread th = new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread th1 = new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        th.start();
        th1.start();

        th.join();
        th1.join();

        System.out.println("Final result: "+counter.getCount());
    }
}
