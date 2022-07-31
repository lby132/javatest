package main.java1.scanner;

import java.io.File;
import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(new File("data3.text")); // data2.text파일이 없어서 오류남
        int cnt = 0;
        int totalSum = 0;

        while (sc.hasNextLine()) {
            final String line = sc.nextLine();
            final Scanner sc2 = new Scanner(line).useDelimiter(",");
            int sum = 0;

            while (sc2.hasNextInt()) {
                sum += sc2.nextInt();
            }
            System.out.println(line + ", sum = " + sum);
            totalSum += sum;
            cnt++;
        }
        System.out.println("Line: " + cnt + ", Total: " + totalSum);
    }
}
