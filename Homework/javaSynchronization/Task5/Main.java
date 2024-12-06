package javaSynchronization.Task5;

public class Main {
    public static void main(String[] args) {
        RaceCondition account = new RaceCondition();

        var th1 = new Thread(()->{
            for (int i = 0; i < 5; i++) {
                account.withdraw(50);
            }
        }, "Thread One");

        var th2 = new Thread(()->{
            for (int i = 0; i < 5; i++) {
                account.withdraw(50);
            }
        },"Thread Two");

        th1.start();
        th2.start();

        try {
            th1.join();
            th2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Remained balance after withdraws : "+account.getBalance());
    }
}
