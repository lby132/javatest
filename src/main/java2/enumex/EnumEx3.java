package main.java2.enumex;

enum Transportation {
    BUS(100) {
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    },

    TRAIN(150) {int fare(int distance) {return distance * BASIC_FARE;}},
    SHIP(100) {int fare(int distance) {return distance * BASIC_FARE;}},
    AIRPLANE(300) {int fare(int distance) {return distance * BASIC_FARE;}};

    protected final int BASIC_FARE; // protected 로 해야 각 상수에 접근 가능

    Transportation(int BASIC_FARE) {    // private Transportation(int basicFare)
        this.BASIC_FARE = BASIC_FARE;
    }

    public int getBasicFare(){return BASIC_FARE;}

    abstract int fare(int distance);  // 거리에 따른 요금 계산

}

public class EnumEx3 {
    public static void main(String[] args) {
        System.out.println("bus fare=" + Transportation.BUS.fare(100));
        System.out.println("train fare=" + Transportation.TRAIN.fare(100));
        System.out.println("ship fare=" + Transportation.SHIP.fare(100));
        System.out.println("airplane fare=" + Transportation.AIRPLANE.fare(100));
    }
}
