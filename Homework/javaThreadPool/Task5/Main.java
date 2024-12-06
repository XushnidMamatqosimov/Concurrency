package javaThreadPool.Task5;

public class Main {

    private static final ThreadLocal<Integer> threadLocal = ThreadLocal.withInitial(() -> 10);

    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i = 0; i <= 10; i++) {
                threadLocal.set(5);
                System.out.println(Thread.currentThread().getName() + i);
            }
        };

        Runnable runnable1 = () -> {
            for (int i = 11; i <= 50; i++) {
                threadLocal.set(20);
                System.out.println(Thread.currentThread().getName() + i);
            }
        };

        var th1 = new Thread(runnable, "One:");
        var th2 = new Thread(runnable1, "Two:");

        th1.start();
        th2.start();

        int i = Thread.activeCount();
        System.out.println("Active thread counts : " + i);


    }
}
