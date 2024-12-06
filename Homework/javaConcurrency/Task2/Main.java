package javaConcurrency.Task2;

public class Main {
    public static void main(String[] args) {
        AtomicWay way = new AtomicWay();


        var th = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() +" : " +way.increment());
            }
        }, "Thread One");

        var th2 = new Thread(() -> {
            for (int i = 10; i < 20; i++) {
                System.out.println(Thread.currentThread().getName() +" : " + way.increment());
            }
        }, "Thread Two");

        th.start();
        th2.start();
    }
}
