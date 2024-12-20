package Threads.javaSynchronization.synchronizedBlockAndMethods;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ShareResource resource = new ShareResource();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                resource.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                resource.increment();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Final count: " + resource.getCounter());
    }
}
