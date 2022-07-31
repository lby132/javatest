package main.java1.exception;

public class ExceptionEx5 {
    public static void main(String[] args) {
        throw new RuntimeException(); // 컴파일시엔 오류가 안나지만 런타임시 에러 발생
        // throw new Exception(); // 컴파일시에 에러 발생
    }
}
