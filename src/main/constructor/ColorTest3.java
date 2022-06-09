package main.constructor;

public class ColorTest3 {
    public static void main(String[] args) {
        final Car3 c1 = new Car3();
        final Car3 c2 = new Car3(c1);

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);

        c1.door = 100; // c1의 인스턴스변수 door의 값을 변경한다.
        System.out.println("c1.door=100; 수행 후");
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
    }
}
