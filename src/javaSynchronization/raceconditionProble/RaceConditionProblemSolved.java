package javaSynchronization.raceconditionProble;

import java.util.Arrays;


   // package uz.pdp.raceconditionsolvedwithlock;

import java.util.Arrays;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RaceConditionProblemSolved {
    public static final int N_ACCOUNTS = 100;
    public static final double INITIAL_BALANCE = 1000;
    public static final double MAX_AMOUNT = 1000;
    public static final int DELAY = 10;


    public static void main(String[] args) {

        var bank = new Bank(N_ACCOUNTS, INITIAL_BALANCE);

        for (int i = 0; i < N_ACCOUNTS; i++) {
            int fromAccount = i;
            Runnable r = () -> {
                try {
                    while (true) {
                        int toAccount = (int) (bank.size() * Math.random());
                        double amount = 1_000_000;//MAX_AMOUNT * Math.random();
                        bank.transfer(fromAccount, toAccount, amount);
                        Thread.sleep((int) (DELAY * Math.random()));
                    }
                } catch (InterruptedException e) {
                }
            };
            var t = new Thread(r);
            t.start();
        }
    }
}


class Bank {
    private final double[] accounts;
    private final Lock lock = new ReentrantLock(true);
    private Condition condition = lock.newCondition();

    public Bank(int n, double initialBalance) {
        this.accounts = new double[n];
        Arrays.fill(accounts, initialBalance);
    }

    public void transfer(int from, int to, double amount) {
        try {
            lock.lock();
            // from=5 , 500, 600] th3 1000]->from=1500
            while (accounts[from] < amount)
                condition.await();
            System.out.print(Thread.currentThread());
            accounts[from] -= amount;
            System.out.printf(" %10.2f from %d to %d", amount, from, to);
            accounts[to] += amount;
            System.out.printf(" Total Balance is %10.2f%n", getTotalBalance());
            condition.signalAll();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }

    public double getTotalBalance() {
        double sum = 0;
        for (double a : accounts)
            sum += a;
        return sum;
    }

    public int size() {
        return accounts.length;
    }
}

