package javaSynchronization.Task7;

public class VolatileExample {
    private volatile boolean active;

    public void isActive(){
        active= true;
        while (active){
            System.out.println(Thread.currentThread().getName()+ " is running");
        }
        System.out.println(Thread.currentThread().getName()+" :::::::::: Finished!!!");
    }
    public void stop(){
        active = false;
        System.out.println("All Threads are Stopped!!!");
    }
}
