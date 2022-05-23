package main.classtest;

public class Tv {

    // Tv의 속성(멤버변수)
    String color;           // 색상
    boolean power;          // 전원상태 (on/off)
    int channel;            // 채널

    // Tv의 기능(메서드)
    void power() { // TV on/off 기능 하는 메서드
        power = !power;
    }

    void channelUp() {
        ++channel;
    }

    void channelDown() {
        --channel;
    }
}
