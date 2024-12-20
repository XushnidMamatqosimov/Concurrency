package Threads.Multithreading.ThreadPriority;

public class ActiveThreadCounts {
    public static void main(String[] args) {
        Thread thread  =  new Thread(()->{
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }, "Active");


        thread.start();
        int activeCount = Thread.activeCount();
        Thread [] threads = new Thread[activeCount];
        Thread.enumerate(threads);
        System.out.println(activeCount);
        for (Thread thread1 : threads) {
            System.out.println(thread1);
        }


       /* int x = Thread.activeCount();
        Thread[] threads = new Thread[x];
        Thread.enumerate(threads);
        System.out.println(x);
        for (Thread thread:threads){
            System.out.println(thread);
        }*/
    }
}
