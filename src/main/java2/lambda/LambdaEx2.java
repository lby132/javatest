package main.java2.lambda;

@FunctionalInterface
interface MyFunction1 {
    void myMethod();    // public abstract void myMethod();
}

public class LambdaEx2 {
    public static void main(String[] args) {
        MyFunction1 f = () -> {};   // MyFunction1 f = (MyFunction1) (()->{});
        Object obj = (MyFunction1) (()->{});
        String str = ((Object)(MyFunction1)(()->{})).toString();

        System.out.println("f = " + f);
        System.out.println("obj = " + obj);
        System.out.println("str = " + str);

        // System.out.println(()->{});  // 에러. 람다식은 Object타입으로 형변환 안됨
        System.out.println((MyFunction1)(()->{}));
        // System.out.println((MyFunction1)(()->{}).toString);  // 에러
        System.out.println(((Object) (MyFunction) (()->{})).toString());
    }
}
