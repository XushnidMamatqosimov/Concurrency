package MultiThreading.ThreadCounts;

public class ActiveThreadCounts {
    public static void main(String[] args) {
        var th1 = new Thread(()-> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        },"Thread For Test");
        th1.start();
        int x = Thread.activeCount();
        Thread[] threads = new Thread[x];
        Thread.enumerate(threads);
        System.out.println(x);
        for (Thread thread:threads){
            System.out.println(thread);
        }
    }
}
