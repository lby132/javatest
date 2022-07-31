package main.java1.casting;

public class BindingTest {
    public static void main(String[] args) {
        Parent p = new Child();
        Child c = new Child();

        System.out.println("p.x = " + p.x2);
        p.method();
        System.out.println("c.x = " + c.x);
        c.method();
    }
}

class Parent {
    int x2 = 100;

    void method() {
        System.out.println("Parent Method");
    }
}

class Child extends Parent {
    int x = 200;

    void method() {
        System.out.println("Child Method");
    }
}
