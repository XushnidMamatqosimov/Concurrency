package javaThreadPool.Task2;

import java.sql.Time;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int i = Runtime.getRuntime().availableProcessors();
        ExecutorService service = Executors.newFixedThreadPool(i);
        long begin = System.currentTimeMillis();

        Callable<Boolean> callable1 = new Callable<Boolean>() {
            @Override
            public Boolean call() throws Exception {
                System.out.println("Callable 1 is running: ....");
                TimeUnit.SECONDS.sleep(2);

                return true;
            }
        };

        Callable<Boolean> callable2 = new Callable<Boolean>() {
            @Override
            public Boolean call() throws Exception {

                System.out.println("Callable 2 is running: ....");
                TimeUnit.SECONDS.sleep(2);

                return true;
            }
        };

        Runnable runnable = () -> {
            try {
                System.out.println("Runnable is running; ....");
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Future<Boolean> submit1 = service.submit(callable1);
        Future<Boolean> submit2 = service.submit(callable2);
        service.execute(runnable);
        System.out.println(submit1.get());
        System.out.println(submit2.get());
        long end = System.currentTimeMillis();
        System.out.println(end - begin);
        service.shutdown();


    }
}
