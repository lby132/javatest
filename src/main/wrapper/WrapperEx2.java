package main.wrapper;

public class WrapperEx2 {
    public static void main(String[] args) {
        int i = new Integer("100").intValue();
        int i2 = Integer.parseInt("100");
        final Integer i3 = Integer.valueOf("100");

        final int i4 = Integer.parseInt("100", 2);
        final int i5 = Integer.parseInt("100", 8);
        final int i6 = Integer.parseInt("100", 16);
        final int i7 = Integer.parseInt("FF", 16);
        // final int i8 = Integer.parseInt("FF"); // NumberFormatException 발생

        final int i9 = Integer.valueOf("100", 2);
        final int i10 = Integer.valueOf("100", 8);
        final int i11 = Integer.valueOf("100", 16);
        final int i12 = Integer.valueOf("FF", 16);
       // final int i13 = Integer.valueOf("FF");

        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println("100(2) ->"+i4);
        System.out.println("100(8) ->"+i5);
        System.out.println("100(16) ->"+i6);
        System.out.println("100(16) ->"+i7);

        System.out.println("100(2) ->"+i9);
        System.out.println("100(2) ->"+i10);
        System.out.println("100(16) ->"+i11);
        System.out.println("100(16) ->"+i12);
    }
}
