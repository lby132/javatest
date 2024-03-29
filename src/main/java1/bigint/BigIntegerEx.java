package main.java1.bigint;

import java.math.BigInteger;

public class BigIntegerEx {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 100; i++) { // 1!부터 99!까지 출력
            System.out.printf("%d!=%s%n", i, calcFactorial(i));
            Thread.sleep(300);
        }
    }

    static String calcFactorial(int n) {
        return factorial(BigInteger.valueOf(n)).toString();
    }

    static BigInteger factorial(BigInteger n) {
        if (n.equals(BigInteger.ZERO)) {
            return BigInteger.ONE;
        } else {    // return n * factorial(n-1);
            return n.multiply(factorial(n.subtract(BigInteger.ONE)));
        }
    }
}
