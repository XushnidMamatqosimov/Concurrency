package javaSynchronization.fieldvisibility;

public class FieldVisibilityProblem {
    public static void main(String[] args) throws InterruptedException {
        var r =new MyRunnable1();
        var th1 = new Thread(r, "Thread One");
        var th2 = new Thread(r, "Thread Two");
        th1.start();
        th2.start();
        Thread.sleep(3000);
        r.stop();
    }
}
class MyRunnable1 implements Runnable{
    private volatile boolean active;

    @Override
    public void run() {
        active = true;
        while (active){
        }
        System.out.println(Thread.currentThread()+" ::::::::::::::::: Fineshed!!!");
    }
    public void stop(){
        active = false;

    }
}
