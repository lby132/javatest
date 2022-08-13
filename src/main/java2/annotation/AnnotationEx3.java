package main.java2.annotation;

import java.util.ArrayList;

class NewClass1 {
    int newField;

    int getNewField() {
        return newField;
    }

    @Deprecated
    int oldField;

    @Deprecated
    int getOldField() {
        return oldField;
    }
}

public class AnnotationEx3 {
    @SuppressWarnings("deprecation")        // deprecation 에 관한 경고 억제
    public static void main(String[] args) {
        NewClass1 nc = new NewClass1();

        nc.oldField = 10;   // @Deprecated 가 붙은 대상을 사용
        System.out.println(nc.getOldField());   // @Deprecated 가 붙은 대상을 사용

        @SuppressWarnings("unchecked")  // 제네릭 관련 경고 억제
        ArrayList<NewClass1> list = new ArrayList<>();  // 타입을 지정하지 않음
        list.add(nc);
    }
}


