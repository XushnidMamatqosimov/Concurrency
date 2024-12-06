package VaqtlarBilanIshlash.Task4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        String date = "12-12-2012";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate parse = LocalDate.parse(date, dateTimeFormatter);
        System.out.println(parse);



       /* LocalDate localDate2 = LocalDate.ofYearDay(2012,125);
        System.out.println(localDate2);*/
    }
}
