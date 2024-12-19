package Threads.Multithreading;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("this is thread from MyRunnable");
    }
}
