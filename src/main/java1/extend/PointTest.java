package main.java1.extend;

public class PointTest {
    public static void main(String[] args) {
        final Point3D p3 = new Point3D(1, 2, 3);
    }
}

class Point2 {
    int x, y;

    public Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    String getLocation() {
        return "x :" + x + ", y :" + y;
    }
}

class Point3D extends Point2{
    int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.x = x;
        this.y = y;
        this.z = z;
    }

    String getLocation() {  //  오버라이딩
        return "x :" + x + ", y :" + y + ", z :" + z;
    }
}


