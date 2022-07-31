package main.java1.innerclass;

public class InnerEx3 {
    private int outerIv = 0;
    private static int outerCv = 0;

    class instanceInner {
        int iiv = outerIv; // 외부 클래스의 private멤버도 접근가능하다.
        int iiv2 = outerCv;
    }

    static class StaticInner {
        // 스태틱 클래스는 외부 클래스의 인스턴스멤버에 접근할 수 없다.
        // int siv = outerIv;
        static int scv = outerCv;
    }

    void myMethod() {
        int Iv = 0;
        final int LV = 0;   // JDK1.8부터 final 생략가능

        class LocalInner {
            int liv = outerIv;
            int liv2 = outerCv;
            // 외부클래스의 지역변수는 final이 붙은 변수(상수)만 접근이 가능하다.
               int liv3 = Iv;   // JDK1.8 이하 버전에서는 변수 앞에 final을 지정해주지 않으면 에러난다. 나는 JDK1.8이상이라 에러가 발생하지 않는다.
               int liv4 = LV;
        }
    }


}
