package VaqtlarBilanIshlash.timeapi;

import java.time.LocalDate;
import java.time.Period;

public class PeriodExample {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2005, 02, 04);
        LocalDate now = LocalDate.now();
        Period between = Period.between(localDate, now);
        System.out.println(between);
        Period month = Period.ofMonths(45);
        System.out.println(month.toTotalMonths());
    }
}
