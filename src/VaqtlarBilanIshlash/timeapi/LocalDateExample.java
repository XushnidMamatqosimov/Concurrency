package VaqtlarBilanIshlash.timeapi;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(LocalDate.of(2024, 1,1).isLeapYear());
        System.out.println(now.plus(1, ChronoUnit.YEARS).isLeapYear());
        System.out.println(now.get(ChronoField.DAY_OF_MONTH));
        System.out.println(now.getDayOfMonth());
    }
}
