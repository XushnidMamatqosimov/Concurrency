package MultiThreading.dealingWithThreadExceptions;

public class ThreadInterruptExceptions {
    public static void main(String[] args) {
        Runnable runnable = ()->{
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(i);
            }
        };
        Thread th1 = new Thread(runnable, "Thread 1");
        th1.start();
        System.out.println("Hello PDP");
    }
}
