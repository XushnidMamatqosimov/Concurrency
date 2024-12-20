package Threads.Multithreading.Thread1;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("this is thread from MyRunnable");
    }
}
