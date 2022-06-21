package main.extend;

public class SuperTest2 {
    public static void main(String[] args) {
        final Chlid2 c = new Chlid2();
        c.method();
    }
}

class Parent2 {
    int x = 10;
}

class Chlid2 extends Parent {
    int x = 20;

    void method() {
        System.out.println("x=" + x);
        System.out.println("this.x=" + this.x);
        System.out.println("super.x=" + super.x);
    }
}
