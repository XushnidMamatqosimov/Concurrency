package MultiThreading.workingWithThreads;

public class ThreadClassMethods {
    public static void main(String[] args) throws InterruptedException {

        Runnable runnable = (() -> {
            for (int i = 0; i < 15; i++) {
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread() + "->" + i);
            }
        });

        var thread1 = new Thread(runnable, "Thread ONE: ");
        var thread2 = new Thread(runnable, "Thread TWO: ");
        var thread3 = new Thread(runnable, "Thread Tree: ");
        //thread1.setName("Xushnid's thread:");
        thread3.start();
        thread1.start();
       // thread1.join(1000);
        thread3.join(1000);
        thread2.start();
        System.out.println("hello PDP");
    }
}
