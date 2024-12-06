package javaSynchronization.deadLock;

public class DeadLockExample {
    private final Object resource1 = new Object();
    private final Object resource2 = new Object();

    public void method1 (){
        synchronized (resource1){
            System.out.println("Thread 1: Locked resource 1 ");
            synchronized (resource2){
                System.out.println("Thread 1: Locked resource 2");
            }
        }
    }

    public void method2 (){
        synchronized (resource2){
            System.out.println("Thread 2: Locked resource 2");

            // Bu kod resource 1 ni kutadi;
            synchronized (resource1){
                System.out.println("Thread 2: Locked resourc 1");
            }
        }
    }

    public static void main(String[] args) {
        DeadLockExample example = new DeadLockExample();

        Thread thread1 = new Thread(example::method1);
        Thread thread2 = new Thread(example::method1);

        thread1.start();
        thread2.start();
    }
}

