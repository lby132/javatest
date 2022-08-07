package main.java2.pasingformat;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormatterEx1 {
    public static void main(String[] args) {
        final ZonedDateTime zdateTime = ZonedDateTime.now();

        String[] patternArr = {
                "yyyy-MM-dd HH:mm:ss",
                "''yy년 MMM dd일 E요일",
                "yyyy-MM-dd HH:mm:ss.SSS z VV",
                "yyyy-MM-dd HH:mm:ss a",
                "오늘은 올 해의 D번째 날입니다.",
                "오늘은 이 달의 d번째 날입니다.",
                "오늘은 올 해의 w번째 주입니다.",
                "오늘은 이 달의 W번째 주입니다.",
                "오늘은 이 달의 W번째 E요일 입니다.",
        };

        for (String p : patternArr) {
            final DateTimeFormatter formatter = DateTimeFormatter.ofPattern(p);
            System.out.println(zdateTime.format(formatter));
        }
    }

}
