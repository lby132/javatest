package main.java2.inoutput;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class IOEx3 {
    public static void main(String[] args) {
        byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        byte[] outSrc = null;
        byte[] temp = new byte[4];

        ByteArrayInputStream input = null;
        ByteArrayOutputStream output = null;

        input = new ByteArrayInputStream(inSrc);
        output = new ByteArrayOutputStream();

        System.out.println("Input Source    :" + Arrays.toString(inSrc));

        try {
            while (input.available() > 0) {
                input.read(temp);
                output.write(temp);
//                System.out.println("temp    :" + Arrays.toString(temp));

                outSrc = output.toByteArray();
                printArrays(temp, outSrc);
            }
        } catch (IOException e) {}
    }

    public static void printArrays(byte[] temp, byte[] outSrc) {
        System.out.println("temp    :" + Arrays.toString(temp));
        System.out.println("outSrc  :" + Arrays.toString(outSrc));
    }
}
