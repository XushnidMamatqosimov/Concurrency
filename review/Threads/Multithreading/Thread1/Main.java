package Threads.Multithreading.Thread1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //umumiyReview();
        //runnable();
        // thread();

    }

    private static void thread() throws InterruptedException {
        System.out.println("Hello Pdp");
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }, "Thread #1");

        thread.start();
        thread.join();
        System.out.println("Hello world1");


        // todo: anonim obyekt yaratish yoli bn;
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }, "Thread #1").start();

    }

    private static void umumiyReview() {
        MyThread thread = new MyThread();
        thread.start();
        Runnable runnable = new MyRunnable();
        Thread thread1 = new Thread(runnable);
        thread1.start();

        Runnable runnable1 = (() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("this is runable class" + Thread.currentThread().getName());
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

    private static void runnable() throws InterruptedException {
        Runnable run = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread thread2 = new Thread(run, "Thread #1");
        Thread thread3 = new Thread(run, "Thread #2");
        Thread thread4 = new Thread(run, "Thread #3");

        thread2.start();
        thread2.join(10);
        thread3.start();
        thread3.join(10);
        thread4.start();
    }
}
