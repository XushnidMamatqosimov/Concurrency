package javaThreadPool.callable;

import java.util.concurrent.*;

public class CallableNeedingExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // uzcard to humo;
        // sender to receiver;
        // check sender // 2s -> true/false new Thread(test sender).start()
        // check receiver // 2s -> true/false new Thread (test receiver).start()
        // transfer

        ExecutorService service = Executors.newFixedThreadPool(10);
        long begin = System.currentTimeMillis();

        Callable<Boolean> checkUzcardValid = new Callable<Boolean>() {
            @Override
            public Boolean call() throws Exception {
                System.out.println("Checking sender............");
                TimeUnit.SECONDS.sleep(2);
                return true;
            }
        };

        Callable<Boolean> checkHumoValid = new Callable<Boolean>() {
            @Override
            public Boolean call() throws Exception {
                System.out.println("Checking receiver ............");
                TimeUnit.SECONDS.sleep(2);
                return true;
            }
        };

        Future<Boolean> uzCardCheckingResponse = service.submit(checkUzcardValid);
        Future<Boolean> humoCheckingResponse = service.submit(checkHumoValid);
        System.out.println(uzCardCheckingResponse.get());
        System.out.println(humoCheckingResponse.get());
        long end = System.currentTimeMillis();
        System.out.println(end-begin);
        service.shutdown();
    }
}
