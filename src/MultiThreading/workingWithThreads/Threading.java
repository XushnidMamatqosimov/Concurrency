package MultiThreading.workingWithThreads;

public class Threading {
    public static void main(String[] args) {
        //  System.out.println(Thread.currentThread().getName());
       /* MyTask myTask = new MyTask();
        myTask.start();


        MyRunnableTask task = new MyRunnableTask();
        Thread thread = new Thread(task);
        thread.start();
        System.out.println("Do Not Say Hello World: ");*/

        Runnable runnable = ()->{
            for (int i = 0; i < 15; i++) {
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + "->" + i);
            }
        };
        /*Thread thread1 = new Thread(runnable);
        thread1.start(); */

        //todo: 3-yoli thread yaratishni:
       // new Thread(runnable).start();

        // todo: 4-yoli thread yaratishni;
        new Thread(()->{
            for (int i = 0; i < 15; i++) {
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + "->" + i);
            }
        }, "MyThread").start();
        System.out.println("Hello world");

    }
}


class MyRunnableTask implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 15; i++) {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + "->" + i);
        }
    }
}

class MyTask extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < 15; i++) {
            System.out.println(Thread.currentThread().getName() + "-> " + i);
        }
    }
}



