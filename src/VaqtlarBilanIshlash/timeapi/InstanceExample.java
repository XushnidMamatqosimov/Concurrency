package VaqtlarBilanIshlash.timeapi;

import java.time.Instant;

public class InstanceExample {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);
        int nano = now.getNano();
        System.out.println(nano);
    }
}
