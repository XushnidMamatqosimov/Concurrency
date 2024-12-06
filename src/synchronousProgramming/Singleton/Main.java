package synchronousProgramming.Singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 500; i++) {
            service.execute(()-> System.out.println(System.identityHashCode(SingletonExample.getInstance())));
        }
        service.shutdown();
    }
}
