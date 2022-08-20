package main.java2.inoutput;

import java.io.FileInputStream;
import java.io.IOException;

public class FileViewer {
    public static void main(String[] args) throws IOException {
        final FileInputStream fls = new FileInputStream(args[0]);
        int data = 0;

        while ((data = fls.read()) != -1) {
            char c = (char) data;
            System.out.println(c);
        }
    }
}
