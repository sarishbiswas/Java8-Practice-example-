package DateTime;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExample {
    public static void main(String[] args) {
        //now()
        LocalDate localDate = LocalDate.now();
        System.out.println("LocalDate.now() : "+localDate);
        //of()
        LocalDate localDate1 = LocalDate.of(2020,12,10);
        System.out.println("LocalDate.of() : "+localDate1);
        //ofYearDay()
        LocalDate localDate2 = LocalDate.ofYearDay(2020,365);
        System.out.println("LocalDate.ofYearDay() : "+localDate2);
        /**
         * Get values from localDate
         * */
        System.out.println("getMonth : "+localDate.getMonth());
        System.out.println("getDayOfWeek : "+localDate.getDayOfWeek());
        System.out.println("dayOfWeek : "+localDate.get(ChronoField.DAY_OF_WEEK));

        /**
         * Modify LocalDate
         * */
        System.out.println("Plus Days: "+localDate.plusDays(2));
        System.out.println("Plus Months: "+localDate.plusMonths(2));
        System.out.println("minus Days: "+localDate.minusDays(2));
        System.out.println(localDate.minus(1, ChronoUnit.DAYS));
        System.out.println("change Year : "+localDate.withYear(2018));
        System.out.println("Change Year ChoronoField : "+localDate.with(ChronoField.YEAR,2018));
        System.out.println("first day of next monthTemporal : "+localDate.with(TemporalAdjusters.firstDayOfNextMonth()));

        /**
         * Additional Methods
         * */
        System.out.println("isSupported : "+localDate.isSupported(ChronoUnit.DAYS));
        System.out.println("isLeapYear : "+localDate.isLeapYear());
        System.out.println("isAfter : "+localDate.isAfter(localDate1));
        System.out.println("isBefore : "+localDate.isBefore(localDate1));
        System.out.println("isEqual : "+localDate.isEqual(localDate1));
    }
}
