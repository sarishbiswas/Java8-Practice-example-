package DateTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeParseFormatExample {
    public static void parse(){
        String time = "13:20";
        LocalTime lt = LocalTime.parse(time,DateTimeFormatter.ISO_LOCAL_TIME);
        System.out.println(lt);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime lt1 = LocalTime.parse(time,dtf);
        System.out.println(lt1);
    }
    public static void format(){
        LocalTime localTime = LocalTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        String time = localTime.format(dateTimeFormatter);
        System.out.println(time);
    }

    public static void main(String[] args) {
        parse();
        format();
    }
}
