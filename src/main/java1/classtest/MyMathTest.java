package main.java1.classtest;

public class MyMathTest {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        long result1 = mm.add(5, 3);
        long result2 = mm.subtract(5L, 3L);
        long result3 = mm.multiply(5L, 3L);
        double result4 = mm.divide(5L, 3L);

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);
        System.out.println("result4 = " + result4);
    }
}

class MyMath {
    int add(int a, int b) {
        return a + b;
    }

    long subtract(long a, long b) {
        return a - b;
    }

    long multiply(long a, long b) {
        return a * b;
    }

    //long 타입 으로 인자값을 넘겨줘도 divide 메소드에서의 매개변수는 double 타입으로 자동 형변환이 되어 값이 저장된다.
    double divide(double a, double b) {
        return a / b;
    }

}
