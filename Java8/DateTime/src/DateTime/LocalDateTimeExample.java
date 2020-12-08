package DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalDateTimeExample {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("now() : "+localDateTime);
        LocalDateTime localDateTime1 = LocalDateTime.of(2020,12,9,3,36,00,33);
        System.out.println("of() : "+localDateTime1);
        LocalDateTime localDateTime2 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println("Getting from LocalDate and LocalTime : "+localDateTime2);
        /**
         * Getting all values from LocalDateTime
         * */
        System.out.println("getHour : "+localDateTime.getHour());
        System.out.println("ChronoFieldYear : "+localDateTime.get(ChronoField.YEAR));

        /**
         * Modify LocalDateTime
         * */
        System.out.println("plusDays : "+localDateTime.plusDays(2));
        System.out.println("minusHours : "+localDateTime.minusHours(1));
        System.out.println("withMonth : "+localDateTime.withMonth(5));

        /**
         * Converting LocalDate and LocalTime to LocalDateTime and vice-versa
         * */
        LocalDate ld = LocalDate.of(2020,12,9);
        LocalDateTime ldt1 = ld.atTime(3,45);
        System.out.println(ldt1);

        LocalTime lt = LocalTime.of(12,55,33,30);
        LocalDateTime ldt2 = lt.atDate(ld);
        System.out.println(ldt2);

        LocalDateTime ldt = LocalDateTime.now();
        LocalDate ld1 = ldt.toLocalDate();
        System.out.println(ld1);
        LocalTime lt1 = ldt.toLocalTime();
        System.out.println(lt1);
    }
}
