package main.interfaceex;

public class interFaceTest {
    public static void main(String[] args) {
        final A a = new A();
        a.methodA(new B());
    }

}

class A {
    public void methodA(B b) {
        b.methodB();
    }
}

class B {
    public void methodB() {
        System.out.println("methodB");
    }
}
