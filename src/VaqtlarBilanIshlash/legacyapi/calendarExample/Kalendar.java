package VaqtlarBilanIshlash.legacyapi.calendarExample;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Kalendar {
    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();
        Calendar calendar = new GregorianCalendar();
        Date time = instance.getTime();
        System.out.println(time);
        int i = instance.get(Calendar.MONTH);
        System.out.println(i);

        System.out.println("instance.get(Calendar.YEAR) = " + instance.get(Calendar.YEAR));

        instance.setLenient(false);
        // instance.add(Calendar.DATE, 5);
        instance.set(Calendar.DATE, 99);
        // instance.roll(Calendar.DATE, 99);
        System.out.println("instance.getTime() = " + instance.getTime());
    }
}
