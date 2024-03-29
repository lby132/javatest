package main.java1.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx1 {
    public static void main(String[] args) {
        String[] data = {"bat", "baby", "bonus", "cA", "ca", "co", "c.", "c0", "car", "combat", "count", "data", "disc"};

        final Pattern p = Pattern.compile("c[a-z]*");

        for (int i = 0; i < data.length; i++) {
            final Matcher m = p.matcher(data[i]);
            if (m.matches()) {
                System.out.print(data[i] +",");
            }
        }
    }
}
