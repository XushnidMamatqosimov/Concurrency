package javaSynchronization.Task3;

public class SynchronizedBlock {
    private int balance = 0;

    public void deposit(int amount) {
        synchronized (this) {
            balance += amount;
            System.out.println(Thread.currentThread().getName()+" deposited "+ amount+ ", current balance: "+ balance);
        }
    }
    public int getBalance(){
        return balance;
    }
}
