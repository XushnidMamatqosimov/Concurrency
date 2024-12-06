package javaConcurrency.threadsafecollection;

import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

public class HashSetCollection {
    public static void main(String[] args) throws InterruptedException {
        // todo: Esli yoli:
        var set1 = new HashSet<Integer>();
        var set = Collections.synchronizedSet(set1);

        // todo: listni thread safe qilishnig eng zor yoli
       // var set = ConcurrentHashMap.<Integer>newKeySet();
        Runnable runnable = () -> {
            try {
                for (int i = 0; i < 1000; i++) {
                    set.add(i);
                }
                Thread.sleep(1);
            } catch (InterruptedException e) {

            }
        };

        Runnable runnable2 = () -> {
            try {
                for (int i = 1000; i < 2000; i++) {
                    set.add(i);
                }
                Thread.sleep(1);
            } catch (InterruptedException e) {
            }
        };

        new Thread(runnable).start();
        new Thread(runnable2).start();
        TimeUnit.SECONDS.sleep(2);
        System.out.println(set.size());
    }
}
