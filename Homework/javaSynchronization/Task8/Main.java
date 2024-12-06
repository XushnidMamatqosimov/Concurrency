package javaSynchronization.Task8;

public class Main {
    public static void main(String[] args) {
        javaSynchronization.Task8.DeadLockExample example = new DeadLockExample();

        var th1 = new Thread(() -> example.method1(5), "Thread one");
        var th2 = new Thread(() -> example.method2(10), "Thread Two");

       th1.start();
       th2.start();
    }
}
