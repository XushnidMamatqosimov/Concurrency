package javaSynchronization.Task2;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.counter();
    }
}

class Counter {
    private int sum = 0;

    public synchronized void counter() {
        setSum(getSum() + 1);
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
