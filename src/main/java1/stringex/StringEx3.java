package main.java1.stringex;

public class StringEx3 {
    public static void main(String[] args) {

        int iVal = 100;
        String strVal = String.valueOf(iVal);   // int를 String 으로 변환방법 1

        double dVal = 200.0;
        String strVal2 = dVal + ""; // String 으로 변환하는 방법 2
        int result = Integer.parseInt("a", 16); // 소문자 a를 16진수로 변환하는 방법
        System.out.println("result = " + result);

        double sum = Integer.parseInt("+" + strVal) + Double.parseDouble(strVal2);
        double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);

        System.out.println(String.join("", strVal, "+", strVal2, "=") + sum);
        System.out.println(strVal + "+" + strVal2 + "=" + sum2);
    }
}
