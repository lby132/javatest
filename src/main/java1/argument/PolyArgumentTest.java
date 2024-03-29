package main.java1.argument;

class Product {
    int price;      // 제품의 가격
    int bonusPoint; // 제품구매 시 제공하는 보너스 점수

    public Product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);  // 보너스점수는 제품가격의 10%
    }
}

class Tv extends Product {
    Tv() {
        super(100); // Tv가격을 100만원으로 한다.
    }

    // Object 클래스의  toString()을 오러바이딩 한다.
    public String toString() {
        return "Tv";
    }
}


class Computer extends Product {
    Computer() {
        super(200);
    }

    public String toString() {
        return "computer";
    }
}

class Buyer {   // 고객, 물건을 사는 사람
    int money = 1000;           // 소유금액
    int bonusPoint = 0;         // 보너스점수

    void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }

        money -= p.price;               // 가진 돈에서 구입한 제품의 가격을 뺀다.
        bonusPoint += p.bonusPoint;     // 제품의 보너스 점수를 추가한다.
        System.out.println(p + "을/를 구입하셨습니다.");
    }
}

public class PolyArgumentTest {
    public static void main(String[] args) {
        Buyer b = new Buyer();

        b.buy(new Tv());
        b.buy(new Computer());

        System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
        System.out.println("현재 보너스 점수는 " + b.bonusPoint + "점 입니다.");
    }
}