package asynchronousProgramming.Task2;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println(Thread.currentThread());
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "Xushnid Mamatqosimov";

        }).thenApply((head) -> {
            try {
                System.out.println(Thread.currentThread());
                Thread.sleep(400);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return " My name is " +head;
        }).thenAccept((full) -> {
            System.out.println(Thread.currentThread());
            System.out.println(full);
        }).thenRun(() -> {
            System.out.println(Thread.currentThread());
            System.out.println("...Dastur oz ishini yakunladi...");
        });
        System.out.println(future.get());
    }
}
