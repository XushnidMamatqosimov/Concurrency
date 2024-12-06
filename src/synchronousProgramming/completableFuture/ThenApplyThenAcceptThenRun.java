package synchronousProgramming.completableFuture;

import java.util.Random;
import java.util.concurrent.*;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class ThenApplyThenAcceptThenRun {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // method1();

        ExecutorService service = Executors.newFixedThreadPool(10);
        ForkJoinPool forkJoinPool = ForkJoinPool.commonPool();

        //method2(service);
        // System.out.println(future.get());
        // Thread.sleep(3000);
        //method3();

        CompletableFuture<Integer> exceptionally = CompletableFuture.supplyAsync(() -> {
            Random random = new Random();
            if (random.nextBoolean()) {
                throw new RuntimeException("Error Occurred;");
            }
            return 12 / 4;
        }).handle(new BiFunction<Integer, Throwable, Integer>() {
            @Override
            public Integer apply(Integer integer, Throwable throwable) {
                if (throwable != null) {
                    System.out.println("Error Occurred::" + throwable.getMessage());
                    return -1;
                } else {
                    System.out.println("Response successfully returned;");
                    return integer;
                }
            }
        });
        System.out.println(exceptionally.get());

    }

    private static void method3() throws InterruptedException, ExecutionException {
        CompletableFuture<Integer> exceptionally = CompletableFuture.supplyAsync(() -> {
            Random random = new Random();
            if (random.nextBoolean()) {
                throw new RuntimeException("Error Occurred;");
            }
            return 12 / 4;
        }).exceptionally(new Function<Throwable, Integer>() {
            @Override
            public Integer apply(Throwable throwable) {
                System.out.println("Error :: " + throwable.getMessage());
                return 0;
            }
        });
        System.out.println(exceptionally.get());
    }

    private static void method2(ExecutorService service) {
        CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> {
            System.out.println(Thread.currentThread());
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "Xushnid";
        }, service).thenApply((surname) -> {
            System.out.println(Thread.currentThread());
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "Mamatqosimov " + surname;
        }).thenAccept((name) -> {
            System.out.println(Thread.currentThread());
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(name);
        }).thenRun(new Runnable() {

            @Override
            public void run() {
                System.out.println(Thread.currentThread());
                System.out.println("............good bye..........");
            }
        });
    }


    private static void method1() throws InterruptedException, ExecutionException {
        CompletableFuture<Object> myNameCompletableFuture = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.currentThread();
                Thread.sleep(400);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "Xushnid";
        });


        CompletableFuture<String> fullName = myNameCompletableFuture.thenApply(name -> {
            try {
                Thread.currentThread();
                Thread.sleep(400);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "Mamatqosimov " + name;
        });
        System.out.println(fullName.get());

       /* fullName.thenAccept(new Consumer<>() {
            @Override
            public void accept(String s) {
                System.out.println(Thread.currentThread());
                System.out.println("FullName: " + s);
            }
        });*/

        CompletableFuture<Void> future = fullName.thenAccept((nameAll) -> {
            System.out.println("Natija: " + nameAll);
        });
        Thread.sleep(1000);

        future.thenRun(new Runnable() {
            @Override
            public void run() {
                System.out.println("...........BYE..........");
            }
        });
    }
}
