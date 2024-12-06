package VaqtlarBilanIshlash.Task3;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        while (true) {
            String format = LocalTime.now().format(dateTimeFormatter);
            System.out.println("Hozirgi vaqt: " + format);

            try {
                Thread.sleep(60000);
            } catch (InterruptedException e) {
                System.out.println("Error:  " + e.getMessage());
                Thread.currentThread().interrupt();
            }
        }
    }

        /*while (true) {
            extracted(minute, now);
        }
    }*/

    private static int extracted(int minute, LocalTime now) {
        if (minute == now.getMinute()) {
            System.out.println(minute);
            return minute;
        } else {
            System.out.println(now.getMinute());
        }
        return 0;
    }
}
