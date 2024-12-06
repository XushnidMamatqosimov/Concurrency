package VaqtlarBilanIshlash.Task1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Date Classi bilan : " + date);
        Calendar instance = Calendar.getInstance();
        Date time = instance.getTime();
        System.out.println("Calendar Classi bilan : " + time);
        LocalDate now = LocalDate.now();
        System.out.println("LocalDate Classi bilan : " + now);
        DateFormat dateTimeInstance = SimpleDateFormat.getDateTimeInstance();
        TimeZone timeZone = dateTimeInstance.getTimeZone();
        System.out.println(timeZone);
        LocalTime now1 = LocalTime.now();
        System.out.println("Local Time Class : " + now1);
        LocalDateTime now2 = LocalDateTime.now();
        System.out.println("Local Date Time: " + now2);

    }
}
