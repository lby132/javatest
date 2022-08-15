package main.java2.threadex;

public class ThreadEx3 {
    public static void main(String[] args) throws Exception {
        ThreadEx3_1 t1 = new ThreadEx3_1();
        t1.run();
    }
}

class ThreadEx3_1 extends Thread {
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
// 이전 예제와 달리 쓰레드가 새로 생성되지 않았다. 단지 ThreadEx3_1클래스의 run()이 호출 되었을뿐이다.