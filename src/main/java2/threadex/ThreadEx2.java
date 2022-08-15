package main.java2.threadex;

public class ThreadEx2 {
    public static void main(String[] args) throws Exception {
        final ThreadEx2_1 t1 = new ThreadEx2_1();
        t1.start();
    }
}

class ThreadEx2_1 extends Thread {
    @Override
    public void run() {
        throwException();
    }

    public void throwException() {
        try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


// 고의로 에러를 발생 시켜서 printStackTrace()를 이용해서 예외가 발생한 당시 호출 스택을 확인하는 예제임.
// 호출스택의 첫번째 메서드가 main메서드가 아니라 run메서드인것을 확인하자.
// 한 쓰레드가 종료 되어도 다른 쓰레드의 실행에는 영향을 미치지 않는다. main쓰레드의 호출 스택이 없는 이유는 main쓰레드가 이미 종료되었기 때문이다.