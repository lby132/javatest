package main.java1.innerclass;

class Outer1 {
    int value = 10; // Outer.this.value

    class Inner {
        int value = 20; // this.value

        void method1() {
            int value = 30;
            System.out.println("           value :" + value);
            System.out.println("      this.value :" + this.value);
            System.out.println("Outer.this.value :" + Outer1.this.value);
        }
    }
}

public class InnerEx5 {
    public static void main(String[] args) {
        Outer1 outer = new Outer1();
        final Outer1.Inner inner = outer.new Inner();
        inner.method1();
    }
}
