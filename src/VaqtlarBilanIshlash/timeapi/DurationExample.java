package VaqtlarBilanIshlash.timeapi;

import java.time.Duration;
import java.time.LocalDateTime;

public class DurationExample {
    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.of(2005,2,4,5,12);
        LocalDateTime now = LocalDateTime.now();
        Duration between = Duration.between(time, now);
        System.out.println(between);
    }
}
