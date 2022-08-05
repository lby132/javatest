package main.java2.time;

import java.time.*;

public class NewTimeEx2 {
    public static void main(String[] args) {
        final LocalDate date = LocalDate.of(2015, 12, 31);
        final LocalTime time = LocalTime.of(12, 34, 56);

        // 2015년 12월 31일 12시 34분 56초
        LocalDateTime dt = LocalDateTime.of(date, time);

        ZoneId zid = ZoneId.of("Asia/Seoul");
        ZonedDateTime zdt = dt.atZone(zid);
        // String strZid = zdt.getZone().getId();

        final ZonedDateTime seoulTime = ZonedDateTime.now();
        final ZoneId nyId = ZoneId.of("America/New_York");
        final ZonedDateTime nyTime = ZonedDateTime.now().withZoneSameInstant(nyId);

        // ZonedDateTime -> OffsetDateTime
        final OffsetDateTime odt = zdt.toOffsetDateTime();

        System.out.println(dt);
        System.out.println(zid);
        System.out.println(zdt);
        System.out.println(nyTime);
        System.out.println(odt);
    }
}
