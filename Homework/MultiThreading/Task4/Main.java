package MultiThreading.Task4;

public class Main {
    public static void main(String[] args) {
        Runnable runnable = new RunnableTest();
        Thread thread = new Thread(runnable);
        thread.setName("Xushnid's Thread");
        thread.start();
    }
}
