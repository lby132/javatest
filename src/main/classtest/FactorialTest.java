package main.classtest;

public class FactorialTest {
    public static void main(String[] args) {
        int result = factorial(3);

        System.out.println("result = " + result);
    }

//    static int factorial(int n) {
//        int result = 0;
//
//        if (n == 1)
//            result = 1;
//        else
//            result = n * factorial(n - 1); // 다시 메서드 자신을 호출한다.
//        return result;
//    }

     static int factorial(int n) {
        if (n==1) return 1;
        return n * factorial(n - 1);
    }
}
