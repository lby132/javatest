package main.java1.stringex;

import java.util.StringJoiner;

public class StringEx1 {
    public static void main(String[] args) {
        String animals = "dog,cat,bear";
        String[] arr = animals.split(",");

        System.out.println(String.join("-", arr));

        final StringJoiner sj = new StringJoiner("/", "{", "}");
        for (String s : arr) {
            sj.add(s);

            System.out.println(sj.toString());
        }
    }
}
