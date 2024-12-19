package Threads.Multithreading;

public class Main {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        Runnable runnable = new MyRunnable();
        Thread thread1 = new Thread(runnable);
        thread1.start();

       Runnable runnable1 = (()->{
           for (int i = 0; i < 10; i++) {
               System.out.println("this is runable class"+Thread.currentThread().getName());
               try {
                   Thread.sleep(1000);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           }
       });
       Thread th = new Thread(runnable1, "shortThread");
       th.start();
    }
}
