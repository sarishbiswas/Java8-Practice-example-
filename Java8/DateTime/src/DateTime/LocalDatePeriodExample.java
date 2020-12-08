package DateTime;

import java.time.LocalDate;
import java.time.Period;

public class LocalDatePeriodExample {

    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.of(2020,9,1);
        LocalDate ld2 = LocalDate.of(2020,10,1);
        Period p1 = ld1.until(ld2);
        System.out.println(p1.getYears()+" : "+p1.getMonths()+" : "+p1.getDays());

        Period p2 = Period.ofDays(10);
        System.out.println(p2.getDays());

        Period p3 = Period.ofYears(10);
        System.out.println(p3.getYears());
        System.out.println(p3.toTotalMonths());

        Period period = Period.between(ld1,ld2);
        System.out.println(period.getYears()+" : "+period.getMonths()+" : "+period.getDays());

    }
}
