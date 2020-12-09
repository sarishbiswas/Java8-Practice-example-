package DateTime;

import java.time.Duration;
import java.time.Instant;

public class InstantExample {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant.getEpochSecond());

        Instant instant1 = Instant.ofEpochSecond(0);
        System.out.println(instant1);

        Duration duration = Duration.between(instant1,instant);
        System.out.println(duration.toDays());
    }
}
