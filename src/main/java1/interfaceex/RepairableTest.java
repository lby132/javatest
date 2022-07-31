package main.java1.interfaceex;

public class RepairableTest {
    public static void main(String[] args) {
        Tank tank = new Tank();
        final Dropship dropship = new Dropship();
        final Marine marine = new Marine();
        final SCV scv = new SCV();

        scv.repair(tank);
        scv.repair(dropship);
        //scv.repair(marine); 에러발생
    }
}

interface Repairable {}

class Unit1 {
    int hitPoint;
    final int MAX_HP;

    public Unit1(int hp) {
        this.MAX_HP = hp;
    }
}

class GroundUnit extends Unit1 {
    public GroundUnit(int hp) {
        super(hp);
    }
}

class AirUnit extends Unit1 {
    public AirUnit(int hp) {
        super(hp);
    }
}

class Tank extends GroundUnit implements Repairable {
    public Tank() {
        super(150);
        hitPoint = MAX_HP;
    }

    public String toString() {
        return "Tank";
    }
}

class Dropship extends AirUnit implements Repairable {
    public Dropship() {
        super(125);
        hitPoint = MAX_HP;
    }

    public String toString() {
        return "Dropship";
    }
}

class Marine extends GroundUnit {
    Marine() {
        super(40);
        hitPoint = MAX_HP;
    }
}

class SCV extends GroundUnit implements Repairable {
    SCV() {
        super(60);
        hitPoint = MAX_HP;
    }

    void repair(Repairable r) {
        if (r instanceof Unit1) {
            Unit1 u = (Unit1) r;

            while (u.hitPoint != u.MAX_HP) {
                /* Unit의 hp를 증가시킨다. */
                u.hitPoint++;
            }
            System.out.println(u.toString() + "의 수리가 끝났습니다.");
        }
    }
}




