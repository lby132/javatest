package main.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) throws FileNotFoundException {
        final Scanner sc = new Scanner(new File("data2.text")); // data2.text파일이 없어서 오류남
        int sum = 0;
        int cnt = 0;

        while (sc.hasNextInt()) {
            sum += sc.nextInt();
            cnt++;
        }

        System.out.println("sum=" + sum);
        System.out.println("average=" + (double) sum / cnt);
    }
}
