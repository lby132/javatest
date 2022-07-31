package main.java1.classtest;

public class Time {
    private int hour;
    private int minute;
    private float second;

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public float getSecond() {
        return second;
    }

    //들어온 값의 유효성을 검사하고 유효한 값일 때만 변경한다.

    public void setHour(int h) {
        if (h<0 || h>23) return;
        hour = h;
    }

    public void setMinute(int m) {
        if (m<0 || m>59) return;
        minute = m;
    }

    public void setSecond(float s) {
        if (s<0.0f || s>59.99f) return;
        second = s;
    }
}
