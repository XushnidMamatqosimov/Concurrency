package asynchronousProgramming.Task1;

import synchronousProgramming.forkJoin.CounterRecursiveTask;

import java.util.concurrent.RecursiveTask;

public class SumTask extends RecursiveTask<Integer> {
    private double [] numbers;
    private int from;
    private int to;
    private int limit = 100;

    public SumTask(double[] numbers, int from, int to) {
        this.numbers = numbers;
        this.from = from;
        this.to = to;
    }

    @Override
    protected Integer compute() {
        if (to-from<limit){
            int res = 0;
            for (int i = from; i < to; i++) {
                res+=numbers[i];
            }
            return res;
        }else {
            int mid = from+(to-from)/2;
            CounterRecursiveTask rightSide = new CounterRecursiveTask(numbers, from, mid);
            CounterRecursiveTask leftSide = new CounterRecursiveTask(numbers, mid, to);
            invokeAll(rightSide, leftSide);
            return rightSide.join()+leftSide.join();
        }

    }
}
