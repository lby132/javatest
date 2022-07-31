package main.java1.extend;

public class Review {
    public static void main(String[] args) {
        Point[] p = {new Point(100, 100),
                new Point(140, 50),
                new Point(200, 100)
        };
        Triangle2 t = new Triangle2(p);
        final Circle2 c = new Circle2(new Point1(150, 150), 50);

        t.draw();
        c.draw();
    }
}

class Shape2 {
    String color = "black";

    void draw() {
        System.out.printf("[color=%s]%n", color);
    }
}

class Point1 {
    int x;
    int y;

    public Point1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point1() {
        this(0, 0);
    }

    String getXy() {
        return "(" + x + "," + y + ")";
    }
}

class Circle2 extends Shape2 {
    Point1 center;
    int r;

    public Circle2() {
        this(new Point1(0, 0), 100);
    }

    public Circle2(Point1 center, int r) {
        this.center = center;
        this.r = r;
    }

    void draw() {
        System.out.printf("[center=(%d, %d), r=%d, color=%s]%n",
                            center.x, center.y, r, color);
    }
}

class Triangle2 extends Shape {
    Point[] p = new Point[3];

    public Triangle2(Point[] p) {
        this.p = p;
    }

    void draw() {
        System.out.printf("p1=%s, p2=%s, p3=%s, color=%s]%n",
                    p[0].getXy(), p[1].getXy(), p[2].getXy(), color);
    }
}

