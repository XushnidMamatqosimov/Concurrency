package javaThreadPool.callable;

import java.util.concurrent.*;

public class FutureMethodsExample {
    public static void main(String[] args) {
        try (ExecutorService service = Executors.newFixedThreadPool(10)) {
            Future<String> future = service.submit(() -> {
                System.out.println("Connecting to API.....");
                Thread.sleep(1500);
                return "Response from API";
            });
            while (!future.isDone()) {
                Thread.sleep(100);
                System.out.println("API still does not answered....");
                //future.cancel(true);
            }
            if (future.isCancelled()) {
                System.out.println("Future response is cancelled;");
            }else {
                System.out.println("Reading API from future;");
            }
            //System.out.println("Response is : %s", future.get());


           /* String response = null;
            try {
                response = future.get(1, TimeUnit.SECONDS);
            } catch (TimeoutException e) {
                throw new RuntimeException(e);
            }
            System.out.println(response);*/


        } catch (InterruptedException e) {
            throw new RuntimeException(e);

        }


    }
}
