package VaqtlarBilanIshlash.calendarProject;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Calendar {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2024, 3, 01);
        printCalendar(localDate);

    }

    private static void printCalendar(LocalDate localDate) {
        Month month = localDate.getMonth();
        int year = localDate.getYear();
        System.out.printf("%s %d %n", month, year);
        for (DayOfWeek value : DayOfWeek.values()) {
            System.out.printf("%s\t", value.name().substring(0, 2));
        }
        System.out.println(); // todo: "\n":

        int firstDay = localDate.getDayOfWeek().getValue() - 1;
        for (int i = 0; i < firstDay; i++) {
            System.out.printf("\t");
        }
        int days = month.length(localDate.isLeapYear());
        for (int day = 1; day < days; day++) {
            System.out.printf("%02d\t", day);
            if ((firstDay + day) % 7 == 0) System.out.println();
        }
    }
}
