package VaqtlarBilanIshlash.timeapi;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeExample {
    public static void main(String[] args) {
        System.out.println(ZonedDateTime.now(ZoneId.of("America/Los_Angeles")));
        //ZoneId.getAvailableZoneIds().forEach(System.out::println);
    }
}
