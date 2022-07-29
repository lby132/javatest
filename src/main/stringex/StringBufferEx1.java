package main.stringex;

public class StringBufferEx1 {
    public static void main(String[] args) {
        final StringBuffer sb = new StringBuffer("abc");
        final StringBuffer sb2 = new StringBuffer("abc");

        System.out.println("sb == sb2 ? " + (sb == sb2));
        System.out.println("sb == sb2 ? " + (sb.equals(sb2)));

        // StringBuffer의 내용을 String으로 변환한다.
        String s = sb.toString();   // String s = new String(sb) 와 같다.
        final String s2 = sb2.toString();

        System.out.println("s2.equals(s2) = " + s2.equals(s2));
    }
}
