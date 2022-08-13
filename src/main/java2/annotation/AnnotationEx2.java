package main.java2.annotation;

class NewClass {
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

public class AnnotationEx2 {
    public static void main(String[] args) {
        NewClass nc = new NewClass();

        nc.oldField = 10;   // @Deprecated 가 붙은 대상을 사용
        System.out.println(nc.getOldField());   // @Deprecated 가 붙은 대상을 사용
        // @Deprecated 가 붙은 대상을 상용해도 강제는 아니기 때문에 상관은 없다 단지 권장하지 않는다는걸 알려주기 위해 저렇게 표시되는거.
    }
}


