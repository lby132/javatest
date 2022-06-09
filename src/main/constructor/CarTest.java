package main.constructor;

public class CarTest {
    public static void main(String[] args) {
        final Car car = new Car();

        car.color = "white";
        car.gearType = "auto";
        car.door = 4;

        final Car car1 = new Car("white", "auto", 4);

        System.out.println("car = " + car);
        System.out.println("car1 = " + car1);
    }
}
