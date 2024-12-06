package asynchronousProgramming.Task3;


import java.math.BigDecimal;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AsyncCalculator {
    public CompletableFuture<BigDecimal> add(int a, int b) {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("Thread name :: " + Thread.currentThread().getName());
            return BigDecimal.valueOf(a + b);
        });
    }

    public CompletableFuture<BigDecimal> subtract(int a, int b) {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("Thread name :: " + Thread.currentThread().getName());
            return BigDecimal.valueOf(a - b);
        });
    }

    public CompletableFuture<BigDecimal> multiply(int a, int b) {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("Thread name :: " + Thread.currentThread().getName());
            return BigDecimal.valueOf(a * b);
        });
    }
    public CompletableFuture<BigDecimal> divide(int a, int b) {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("Thread name :: " + Thread.currentThread().getName());
                return BigDecimal.valueOf(a/b);
        });

    }




}
