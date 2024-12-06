package javaThreadPool.callable;

import java.util.List;
import java.util.concurrent.*;

public class ExecutorServiceMethodsWhichWorksWithCallableAndFuture {
    public static void main(String[] args) {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        System.out.println(availableProcessors);

       try (ExecutorService service = Executors.newFixedThreadPool(availableProcessors)){
           Callable<String> callable1 = ()->{
               Thread.sleep(100);
               return "Response 1";
           };

           Callable<String> callable2 = ()->{
               Thread.sleep(100);
               return "Response 2";
           };

           Callable<String> callable3 = ()->{
               Thread.sleep(100);
               return "Response 3";
           };

           /*List<Future<String>> futures = service.invokeAll(List.of(callable1, callable2, callable3));
           for (Future<String> future : futures) {
               System.out.println(future.get());
           }*/
           String response = service.invokeAny(List.of(callable1, callable2, callable3));
           System.out.println(response);

       } catch (InterruptedException | ExecutionException e) {
           throw new RuntimeException(e);

       }
    }
}
