package main.casting;

public class BindingTest2 {
    public static void main(String[] args) {
        Parent1 p = new Child2();
        Child2 c = new Child2();

        System.out.println("p.x = " + p.x);
        p.method();
        System.out.println();
        System.out.println("c.x = " + c.x);
        c.method();
    }
}

class Parent1 {
    int x = 100;    // 자식과 동일한 변수이름이지만 참조 변수 타입에 맞게 출력됨(맴버변수는 상속에 영향받지 않고 뭘 참조하고 있느냐만 영향을 받음
                    // Parent1을 참조하고 있기 때문에 자식의 영향을 받지않고 그대로 100이 출력된다.)

    void method() {
        // 자식 클래스에서 오버라이딩 해서 자식클래스의 method() 가 실행되기 때문에 출력하지 않음
        System.out.println("Parent1 Method");

    }
}

class Child2 extends Parent1 {
    int x = 200;

    void method() {
        System.out.println("x=" + x); // this.x 와 같다.
        System.out.println("super.x=" + super.x);
        System.out.println("this.x=" + this.x);
    }
}