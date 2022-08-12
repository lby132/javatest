package main.java2.generics;

import java.util.ArrayList;

class Fruit2 {public String toString() {return "Fruit";}}
class Apple2 extends Fruit2 {public String toString() {return "Apple";} }
class Grape2 extends Fruit2 {public String toString() {return "Grape";}}

class Juice {
    String name;

    Juice(String name) {this.name = name + "Juice";}
    public String toString() { return name; }
}

class Juicer {
    static Juice makeJuice(FruitBox3<? extends Fruit2> box) {
        String tmp = "";

        for (Fruit2 f : box.getList()) {
            tmp += f + " ";
        }
        return new Juice(tmp);
    }
}

public class FruitBoxEx3 {
    public static void main(String[] args) {
        FruitBox3<Fruit2> fruitBox = new FruitBox3<Fruit2>();
        FruitBox3<Apple2> appleBox = new FruitBox3<Apple2>();

        fruitBox.add(new Apple2());
        fruitBox.add(new Grape2());
        appleBox.add(new Apple2());
        appleBox.add(new Apple2());

        System.out.println(Juicer.makeJuice(fruitBox));
        System.out.println(Juicer.makeJuice(appleBox));
    }
}

class FruitBox3<T extends Fruit2> extends Box2<T>{}

class Box2<T> {
    ArrayList<T> list = new ArrayList<T>();
    void add(T item) { list.add(item);}
    T get(int i) { return list.get(i); }
    ArrayList<T> getList() { return list; }
    int size() { return list.size(); }
    public String toString() { return list.toString(); }
}