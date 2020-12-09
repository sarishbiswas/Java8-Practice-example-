package DateTime;

import java.time.*;
import java.util.SortedMap;

public class ZonedDateTimeExample {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("ZonedDateTime : "+zonedDateTime);
        System.out.println("Zone Offset : "+zonedDateTime.getOffset());
        System.out.println("Zone Id : "+zonedDateTime.getZone());

    /*    ZoneId.getAvailableZoneIds()
                .stream()
                .forEach(System.out::println);*/
        System.out.println(ZoneId.getAvailableZoneIds().size());

        //CST,EST,MST,PST
        System.out.println("Chicago CST : "+ZonedDateTime.now(ZoneId.of("America/Chicago")));
        System.out.println("Detroit EST : "+ZonedDateTime.now(ZoneId.of("America/Detroit")));
        System.out.println("LA PST : "+ZonedDateTime.now(ZoneId.of("America/Los_Angeles")));
        System.out.println("Denver MST : "+ZonedDateTime.now(ZoneId.of("America/Denver")));

        System.out.println("ZonedDateTime using Clock : "+
                ZonedDateTime.now(Clock.system(ZoneId.of("America/Chicago"))));
        LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("America/Chicago"));
        System.out.println("Chicago : "+localDateTime);

        LocalDateTime localDateTime1 = LocalDateTime.now(Clock.system(ZoneId.of("America/Detroit")));
        System.out.println("Detroit using clock : "+localDateTime1);

        LocalDateTime localDateTime2 = LocalDateTime.ofInstant(Instant.now(),ZoneId.systemDefault());
        System.out.println("LocalDateTime using Instant : "+localDateTime2);

        /**
         * Convert LocalDateTime to ZonedDateTime
         * */
        LocalDateTime localDateTime3 = LocalDateTime.now();
        ZonedDateTime zonedDateTime1 = localDateTime3.atZone(ZoneId.of("America/Chicago"));
        System.out.println(zonedDateTime1);
        ZonedDateTime zonedDateTime2 = Instant.now().atZone(ZoneId.of("America/Chicago"));
        System.out.println("Using Instant : "+zonedDateTime2);

        OffsetDateTime offsetDateTime = localDateTime3.atOffset(ZoneOffset.ofHours(-6));
        System.out.println("offsetDateTime : "+offsetDateTime);
    }
}
