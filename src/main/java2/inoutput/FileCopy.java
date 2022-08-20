package main.java2.inoutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) throws IOException {
        try {
            FileInputStream fls = new FileInputStream(args[0]);
            FileOutputStream fos = new FileOutputStream(args[1]);

            int data = 0;

            while ((data = fls.read()) != -1) {
                fos.write(data);
            }

            fls.close();
            fos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
