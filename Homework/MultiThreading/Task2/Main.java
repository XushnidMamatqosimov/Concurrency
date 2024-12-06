package MultiThreading.Task2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = new RunnableExample();
        Thread thread = new Thread(runnable);
        thread.setName("Xushid's Thread: ");
        thread.start();
        thread.join();

        Runnable runnable1 = ()->{
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName()+" -> "+ i);
            }
        };
        var th1 = new Thread(runnable1, "My Second Thread: ");
        th1.start();



    }
}
