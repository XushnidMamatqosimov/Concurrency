package MultiThreading.Task6;

public class DeamonThread extends Thread {

    public String name;

    public DeamonThread(String name) {
        this.name = name;
    }
    @Override
    public void run() {


        if (Thread.currentThread().isDaemon()) {
            System.out.println("This is a Deamon thread: "+ Thread.currentThread().getName());
        } else {
            System.out.println("This is not a Deamon thread: "+Thread.currentThread().getName());
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"Thread is running: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    @Override
    public String toString() {
        return "DeamonThread{" +
                "name='" + name + '\'' +
                '}';
    }
}
