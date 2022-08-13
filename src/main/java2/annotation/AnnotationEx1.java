package main.java2.annotation;

class Parent {
    void parentMethod() {

    }
}

public class AnnotationEx1 extends Parent{
    @Override
    void parentMethod() {}  // @Override 가 붙어 있으면 조상 메서드 이름 잘못 적었으면 컴파일러가 에러를 내주지만 @Override 가 없으면 그냥 새로운
                            // 메소드로 인식하고 에러를 내주지 않는다. 그럼 나중에 오류가 발생할때 찾기 어렵기 때문에 @Override를 꼭 붙여주자.
}
