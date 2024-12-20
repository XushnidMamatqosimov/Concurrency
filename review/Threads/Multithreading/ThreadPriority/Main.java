package Threads.Multithreading.ThreadPriority;

public class Main {
    public static void main(String[] args) {
        var th = new Thread(()->{
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName()+i);
            }
        }, "xushnid's thread : ");

        th.setPriority(Thread.NORM_PRIORITY);
        th.start();
        int priority = th.getPriority();
        System.out.println(priority);

    }
}
