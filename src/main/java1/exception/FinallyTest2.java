package main.java1.exception;

public class FinallyTest2 {
    public static void main(String[] args) {
        FinallyTest2.method1();
        System.out.println("method1()의 수행을 마치고 main메서드로 돌아왔습니다.");
    }

    static void method1() {
        try {
            System.out.println("method1() 이 호출 되었습니다.");
            return ; //현재 실행중인 메서드 종료
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("method1()의 finally블럭이 실행 되었습니다.");
        }
    }
}
