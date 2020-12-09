package DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatParseLocalDateExample {
    public static void parseLocalDate(){
        String d1 = "2020/09/30";
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate ld1 = LocalDate.parse(d1,dtf1);
        System.out.println(ld1);
        String d2 = "30-09-2020";
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate ld2 = LocalDate.parse(d2,dtf2);
        System.out.println(ld2);
    }
    public static void formatLocalDate(){
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate ld1 = LocalDate.now();
        String date = ld1.format(dtf1);
        System.out.println(date);
    }

    public static void main(String[] args) {
        parseLocalDate();
        formatLocalDate();
    }
}
