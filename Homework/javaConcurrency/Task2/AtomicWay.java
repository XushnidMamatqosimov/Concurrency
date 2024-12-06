package javaConcurrency.Task2;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicWay {
    private AtomicInteger adder = new AtomicInteger(1);

    public int increment(){
       return adder.incrementAndGet();
    }
}
