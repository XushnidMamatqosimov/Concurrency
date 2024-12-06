package MultiThreading.dealingWithThreadExceptions;

public class ThreadExceptions {
    public static void main(String[] args) throws InterruptedException {

        var thread1 = new MyTask("Thread 1");
        var thread2 = new MyTask("Thread 2");
        var thread3 = new MyTask("Thread 3");
        thread1.start();
        thread2.start();
        thread3.start();
        Thread.sleep(120);
        throw new RuntimeException("Main Thread Exception");

    }
}
class MyTask extends Thread{
    private final String name;

    public MyTask(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i <6 ; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (name.equalsIgnoreCase("Thread 1") && i==2){
                throw new RuntimeException("Exception for testing: ");
            }else {
                System.out.println(this);
            }
        }
    }

    @Override
    public String toString() {
        return name+"->";
    }
}
