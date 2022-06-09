package main.constructor;

public class CarTest2 {
    public static void main(String[] args) {
        final Car2 c1 = new Car2();
        final Car2 c2 = new Car2("blue");

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
    }
}
