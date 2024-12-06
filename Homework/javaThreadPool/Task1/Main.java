package javaThreadPool.Task1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        /*int coresCount = Runtime.getRuntime().availableProcessors();
        try (ExecutorService service = Executors.newFixedThreadPool(coresCount)) {
            for (int i = 0; i < 1000; i++) {
                Runnable runnable = () -> {
                    System.out.println("Thread is running... ::: " + Thread.currentThread().getName());
                };
                service.submit(runnable);
            }
        }

        System.out.println("Active Threads count: "+Thread.activeCount());*/


        ExecutorService service = Executors.newFixedThreadPool(10);
        Runnable runnable = ()-> {
            for (int i = 0; i < 100; i++) {
                try {
                    Thread.sleep(2);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Thread is running ...");
            }

        };
        service.execute(runnable);
        System.out.println("Active threads : "+ Thread.activeCount());
       service.shutdown();

    }
}
