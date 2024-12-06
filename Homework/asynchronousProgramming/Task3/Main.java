package asynchronousProgramming.Task3;

import java.math.BigDecimal;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);
        AsyncCalculator calculator = new AsyncCalculator();

        CompletableFuture<BigDecimal> addition = calculator.add(10, 5);
        CompletableFuture<BigDecimal> subtract = calculator.subtract(20, 0);
        CompletableFuture<BigDecimal> multiply = calculator.multiply(4, 4);
        CompletableFuture<BigDecimal> divide = calculator.divide(8, 4);

        CompletableFuture<Void> future = CompletableFuture.allOf(addition, subtract, multiply, divide);

        future.thenRun(()->{
           service.execute(()-> {
               try {
                   System.out.println("Add method: "+ addition.get());
                   System.out.println(Thread.currentThread());
                   System.out.println("Subtract method: "+subtract.get());
                   System.out.println(Thread.currentThread());
                   System.out.println("Multiply method: "+ multiply.get());
                   System.out.println("Divide method: "+ divide.get());
               } catch (InterruptedException|ExecutionException exception){
                   System.out.println(exception.getMessage());
                   exception.printStackTrace();
               }
           });

            System.out.println("Task ended");
        });


    }
}
