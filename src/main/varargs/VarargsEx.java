package main.varargs;

public class VarargsEx {
    public static void main(String[] args) {
        String[] strArr = {"100", "200", "300"};

        System.out.println(concatenate("", "100", "200", "300"));
        System.out.println(concatenate("-", strArr));
        System.out.println(concatenate(",", new String[]{"1","2","3"}));
        System.out.println("["+concatenate(",", new String[0])+"]");
        System.out.println("["+concatenate(",")+"]");

    }

    static String concatenate(String delim, String... args) {
        String result = "";

        for (String str : args) {
            result += str + delim;
        }

        return result;
    }


/*    static String concatenate(String... args) {  // 가변인자가 선언된 메서드를 오버로딩하면 메서드를 호출했을때 구별하지 못해서 에러가 발생할 수 있으니 가급적이면 가변인자는 오버로딩을 피하는게 좋다.
        return concatenate("", args);
    }*/
}
