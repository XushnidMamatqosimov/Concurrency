package MultiThreading.threadPriorities;

public class Main {
    public static void main(String[] args) {
        var th = new Thread(()-> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }, "Thread For Test");
        th.setName(String.valueOf(Thread.MAX_PRIORITY));
        th.start();
    }
}
