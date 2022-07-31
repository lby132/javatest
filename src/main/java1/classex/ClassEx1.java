package main.java1.classex;

public class ClassEx1 {
    public static void main(String[] args) throws Exception {
        final Card c = new Card("HEART", 3);
        final Card c2 = Card.class.newInstance();   //class객체를 통해 객체 생성

        Class cObj = c.getClass();

        System.out.println(c);
        System.out.println(c2);
        System.out.println(cObj.getName());
        System.out.println(cObj.toGenericString());
        System.out.println(cObj.toString());
    }
}

class Card {
    String kind;
    int num;

    public Card() {
        this("SPADE", 1);
    }

    public Card(String kind, int num) {
        this.kind = kind;
        this.num = num;
    }

    public String toString() {
        return kind + ":" + num;
    }
}
