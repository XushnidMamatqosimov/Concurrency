package MultiThreading.Task7;

public class Main {
    public static void main(String[] args) {
        Runnable runnable = (() -> {
            System.out.println("This is Thread from Runnable");

        });
        Thread thread = new Thread(runnable, "Runnable Thread");
        thread.setPriority(Thread.MAX_PRIORITY);

        var th = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }, "Xushnid's thread");
        th.start();

        MyRunnable runnable1 = new MyRunnable("Nodir");
        Thread thread1 = new Thread(runnable1);
        thread1.setPriority(1);
        thread1.start();
        var thread2 = new Thread(runnable1);
        thread2.setName("Akbar's ");
        thread2.setPriority(2);
        thread2.start();
        System.out.println(Thread.currentThread());
        System.out.println("Thread #1 Priority: " + thread1.getPriority());
        System.out.println("Thread #2 Priority: " + thread2.getPriority());
        System.out.println("Thread #0 Priority: " + th.getPriority());

    }
}

class MyRunnable implements Runnable {
    private String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(name + " thread is running " + i);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public String toString() {
        return "MyRunnable{" +
                "name='" + name + '\'' +
                '}';
    }
}

