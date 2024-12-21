package Threads.threadSovling.project1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        int counter = 0;
        while (counter<60){
            LocalDateTime localDateTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            String format = formatter.format(localDateTime);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(format);
            counter++;
        }
        System.out.println("Your 1 minute is ended :(");


    }
}
