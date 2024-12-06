package synchronousProgramming.completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /*CompletableFuture<String> stringCompletableFuture = new CompletableFuture<>();
        stringCompletableFuture.complete("CompletableFuture is completed;");
        System.out.println(stringCompletableFuture.get());*/

        ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        /*CompletableFuture.runAsync(()->{
            System.out.println("Current Thread Name:::"+ Thread.currentThread());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hello From runAsync");
        }, service);*/

        /*getRegister();
        System.out.println(getReturnSuccessMessage());
        for (int i = 0; i < 10; i++) {
            System.out.println("Message: " + i);
            Thread.sleep(20);
        }*/

        CompletableFuture<String> objectCompletableFuture = CompletableFuture.supplyAsync(()->{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "Value from CompletableFuture:";
        }, service);
        System.out.println(objectCompletableFuture.get());
    }

    private static String getReturnSuccessMessage() throws InterruptedException {
        Thread.sleep(500);
        return "Successfully registered please Check your inbox";
    }

    private static void getRegister() {
        ExecutorService service = Executors.newFixedThreadPool(10);
        CompletableFuture.runAsync(() -> {
            System.out.println("User data sent to database:::"+ Thread.currentThread());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("User data saved to database:::"+ Thread.currentThread());
        }, service);
        CompletableFuture.runAsync(() -> {
            System.out.println("Email sending:::"+ Thread.currentThread());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Email send:::"+ Thread.currentThread());
        }, service);
    }
}
