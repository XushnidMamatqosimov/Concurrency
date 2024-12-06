package VaqtlarBilanIshlash.timeapi;

import java.time.*;

public class AdditionalTypesExample {
    public static void main(String[] args) {
        for (DayOfWeek value : DayOfWeek.values()) {
            System.out.println(value);
        }

        YearMonth yearMonth = YearMonth.of(2005, 02);
        System.out.println(yearMonth);
        MonthDay monthDay = MonthDay.of(2, 4);
        System.out.println(monthDay);
      //  OffsetTime offsetTime = OffsetTime.of(9, 12, 33,99, ZoneOffset.of(5,9));


    }
}
