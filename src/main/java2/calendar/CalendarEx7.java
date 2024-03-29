package main.java2.calendar;

import java.util.Calendar;

public class CalendarEx7 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage : java CalendarEx7 2015 11");
            return ;
        }

        int year = Integer.parseInt(args[0]);
        int month = Integer.parseInt(args[1]);

        Calendar sDay = Calendar.getInstance();
        Calendar eDay = Calendar.getInstance();

        sDay.set(year, month - 1, 1);
        // 입력 월의 말일로 설정한다.
        eDay.set(year, month-1, sDay.getActualMaximum(Calendar.DATE));
        // 1일이 속한 주의 일요일로 날짜 설정
        sDay.add(Calendar.DATE, -sDay.get(Calendar.DAY_OF_WEEK) + 1);
        // 말일이 속한 주의 토요일로 날짜 설정
        eDay.add(Calendar.DATE, 7 - eDay.get(Calendar.DAY_OF_WEEK));

        System.out.println("    " + year + "년 " + month + "월");
        System.out.println(" SU MO TU WE TH FR SA");

        // 시작 부터 마지막 일까지(sDay <= eDay) 1일씩 증가시키면서 일(Calendar.DATE)을 출력
        for (int n = 1; sDay.before(eDay) || sDay.equals(eDay); sDay.add(Calendar.DATE, 1)) {
            int day = sDay.get(Calendar.DATE);
            System.out.println((day < 10) ? " " + day : " " + day);
            if (n++%7==0) System.out.println(); // 7일치를 찍고 나서 줄을 바꾼다.
        }
    }
}
