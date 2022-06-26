package main.casting;

public class InstanceofTest {
    public static void main(String[] args) {
        FireEngine fe = new FireEngine();

        if (fe instanceof FireEngine) {
            System.out.println("This is a FireEngin instance.");
        }

        if (fe instanceof Car) {
            System.out.println("This is a car instance.");
        }

        if (fe instanceof Object) {
            System.out.println("This is a object instance.");
        }

        System.out.println(fe.getClass().getName());  // 클래스의 이름을 출력
    }
}

