package main.java2.time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class NewTimeEx4 {
    public static void main(String[] args) {
        final LocalDate date1 = LocalDate.of(2014, 1, 1);
        final LocalDate date2 = LocalDate.of(2015, 12, 31);

        final Period pe = Period.between(date1, date2);

        System.out.println("date1=" + date1);
        System.out.println("date2=" + date2);
        System.out.println("pe = " + pe);

        System.out.println("YEAR="+pe.get(ChronoUnit.YEARS));
        System.out.println("MONTHS="+pe.get(ChronoUnit.MONTHS));
        System.out.println("DAYS="+pe.get(ChronoUnit.DAYS));

        final LocalTime time1 = LocalTime.of(0, 0, 0);
        final LocalTime time2 = LocalTime.of(12, 34, 56);   // 12시간 34분 56초

        Duration du = Duration.between(time1, time2);

        System.out.println("time1=" + time1);
        System.out.println("time2=" + time2);
        System.out.println("du=" + du);

        final LocalTime tmpTime = LocalTime.of(0, 0).plusSeconds(du.getSeconds());

        System.out.println("HOUR=" + tmpTime.getHour());
        System.out.println("MINUTE=" + tmpTime.getMinute());
        System.out.println("SECOND=" + tmpTime.getSecond());
        System.out.println("NANO=" + tmpTime.getNano());
    }
}
