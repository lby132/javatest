package main.java1.exception;

public class ExceptionEx4 {
    public static void main(String[] args) {


        try {
            final Exception e = new Exception("고의로 발생시켰음");
            throw e;
            // throw new Exception("고의로 발생시켰음"); // 위 코드를 이렇게 한줄로 줄일 수 있다.
        } catch (Exception e) {
            System.out.println("에러 메시지 : " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램이 정상 종료 되었습니다.");
    }
}
