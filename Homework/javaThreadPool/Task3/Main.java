package javaThreadPool.Task3;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        int i = Runtime.getRuntime().availableProcessors();
        try (ExecutorService service = Executors.newFixedThreadPool(i)) {
            Future<String> future = service.submit(() -> {
                System.out.println("Connecting to HMTP ...");
                Thread.sleep(1500);
                return "Connection successfully";

            });

            while (!future.isDone()){
                Thread.sleep(200);
                System.out.println("HMTP does not answered;");
            }


            try {
                String response = future.get();
                System.out.println(response);
            } catch (InterruptedException e) {
                System.out.println("Task throw an exception: ");
            }
        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        }


        /*Callable<Boolean> callable = new Callable<Boolean>() {
            @Override
            public Boolean call() throws Exception {
                System.out.println("Email is sending...");
                TimeUnit.SECONDS.sleep(5);
                return true;
            }

        };

        Callable<Boolean> callable1 = new Callable<Boolean>() {
            @Override
            public Boolean call() throws Exception {
                System.out.println("Email is receiving...");
                TimeUnit.SECONDS.sleep(5);
                return true;
            }
        };*/


    }
}
