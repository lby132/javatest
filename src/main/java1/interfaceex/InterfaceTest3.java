package main.java1.interfaceex;

public class InterfaceTest3 {
    public static void main(String[] args) {
        final A2 a = new A2();
        a.methodB();
    }
}

class A2 {
    void methodB() {
       I2 i = InstanceManager.getInstance();
       i.methodB();
        System.out.println(i.toString());
    }
}

interface I2 {
    public abstract void methodB();
}

class B2 implements I2 {
    public void methodB() {
        System.out.println("B2.methodB");
    }

    public String toString() {
        return "class B";
    }
}

class InstanceManager {
    public static I2 getInstance() {
        return new B2();
    }
}




