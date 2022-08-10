package main.java2.hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx1 {
    public static void main(String[] args) {
        Object[] objArr = {"1", new Integer(1), "2", "2", "3", "3", "4", "4", "4"};
        Set set = new HashSet();

        for (int i = 0; i < objArr.length; i++) {
            set.add(objArr[i]); // HashSet에 objArr의 요소를 저장한다.
        }

        // HashSet에 저장된 요소들을 출력한다.
        System.out.println(set);
        // 출력 값에 1,1이 둘다 출력되는데 첫번째 1은 String타입이고 두번째 1은 Integer타입이라 다른걸로 인식되어서 1이 두개 출력된것이다.
    }
}
