package javaConcurrency.Task1;

public class Counter {
    private int sum = 0;
    public synchronized void counter (){
        setSum(getSum()+1);
        System.out.println(sum);
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
