package javaThreadPool.threadlocal;

import java.util.concurrent.ThreadLocalRandom;

public class ThreadLocalRandomClassExample {
    public static void main(String[] args) {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        int i = random.nextInt(100, 200);
        System.out.println(i);
    }
}
