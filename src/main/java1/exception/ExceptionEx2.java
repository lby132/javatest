package main.java1.exception;

public class ExceptionEx2 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(1/0);    // 0으로 나누려고 하면 ArithmeticException 이 발생해서 다음 코드를 실행하지 않고 catch블럭으로 이동해서 자신에 맞는 Exception타입을 찾아서 맞으면 예외처리를 해주고 없으면 예외처리가 불가능해져 오류를 발생시킨다.
            System.out.println(4);
        } catch (Exception e) {
            System.out.println(5);
        }
        System.out.println(6);
    }
}
