package main.extend;

public class PointTest2 {
    public static void main(String[] args) {
        final Point4D p3 = new Point4D();
        System.out.println("p3.x = " + p3.x);
        System.out.println("p3.y = " + p3.y);
        System.out.println("p3.z = " + p3.z);
    }
}

class Point3 {
    int x=10;
    int y=20;

    public Point3(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Point4D extends Point3 {
    int z = 30;

    public Point4D() {
        this(100, 200, 300);    // Point4D(int x, int y, int z)를 호출한다.
    }

    public Point4D(int x, int y, int z) {
        super(x, y);    // Point3(int x, int y)를 호출한다.
        this.z = z;
    }
}
