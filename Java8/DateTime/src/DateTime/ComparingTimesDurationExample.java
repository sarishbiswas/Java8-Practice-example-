package DateTime;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ComparingTimesDurationExample {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.of(7,20);
        LocalTime localTime1 = LocalTime.of(8,20);
        long until = localTime.until(localTime1, ChronoUnit.MINUTES);
        System.out.println("LocalTime until : "+until);

        Duration duration = Duration.between(localTime,localTime1);
        System.out.println("Minutes : "+duration.toMinutes());

        Duration duration1 = Duration.ofHours(3);
        System.out.println("Duration of Hours : "+duration1.toMinutes());

    }
}
