package main.java2.threadex;

public class ThreadEx10 implements Runnable {
    static boolean autoSave = false;

    public static void main(String[] args) {
        final Thread t = new Thread(new ThreadEx10());
        t.setDaemon(true);      // 이부분이 없으면 종료되지 않는다.
        t.start();

        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
                System.out.println(i);

                if (i == 5) {
                    autoSave = true;
                }
        }
        System.out.println("프로그램을 종료합니다.");
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(3 * 1000); // 3초 마다
            } catch (Exception e) {}

            //autoSave의 값이 true이면 autoSave()를 호출한다.
            if (autoSave) {
                autoSave();
            }
        }
    }

    public void autoSave() {
        System.out.println("작업파일이 자동 저장 되었습니다.");
    }
}
