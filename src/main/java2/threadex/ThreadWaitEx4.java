package main.java2.threadex;

import java.util.ArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadWaitEx4 {
    public static void main(String[] args) throws Exception{
        final Table3 table = new Table3();

        new Thread(new Cook3(table), "COOK1").start();
        new Thread(new Customer3(table, "donut"), "CUST1").start();
        new Thread(new Customer3(table, "burger"), "CUST2").start();

        Thread.sleep(2000);
        System.exit(0);
    }
}

class Customer3 implements Runnable {
    private Table3 table;
    private String food;

    public Customer3(Table3 table, String food) {
        this.table = table;
        this.food = food;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {}
            String name = Thread.currentThread().getName();

            table.remove(food);
            System.out.println(name + " ate a " + food);
        }
    }
}

class Cook3 implements Runnable {
    private Table3 table;

    public Cook3(Table3 table) {
        this.table = table;
    }

    @Override
    public void run() {
        while (true) {
            int idx = (int) (Math.random() * table.dishNum());
            table.add(table.dishNames[idx]);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {}
        }
    }
}

class Table3 {
    String[] dishNames = {"donut","donut","burger"};    // donut의 확률을 높인다.
    final int MAX_FOOD = 6;
    private ArrayList<String> dishes = new ArrayList<>();

    private ReentrantLock lock = new ReentrantLock();
    private Condition forCook = lock.newCondition();
    private Condition forCust = lock.newCondition();

    public synchronized void add(String dish) {
        lock.lock();

        try {
            while (dishes.size() >= MAX_FOOD) {
                final String name = Thread.currentThread().getName();
                System.out.println(name + " is waiting.");
                try {
                    forCook.await();    // wait();  COOK3스레드를 기다리게 한다.
                    Thread.sleep(500);
                } catch (InterruptedException e) {}
            }
            dishes.add(dish);
            forCust.signal();   // notify();  기다리고 있는 CUST를 깨우기 위함.
            System.out.println("Dishes:" + dishes.toString());
        }finally {
            lock.unlock();
        }
    }

    public void remove(String dishName) {
        lock.lock();    // synchronized (this) {
        String name = Thread.currentThread().getName();

        try {
            while (dishes.size() == 0) {
                System.out.println(name + " is waiting.");
                try {
                    forCust.await();    // wait();  CUST스레드를 기다리게 한다.
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }

            while (true) {
                for (int i = 0; i < dishes.size(); i++) {
                    if (dishName.equals(dishes.get(i))) {
                        dishes.remove(i);
                        forCust.signal();  // notify(); 잠자고 있는 COOK3를 깨우기 위함
                        return;
                    }
                }
                try {
                    System.out.println(name + " is waiting.");
                    forCust.await();    // wait(); CUST스레드를 기다리게 한다.
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }finally {
            lock.unlock();
        }
    }

    public int dishNum() { return dishNames.length; }
}