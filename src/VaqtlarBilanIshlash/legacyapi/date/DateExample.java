package VaqtlarBilanIshlash.legacyapi.date;

import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        Date currentTime = new Date();
        System.out.println(currentTime);
        // currentTime.setTime(2500000000000L);
        //System.out.println(currentTime);

        Date blockedTill = new Date(System.currentTimeMillis() -2 * 60 * 1000);
        System.out.println(currentTime);
        System.out.println(blockedTill);
        if (currentTime.before(blockedTill))
            System.out.println("You are blocked for 20 minutes;");
        else System.out.println("Welcome;");

    }

}
