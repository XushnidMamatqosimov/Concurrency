package javaSynchronization.fieldvisibility;

public class WithoutVolatile {
    public static void main(String[] args) throws InterruptedException {
        var runnable = new MyRunnable();
        var th1 = new Thread(runnable);
        var th2 = new Thread(runnable);
        th1.start();
        th2.start();
        Thread.sleep(3000);
        runnable.stop();
    }

}
class MyRunnable implements Runnable{
    private volatile boolean active;

    @Override
    public void run() {
        active=true;
        while (active){
           // System.out.println(Thread.currentThread());
        }
        System.out.println(Thread.currentThread()+ " ::::::::::::::::: Finished");
    }
    public void stop(){
        active=false;
    }

}

