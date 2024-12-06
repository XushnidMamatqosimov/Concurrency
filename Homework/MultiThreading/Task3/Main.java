package MultiThreading.Task3;

public class Main {
    public static void main(String[] args) {
        Thread thread = new MyThread();
        thread.setName("Thread ONE");
        thread.start();
        System.out.println(thread.getName());
        var runnable = new MyRunnable();
        Thread thread1 = new Thread(runnable);
        thread1.setName("Runnable ONE");
        thread1.start();
        System.out.println(thread1.getName());
    }
}
class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("Bu MyThread classidan olingan method:");
    }
}
class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Bu MyRunnable classidan olindi:");
    }
}
