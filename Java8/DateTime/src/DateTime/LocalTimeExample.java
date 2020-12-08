package DateTime;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample {
    public static void main(String[] args) {
        //now() of()
        LocalTime localTime = LocalTime.now();
        System.out.println("now() : "+localTime);
        LocalTime localTime1 = LocalTime.of(20,30);
        System.out.println("of() : "+localTime1);
        LocalTime localTime2 = LocalTime.of(12,30,30);
        System.out.println("now() : "+localTime2);

        /**
         * Get values from LocalTime
         * */
        System.out.println("getHour() : "+localTime.getHour());
        System.out.println("getMinute() : "+localTime.getMinute());
        System.out.println("getHour() : "+localTime.get(ChronoField.CLOCK_HOUR_OF_DAY));
        /**
         * Modify values of LocalTime
         * */
        System.out.println("minusHours : "+localTime.minusHours(2));
        System.out.println("ChronoUnit : "+localTime.minus(1,ChronoUnit.HOURS));
        System.out.println("midnight : "+localTime.with(LocalTime.MIDNIGHT));
        System.out.println("HOUR_OF_DAY : "+localTime.with(ChronoField.HOUR_OF_DAY,22));
        System.out.println("plusMinutes : "+localTime.plusMinutes(30));
        System.out.println("withHour : "+localTime.withHour(20));
    }
}
