package main.classtest;

public class PrimitiveParamEx {
    public static void main(String[] args) {
        final Data1 d = new Data1();
        d.x = 10; // 10을 선언
        System.out.println("main() : x = " + d.x);

        change(d.x); // change 함수에 10이 담긴 x를 넣어줌
        System.out.println("After change(d.x)");
        System.out.println("main() : d.x = " + d.x);
    }

    static void change(int x) {
        x = 1000;  // 위에서 넘겨준 x를 받아서 1000으로 값을 넣어줌
        System.out.println("change(): x = " + x);
    }
}

class Data {
    int x;
}
