package VaqtlarBilanIshlash.Task2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws ParseException {
       /* SimpleDateFormat instance = new SimpleDateFormat("dd/MM/yyyy");

        String date1 = "12/12/2012";

        Date parse = instance.parse(date1);
        System.out.println(parse);*/

        LocalTime localTime = LocalTime.of(12, 11);
        System.out.println(localTime);


      /*  LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        String formattedDate = today.format(formatter);
        System.out.println(formattedDate);*/

        LocalDate today = LocalDate.now();
        String format = today.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.println(format);
        LocalDate localDate = today.plusDays(10);
        LocalDate localDate1 = today.minusMonths(2);
        LocalDate localDate2 = today.plusYears(1);

        System.out.println("today = " + today);
        System.out.println("localDate = " + localDate);
        System.out.println("localDate1 = " + localDate1);
        System.out.println("localDate2 = " + localDate2);

        LocalDate date = LocalDate.of(2005,02,04);
        LocalDate date1 = LocalDate.now();
        System.out.println(date.getDayOfWeek());

        Period between = Period.between(date, date1);

        System.out.println("Years = " + between.getYears());
        System.out.println("Months = " + between.getMonths());
        System.out.println("Days = " + between.getDays());



    }

}
