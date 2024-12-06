package javaSynchronization.Task5;

public class RaceCondition {
    private int balance = 500;

    public synchronized void withdraw(int amount) {
        synchronized (this) {
            if (balance > amount) {
                balance -= amount;
                System.out.println(Thread.currentThread().getName() + " amount " + amount + " received: ");
            }
        }
    }

    public int getBalance() {
        return balance;
    }
}
