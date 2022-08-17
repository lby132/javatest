package main.java2.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx {
    public static void main(String[] args) {
        String[] strArr = {"aaa", "ddd", "ccc"};
        List<String> strList = Arrays.asList(strArr);

        Stream<String> strStream1 = strList.stream();    // 스트림을 생성
        Stream<String> strStream2 = Arrays.stream(strArr);    // 스트림을 생성

        // 두 스트림으로 데이터 소스의 데이터를 읽어서 정렬하고 화면에 출력함. 데이터 소스들이 순서대로 정렬되는건 아님.
        strStream1.sorted().forEach(System.out::println);
        strStream2.sorted().forEach(System.out::println);

        // 스트림을 쓰지 않은 소스 - start -
        Arrays.sort(strArr);
        Collections.sort(strList);

        for (String str : strArr) {
            System.out.println(str);
        }

        for (String str : strList) {
            System.out.println(str);
        }
        // 스트림을 쓰지 않은 소스 - end -
    }
}
