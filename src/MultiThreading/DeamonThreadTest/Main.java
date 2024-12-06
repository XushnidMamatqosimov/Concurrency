package MultiThreading.DeamonThreadTest;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> {
            try {
                for (int i = 0; i < 40; i++) {
                    System.out.println("Active threads count: "+ Thread.activeCount()+", i -> "+ i);
                    Thread.sleep(100);
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Thread thread = new Thread(runnable);
        thread.setDaemon(true);
        thread.start();

        System.out.println("Hello PDP");
        Thread.sleep(210);
    }
}
