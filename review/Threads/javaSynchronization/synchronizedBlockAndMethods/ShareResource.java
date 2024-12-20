package Threads.javaSynchronization.synchronizedBlockAndMethods;

public class ShareResource {
    private int counter = 0;

    public void increment (){
        synchronized (this){  // faqat shu blockgina sinxronizatsiya boladi;
            counter++;
        }
    }

    public int getCounter(){
        synchronized (this){
            return counter;
        }
    }
}
