package main.java2.format;

import java.text.ChoiceFormat;

public class ChoiceFormatEx2 {
    public static void main(String[] args) {
        String pattern = "60#D|70#C|80<B|90#A";
        int[] sources = {91, 90, 80, 88, 70, 52, 60};

        final ChoiceFormat form = new ChoiceFormat(pattern);

        for (int i = 0; i < sources.length; i++) {
            System.out.println(sources[i] + ":" + form.format(sources[i]));
        }
    }
}
