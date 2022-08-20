package main.java2.inoutput;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamEx1 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("sample.dat");
            DataInputStream dis = new DataInputStream(fis);

            // 주의 할 점은 여러 가지 종류의 자료형으로 출력한 경우 DataOutputStreamEx2에서 write한 순서대로 읽어야한다.
            System.out.println(dis.readInt());
            System.out.println(dis.readFloat());
            System.out.println(dis.readBoolean());
            dis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
