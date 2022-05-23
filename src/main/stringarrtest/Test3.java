package main.stringarrtest;

public class Test3 {
    public static void main(String[] args) {
        String source = "SOSHELP";
        String[] morse = {".-", "-...", "-.-.", "-..", "."
                , "..-.", "--.", "....", "..", ".---"
                , "-.-", ".-..", "--", "-.", "---"
                , ".--", "--.-", ".-.", "...", "-"
                , "..-", "...-", ".--", "-..-", "-.--"
                , "--.."
        };

        String result = "";
        System.out.println(source.charAt(1) - 'A');
        for (int i = 0; i < source.length(); i++) {
            result += morse[source.charAt(i) - 'A'];
        }
        System.out.println("source:" + source);
        System.out.println("morse:" + result);
    }
}
