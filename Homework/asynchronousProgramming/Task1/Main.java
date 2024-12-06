package asynchronousProgramming.Task1;

import java.util.concurrent.ForkJoinPool;

public class Main {
    public static void main(String[] args) {
        int size = 500000;
        double[] array = new double[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        SumTask sumTask = new SumTask(array, 0, size);
        ForkJoinPool pool = new ForkJoinPool();
        double from = System.currentTimeMillis();
        Integer invoke = pool.invoke(sumTask);
        Integer join = sumTask.join();
        double end = System.currentTimeMillis();
        System.out.println("ForkJoin bilan: "+join + "::" + (end - from));

        from = System.currentTimeMillis();
        join = 0;
        for (int i = 0; i < size; i++) {
            array[i]= i+1; join++;
        }
        System.out.println(join);
        end = System.currentTimeMillis();
        System.out.println(join + "::" + (end - from));



    }
}
