package main.java1.objex;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;


public class ObjectsTest {
    public static void main(String[] args) {
        String[][] str2D = new String[][]{{"aaa","bbb"},{"AAA","BBB"}};
        String[][] str2D_2 = new String[][]{{"aaa","bbb"},{"AAA","BBB"}};

        System.out.println("str2D ={");
        for (String[] tmp : str2D) {
            System.out.println(Arrays.toString(tmp));
        }
        System.out.println("}");
        System.out.println("str2D_2={");
        for (String[] tmp : str2D_2) {
            System.out.println(Arrays.toString(tmp));
        }
        System.out.println("}");

        System.out.println("equals(str2D, str2D_2)=" + Objects.equals(str2D, str2D_2));
        System.out.println("deepEquals(str2D, str2D_2)=" + Objects.deepEquals(str2D, str2D_2));
        System.out.println("isNull(null) =" + Objects.isNull(null));
        System.out.println("nonNull(null) =" + Objects.nonNull(null));
        System.out.println("hashCode(null) =" + Objects.hashCode(null));
        System.out.println("toString(null) =" + Objects.toString(null));
        System.out.println("toString(null, \"\")=" +Objects.toString(null, ""));

        Comparator c = String.CASE_INSENSITIVE_ORDER;   // 대소문자 구분 안하는 비교

        System.out.println("compare(\"aa\",\"bb\")="+Objects.compare("aa","bb",c));
        System.out.println("compare(\"bb\",\"aa\")="+Objects.compare("bb","aa",c));
        System.out.println("compare(\"ab\",\"AB\")="+Objects.compare("ab","AB",c));
    }
}
