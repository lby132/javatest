package main.argument;

class Product1 {
    int price; // 제품의 가격
    int bonusPoint; // 제품구매 시 제공하는 보너스점수

    public Product1(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }

    Product1(){}    // 기본 생성자
}

class Tv1 extends Product1 {
    Tv1() {
        super(100);
    }

    public String toString() {
        return "Tv";
    }
}

class Computer1 extends Product1 {
    Computer1() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }
}

class Audio extends Product1 {
    Audio() {
        super(50);
    }

    public String toString() {
        return "Audio";
    }
}

class Buyer1 {
    int money = 1000; // 소유금액
    int bonusPoint = 0; // 보너스 점수
    Product1[] item = new Product1[10]; // 구입한 제품을 저장하기 위한 배열
    int i = 0;  // Product배열에 사용될 카운터

    void buy(Product1 p) {
        if (money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }

        money -= p.price;
        bonusPoint += p.bonusPoint;
        item[i++] = p;  // 제품을 Product[] item에 저장한다.
        System.out.println(p + "을/를 구입하셨습니다.");
    }

    void summary() {            // 구매한 물품에 대한 정보를 요약해서 보여 준다.
        int sum = 0;            // 구입한 물품의 가격합계
        String itemList = "";   // 구입한 물품목록

        // 반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
        for (int i = 0; i < item.length; i++) {
            if (item[i]==null) break;
            sum += item[i].price;
            itemList += item[i] + ", ";
        }
        System.out.println("구입하신 물품의 총금액은 " + sum + "만원 입니다.");
        System.out.println("구입하신 제품은 " + itemList + "입니다.");
    }
}

public class PolyArgumentTest2 {
    public static void main(String[] args) {
        Buyer1 b = new Buyer1();

        b.buy(new Tv1());
        b.buy(new Computer1());
        b.buy(new Audio());

        b.summary();
    }
}
