package javaSynchronization.Task3;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SynchronizedBlock account = new SynchronizedBlock();

        var th1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                account.deposit(100);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }, "Thread One");


        var th2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                account.deposit(150);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }, "Thread Two");

        th1.start();
        th2.start();

        try {
            th1.join();
            th2.join();
        }catch (InterruptedException e){
           e.printStackTrace();
        }
        System.out.println( "Overall balance : "+account.getBalance());

    }
}
