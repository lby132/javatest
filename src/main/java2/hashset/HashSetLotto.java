package main.java2.hashset;

import java.util.*;

public class HashSetLotto {
    public static void main(String[] args) {
        Set set = new HashSet();

        for (int i = 0; set.size() < 6; i++) {
            int num = (int) (Math.random() * 45) + 1;
            set.add(new Integer(num));  // 중복된 값이 저장되지 않는 HashSet을 이용해서 로또번호를 만든다.
        }

        List list = new LinkedList(set);
        Collections.sort(list);
        System.out.println(list);
    }
}
