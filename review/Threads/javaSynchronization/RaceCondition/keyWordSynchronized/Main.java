package Threads.javaSynchronization.RaceCondition.keyWordSynchronized;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        withRaceConditionProblem();

        // todo: Bu muammoni 1 ta kalit soz bilan yaniy synchronized bilan hal qilsak boladi.
        //  Buning uchun biz Counter classiga borib increment() methodimizni synchronized qilib qoyishimiz kifoydir;


    }

    private static void withRaceConditionProblem() throws InterruptedException {
        Counter counter = new Counter();
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        thread.start();
        thread1.start();

        thread.join();
        thread1.join();

        // Ideal natija 2000 chiqishi kerak, lekin Race condition tufuyli notogri natija chiqadi;
        System.out.println("Final count: " + counter.getCount());
    }
}
