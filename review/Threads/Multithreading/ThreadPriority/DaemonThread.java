package Threads.Multithreading.ThreadPriority;

public class DaemonThread {
    public static void main(String[] args) {

        long from = System.currentTimeMillis();
        Thread thread = new Thread(() -> {
            while (true) {

                    System.out.println("Daemon thread is working...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        thread.setDaemon(true);
        thread.start();
        System.out.println("Main thread tugadi;");
        long to = System.currentTimeMillis();
        //System.out.println("Ketgan vaqt: "+(from-to));

    }
}
