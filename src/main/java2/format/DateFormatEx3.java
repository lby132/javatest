package main.java2.format;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class DateFormatEx3 {
    public static void main(String[] args) {
        final SimpleDateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일");
        final SimpleDateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");

        try {
            final Date d = df.parse("2015년 11월 23일");
            System.out.println(df2.format(d));
        } catch (Exception e) {}
    }
}
