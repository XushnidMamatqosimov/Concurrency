package synchronousProgramming.forkJoin;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinExample {
    public static void main(String[] args) {
        int size = 500_000_00;
        double[] array = new double[size];
        for (int i = 0; i < size; i++) {
            array[i] = Math.random();
        }
        // 0.2>i = ?

        ForkJoinPool forkJoinPool = new ForkJoinPool();
        CounterRecursiveTask counterRecursiveTask = new CounterRecursiveTask(array, 0, size);
        double from = System.currentTimeMillis();
        forkJoinPool.invoke(counterRecursiveTask);
        Integer join = counterRecursiveTask.join();
        double end = System.currentTimeMillis();
        System.out.println(join+"::"+(end-from));

        from = System.currentTimeMillis();
        join=0;
        for (int i = 0; i < size; i++) {
            if (array[i]>0.3)join++;
        }
        end = System.currentTimeMillis();
        System.out.println(join+"::"+(end-from));
    }
}
