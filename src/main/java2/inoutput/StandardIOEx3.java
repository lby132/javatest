package main.java2.inoutput;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class StandardIOEx3 {
    public static void main(String[] args) {
        PrintStream ps = null;
        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream("test.txt");
            ps = new PrintStream(fos);
            System.setOut(ps);      // System.out의 출력 대상을 test.txt파일로 변경
        } catch (IOException e) {
            System.err.println("File not found");
        }

        System.out.println("Hello by System.out");
        System.err.println("Hello by System.err");
    }
}
