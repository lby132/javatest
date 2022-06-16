package main.extend;

public class DeckReview {
    public static void main(String[] args) {
        Deck2 d = new Deck2();    // 카드 한 벌(Deck)을 만든다.
        Card2 c = d.pick(0); // 섞기 전에 제일 위의 카드를 뽑는다.
        System.out.println(c);  // System.out.println(c.toString());과 같다.

        d.shuffle();    // 카드를 섞는다.
        c = d.pick(0);  // 섞은 후에 제일 위의 카드를 뽑는다.
        System.out.println(c);
    }
}

class Deck2 {
    final int CARD_NUM = 52;
    Card2[] carArr = new Card2[CARD_NUM];

    public Deck2() {
        int i = 0;

        for (int k=Card.KIND_MAX; k>0; k--)
            for (int n=0; n<Card.NUM_MAX; n++)
                carArr[i++] = new Card2(k, n+1);
    }

    Card2 pick(int index) {
        return carArr[index];
    }

    Card2 pick() {
        int index = (int) (Math.random() * CARD_NUM);
        return pick(index);
    }

    void shuffle() {
        for (int i = 0; i < carArr.length; i++) {
            int r = (int) (Math.random() * CARD_NUM);

            final Card2 temp = carArr[i];
            carArr[i] = carArr[r];
            carArr[r] = temp;
        }
    }
}

class Card2 {
    static final int KIND_MAX = 4;
    static final int NUM_MAX = 13;

    static final int SPADE = 4;
    static final int DIAMOND = 3;
    static final int HEART = 2;
    static final int CLOVER = 1;
    int kind;
    int number;

    Card2() {
        this(SPADE, 1);
    }

    Card2(int kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    public String toString() {
        String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};
        String numbers = "0123456789XJQK";

        return "kind : " + kinds[this.kind]
                + ", number : " + numbers.charAt(this.number);
    }
}