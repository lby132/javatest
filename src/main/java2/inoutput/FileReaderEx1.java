package main.java2.inoutput;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx1 {
    public static void main(String[] args) {
        try {
            String fileName = "test.txt";
            final FileInputStream fis = new FileInputStream(fileName);
            final FileReader fr = new FileReader(fileName);

            int data = 0;
            // FileInputStream을 이용해서 파일내용을 읽어 화면에 출력한다.
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
            System.out.println();
            fis.close();

            // FileReader을 이용해서 파일내용을 읽어 화면에 출력한다.
            while ((data = fr.read()) != -1) {
                System.out.print((char) data);
            }
            System.out.println();

            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
