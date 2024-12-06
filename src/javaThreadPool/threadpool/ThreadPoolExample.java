package javaThreadPool.threadpool;

import java.util.concurrent.TimeUnit;

public class ThreadPoolExample {
    public static void main(String[] args) {
        // register user ;

        registerUser();

    }

    private static void registerUser() {
        // database save
        saveToDataBase();
        // generate temple;
        generateTemplate();
        // send over network;
        sendMail();
        System.out.println("--------------------");
    }

    public static void saveToDataBase(/*user data input*/){
        Runnable runnable = ()->{
            try {
                System.out.println("Saving to Database.......");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("User Saved to Database........");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        new Thread(runnable).start();
    }
    public static void generateTemplate(/*user data input*/){
        Runnable runnable = ()->{
            try {
                System.out.println("Generating Template.......");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Template Generated........");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        new Thread(runnable).start();
    }
    public static void sendMail(/*user data input*/){
        Runnable runnable = ()->{
            try {
                System.out.println("Connecting to smtp server.......");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Mail is sending........");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        new Thread(runnable).start();
    }
}
