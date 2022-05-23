package main.review;

public class Review4 {
    public static void main(String[] args) {
        char[] abc = {'A', 'B', 'C', 'D'};
        char[] abc2 = {'A', 'B', 'C', 'D','E', 'F', 'G', 'H'};
        char[] num = {'0','1','2','3','4','5','6','7','8','9'};
        char[] num2 = {'a','g','d'};
        System.out.println(abc);
        System.out.println(num);

        char[] result = new char[abc.length + num.length];
        System.arraycopy(abc, 0, result, 0, abc.length);
        System.arraycopy(num, 0, result, abc.length, num.length);
        System.out.println(result);

//        System.arraycopy(abc, 0, num, 0, abc.length);
//        System.out.println(num);

//        System.arraycopy(abc, 0, num, 6, 3);
//        System.out.println(num);

//        System.arraycopy(num2, 0, num, 0, num2.length);
//        System.out.println(num);
//
//        System.arraycopy(num2, 0, abc, 0, num2.length);
//        System.out.println(abc);

        System.arraycopy(num2, 0, abc2, 0, num2.length);
        System.out.println(abc2);

        System.arraycopy(num2,0,abc2,6,2);
        System.out.println(abc2);
    }
}
// ABCD45ABC9

// abc012345678