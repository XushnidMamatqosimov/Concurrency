package javaTimeAPI;

import java.sql.Time;
import java.time.*;
import java.time.temporal.ChronoField;
import java.util.Arrays;
import java.util.Date;
import java.util.TimeZone;
import java.util.spi.TimeZoneNameProvider;

public class
ProblemsSolving {
    public static void main(String[] args) {
       /* LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime1 = localDateTime.minusHours(2);
        System.out.println(localDateTime);
        System.out.println(localDateTime1);*/


        /*LocalDateTime now = LocalDateTime.now();
        LocalDateTime from = LocalDateTime.of(2005, 02, 04, 5, 15);

        Duration duration = Duration.between(from, now);
        System.out.println(duration);*/

        /*LocalDate from = LocalDate.of(2005, 02, 04);
        LocalDate now = LocalDate.now();

        Period between = Period.between(from, now);
        System.out.println(between);*/

       /* LocalDateTime now1 = LocalDateTime.now();
        String[] timeZone = TimeZone.getAvailableIDs();
        TimeZone timeZone1 = TimeZone.getTimeZone("Africa/Asmara");
        TimeZone timeZone2 = TimeZone.getTimeZone("Uzbekistan/Tashkent");
        System.out.println(timeZone2);
        System.out.println(timeZone1);*/
        // System.out.println(Arrays.toString(timeZone));


        //System.out.println(ZonedDateTime.now(ZoneId.of("America/Los_Angeles")));
        System.out.println(ZonedDateTime.now(ZoneId.of("Europe/London")));
        System.out.println(ZonedDateTime.now(ZoneId.of("Asia/Tokyo")));

        // System.out.println(ZonedDateTime.now(ZoneId.of("Africa/Asmara")));


        int year = 2028;
        boolean leap = Year.of(year).isLeap();
        System.out.println(leap);


    }
}
