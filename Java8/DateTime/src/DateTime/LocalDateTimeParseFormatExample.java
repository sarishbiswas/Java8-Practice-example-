package DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeParseFormatExample {
    public static void parse(){
        String str = "2020-09-20T10:23:30";
        LocalDateTime localDateTime = LocalDateTime.parse(str, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println(localDateTime);
        /**
         * Custom Format
         * */
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
        LocalDateTime localDateTime1 = LocalDateTime.parse(str,dateTimeFormatter);
        System.out.println(localDateTime1);
    }
    public static void format(){
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("'Date : 'dd/MM/yyyy' Time: 'HH:mm");
        String dateTime = localDateTime.format(dateTimeFormatter);
        System.out.println(dateTime);
    }

    public static void main(String[] args) {
        parse();
        format();
    }
}
