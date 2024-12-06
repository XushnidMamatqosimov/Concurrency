package javaConcurrency.Task3;

import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        var set = ConcurrentHashMap.<Integer>newKeySet();
        var set1 = new HashSet<Integer>();
        //var set = Collections.synchronizedSet(set1);

        Runnable runnable = () -> {
            try {
                for (int i = 0; i < 100; i++) {
                    set.add(i);
                }
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        Runnable runnable1 = () -> {
            try {
                for (int i = 100; i < 200; i++) {
                    set.add(i);
                }
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Thread th1 = new Thread(runnable);
        Thread th2 = new Thread(runnable1);

        th1.start();
        th2.start();

        TimeUnit.SECONDS.sleep(2);
        System.out.println(set.size());
    }
}
