package javaThreadPool.Task4;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        long begin = System.currentTimeMillis();
        int i = Runtime.getRuntime().availableProcessors();
        ExecutorService service = Executors.newFixedThreadPool(i);

        Callable<Integer> task1 = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                System.out.println("First task is going to be done .......");
                TimeUnit.SECONDS.sleep(5);
                return 6;
            }
        };

        Callable<String> task2 = new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println("Writing test score is pending .......");
                TimeUnit.SECONDS.sleep(4);
                return "Your writing score is 7.0";
            }
        };


        Future<Integer> submit1 = service.submit(task1);
        Future<String> submit2 = service.submit(task2);

        int result = submit1.get();
        String result2 = submit2.get();

        System.out.println("Task 1 is done? "+ submit1.isDone());
        System.out.println("Task 2 is done? "+ submit2.isDone());

        System.out.println("Your overall score is : " + result);
        System.out.println("Your writing score is : " + result2);
        long end = System.currentTimeMillis();
        System.out.println(end-begin);


        service.shutdown();

    }

}
