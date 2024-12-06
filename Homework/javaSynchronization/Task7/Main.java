package javaSynchronization.Task7;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        VolatileExample v = new VolatileExample();

        var th1 = new Thread(()-> {
           v.isActive();
           v.stop();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }, "Thread One");

        var th2 = new Thread(()-> {
            v.isActive();
            v.stop();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        },"Thread Two");

        th1.start();
        th2.start();
        Thread.sleep(2000);
        v.stop();

    }
}
