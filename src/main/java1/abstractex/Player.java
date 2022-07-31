package main.java1.abstractex;

public abstract class Player {
    boolean pause;  // 일시정지 상태를 저장하기 위한 변수
    int currentPos; // 현재 Play되고 있는 위치를 저장하기 위한 변수

    Player() {
        pause = false;
        currentPos = 0;
    }

    /**
     * 지정된 위치(pos)에서 재생을 시작하는 기능이 수행하도록 작성되어야 한다.
     */
    abstract void play(int pos);

    /**
     * 재생을 즉시 멈추는 기능을 수행하도록 작성되어야 한다.
     */
    abstract void stop();

    void play() {
        play(currentPos); //추상메서드를 사용할 수 있다.
    }

    void pause() {
        if (pause) {
            pause = false;
            play(currentPos);
        } else {
            pause = true;
            stop();
        }
    }
}
