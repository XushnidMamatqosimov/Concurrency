package synchronousProgramming.forkJoin;

import java.util.concurrent.RecursiveTask;

public class CounterRecursiveTask extends RecursiveTask<Integer> {
    private double[] numbers;
    private int from;
    private int to;
    private int limit = 1000;

    public CounterRecursiveTask(double[] numbers, int from, int to) {
        this.numbers = numbers;
        this.from = from;
        this.to = to;
    }

    @Override
    protected Integer compute() {
        if (to - from < limit) {
            int count = 0;
            for (int i = from; i < to; i++) {
                if (numbers[i] > 0.3) {
                    count++;
                }
            }
            return count;
        }else {
            int mid = from+(to-from)/2;
            CounterRecursiveTask first = new CounterRecursiveTask(numbers, from, mid);
            CounterRecursiveTask second = new CounterRecursiveTask(numbers, mid, to);
            invokeAll(first,second);
            return first.join()+second.join();
        }

    }
}
