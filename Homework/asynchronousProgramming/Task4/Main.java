package asynchronousProgramming.Task4;

import synchronousProgramming.Singleton.SingletonExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
       /* ExecutorService service = Executors.newFixedThreadPool(5);
        int i = System.identityHashCode(Singleton.getInstance());
        System.out.println(i+ " boshqa bu");

        for (int j = 0; j < 100; j++) {
           service.execute(()-> System.out.println(System.identityHashCode(Singleton.getInstance())));
        }
        service.shutdown();*/

        SingletonNew singletonNew = new SingletonNew();
        singletonNew.adder(12);
        System.out.println(singletonNew.getSon());


    }
}
