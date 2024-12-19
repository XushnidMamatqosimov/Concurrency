package javaTimeAPI;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;

public class Main {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        // todo; Sana va vaqtni formatlash;
        LocalDateTime now1 = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy  HH:mm:ss");
        String currentTime = now1.format(dateTimeFormatter);
        System.out.println(currentTime);


    }
}
