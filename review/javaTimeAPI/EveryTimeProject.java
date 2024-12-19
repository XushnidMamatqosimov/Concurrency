package javaTimeAPI;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;

public class EveryTimeProject {
    public static void main(String[] args) {
        int counter = 0;
        while (true) {
            try {
                if (counter < 10) {
                    Thread thread = new Thread();
                    LocalDateTime localDateTime = LocalDateTime.now();
                    DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("HH:mm:ss");
                    String format1 = localDateTime.format(dateTimeFormatter1);
                    Thread.sleep(1000);
                    System.out.println(format1);
                    counter++;
                }
                else {
                    System.err.println("Time is ended");
                    break;
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
