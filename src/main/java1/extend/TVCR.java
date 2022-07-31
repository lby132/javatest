package main.java1.extend;

// 클래스 설명: 다중 상속이 불가능 하기 때문에 그 문제를 해결하기 위해 상속과 포함관계를 접목 시켰다.
// 이렇게 함으로써 TV를 상속함으로써 Tv클래스의 값도 얻을수 있고 밑에 보듯이 VCR의 값이 변경되더라고 TVCR클래스의 메서스들도 변경된 내용이 적용되는 결과를 얻을 수 있게 되었다
// 다중상속 불가로 단일상속+포함관계로 해결
public class TVCR extends Tv{
    VCR vcr = new VCR();

    void play() {
        vcr.play();
    }

    void stop() {
        vcr.stop();
    }

    void rew() {
        vcr.rew();
    }

    void ff() {
        vcr.ff();
    }
}

class Tv {
    boolean power;
    int channel;

    void power() {
        power = !power;
    }

    void channelUp() {
        ++channel;
    }

    void channelDown() {
        --channel;
    }
}

class VCR {
    boolean power;
    int counter = 0;

    void power() {
        power = !power;
    }

    void play() {
        /* 내용생략 */
    }

    void stop() {
        /* 내용생략 */
    }

    void rew() {
        /* 내용생략 */
    }

    void ff() {
        /* 내용생략 */
    }
}


