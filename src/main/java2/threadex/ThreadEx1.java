package main.java2.threadex;

public class ThreadEx1 {
    public static void main(String[] args) {
        final ThreadEx1_1 t1 = new ThreadEx1_1();

        final Runnable r = new ThreadEx1_2();
        Thread t2 = new Thread(r);  // 생성자 Thread(Runnable target)

        t1.start();
        t2.start();
    }
}

class ThreadEx1_1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("thread extends = " + getName());  // 조상인 Thread의 getName()를 호출
        }
    }
}

class ThreadEx1_2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            // Thread.currentThread() - 현재 실행중인 Thread를 반환한다.
            System.out.println("runnable = " + Thread.currentThread().getName());
        }
    }
}
