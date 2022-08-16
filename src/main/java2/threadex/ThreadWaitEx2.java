package main.java2.threadex;

import java.util.ArrayList;

public class ThreadWaitEx2 {
    public static void main(String[] args) throws Exception {
        Table1 table = new Table1();  //여러 스레드가 공유하는 객체

        new Thread(new Cook1(table), "COOK1").start();
        new Thread(new Customer1(table, "donut"), "CUST1").start();
        new Thread(new Customer1(table, "burger"), "CUST2").start();

        Thread.sleep(5000);
        System.exit(0);
    }
}

class Customer1 implements Runnable {

    private Table1 table;
    private String food;

    public Customer1(Table1 table, String food) {
        this.table = table;
        this.food = food;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {}
            String name = Thread.currentThread().getName();

            if (eatFood1()) {
                System.out.println(name + " ate a "  + food);
            } else {
                System.out.println(name + " failed to eat. :(");
            }
        }
    }

    boolean eatFood1() { return table.remove(food); }
}

class Cook1 implements Runnable {
    private Table1 table;

    public Cook1(Table1 table) {
        this.table = table;
    }

    @Override
    public void run() {
        while (true) {
            int idx = (int) (Math.random() * table.dishNum());
            table.add(table.dishNames[idx]);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {}
        }
    }
}

class Table1 {
    String[] dishNames = {"donut","donut","burger"};
    final int MAX_FOOD = 6;
    private ArrayList<String> dishes = new ArrayList<>();

    public synchronized void add(String dish) { // synchronized를 추가
        if (dishes.size() >= MAX_FOOD) {
            return;
        }
        dishes.add(dish);
        System.out.println("Dishes:" + dishes.toString());
    }

    boolean remove(String dishName) {
        synchronized (this) {
            while (dishes.size() == 0) {
                final String name = Thread.currentThread().getName();
                System.out.println(name + " is waiting.");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {}
            }

            for (int i = 0; i < dishes.size(); i++) {
                if (dishName.equals(dishes.get(i))) {
                    dishes.remove(i);
                    return true;
                }
            }
        }
        return false;
    }

    public int dishNum() { return dishNames.length; }
}
