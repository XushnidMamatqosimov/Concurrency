package javaConcurrency.atomic;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.IntBinaryOperator;

public class AtomicLongCassExample {
    private int counter = 0;

    public synchronized int incrementAndGet() {
        counter = counter + 1;
        return counter;
    }

    public static void main(String[] args) throws InterruptedException {
        var counter = new AtomicLong();
        //var counter = new AtomicLongCassExample();

        Runnable runnable = () -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println(Thread.currentThread() + " :: " + counter.incrementAndGet());

                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        for (int i = 0; i < 10; i++) {
            new Thread(runnable).start();
        }

        Thread.sleep(2000);
        System.out.println(counter.get());
        Random random = new Random();
        int b = random.nextInt(9000,11000);

        System.out.println(b);
        counter.set(Math.max(counter.get(), b));  // race condition ni sodir qiladi;
       /* counter.accumulateAndGet(b, new IntBinaryOperator(){

            @Override
            public int applyAsInt(int left, int right) {
                return left>right?left:right;
            }
        });*/
        System.out.println(counter.get());
    }
}
