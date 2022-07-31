package main.java1.singleton;

public class Singleton {
    private static Singleton s = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (s == null)
            s = new Singleton();
        return s;
    }
}

class SingletonTest {
    public static void main(String[] args) {
        final Singleton instance = Singleton.getInstance();
    }
}