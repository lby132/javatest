package main.stringex;

import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;

public class StringEx2 {
    public static void main(String[] args) throws Exception {
        Integer i = 100;
        String st1r = i + ""; // int나 Integer를 String으로 바꾸는 방법 1
        String st1r2 = st1r.valueOf(i); // int나 Integer를 String으로 바꾸는 방법 2
        String str = "가";


        byte[] bArr = str.getBytes("utf-8");
        byte[] bArr2 = str.getBytes("CP949");

        System.out.println("UTF-8:" + joinByteArr(bArr));
        System.out.println("CP949:" + joinByteArr(bArr2));

        System.out.println("UTF-8:" + new String(bArr, "UTF-8"));
        System.out.println("CP949:" + new String(bArr2, "CP949"));

        System.out.println(st1r.getClass().getSimpleName());    // 변수 유형 확인
        System.out.println(st1r2.getClass().getSimpleName());    // 변수 유형 확인
    }

    static String joinByteArr(byte[] bArr) {
        final StringJoiner sj = new StringJoiner(":", "[", "]");

        for (byte b : bArr)
            sj.add(String.format("%02X", b));
            return sj.toString();
    }
}

