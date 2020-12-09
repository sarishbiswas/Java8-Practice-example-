package DateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class DateToLocalDateExample {
    public static void main(String[] args) {
        /**
         * java.util.Date to LocalDate and vice versa
         * */
        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        System.out.println("LocalDate from util Date : "+localDate);
        Date date1 = new Date()
                .from(localDate
                        .atTime(LocalTime.now())
                        .atZone(ZoneId.systemDefault())
                        .toInstant());
        System.out.println("LocalDate to date : "+date1);
        /**
         * java.sql.Date to LocalDate and vice versa
         * */
        java.sql.Date date2 = java.sql.Date.valueOf(localDate);
        System.out.println("java.sql.Date : "+date2);
        LocalDate localDate1 = date2.toLocalDate();
        System.out.println("sql.Date to LocalDate : "+localDate1);
    }
}
