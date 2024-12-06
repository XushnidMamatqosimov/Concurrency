package javaSynchronization.Task1;

public class Counter {
    private int sum = 0;

    public void counter() {
       // System.out.println(sum);
        setSum(getSum() + 1);
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
