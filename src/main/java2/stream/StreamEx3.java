package main.java2.stream;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx3 {
    public static void main(String[] args) {
        Student1[] stuArr = {
            new Student1("이자바", 3, 300),
            new Student1("김자바", 1, 200),
            new Student1("안자바", 2, 100),
            new Student1("박자바", 2, 150),
            new Student1("소자바", 1, 200),
            new Student1("나자바", 3, 290),
            new Student1("감자바", 3, 180),
        };

        Stream<Student1> stuStream = Stream.of(stuArr);

        stuStream.sorted(Comparator.comparing(Student1::getBan)
                .thenComparing(Comparator.naturalOrder()))
                .forEach(System.out::println);

        stuStream = Stream.of(stuArr);  // 스트림을 위에서 끝냈기 때문에 다시 생성해줘야 한다.
        IntStream stuScoreStream = stuStream.mapToInt(Student1::getTotalScore);

        IntSummaryStatistics stat = stuScoreStream.summaryStatistics();
        System.out.println("count=" + stat.getCount());
        System.out.println("sum=" + stat.getSum());
        System.out.printf("average=%.2f%n", stat.getAverage());
        System.out.println("min=" + stat.getMin());
        System.out.println("max=" + stat.getMax());
    }
}


class Student1 implements Comparable<Student1>{
    String name;
    int ban;
    int totalScore;

    public Student1(String name, int ban, int totalScore) {
        this.name = name;
        this.ban = ban;
        this.totalScore = totalScore;
    }

    public String toString() {
        return String.format("[%s,%d,%d]", name, ban, totalScore).toString();
    }

    public String getName() {
        return name;
    }

    public int getBan() {
        return ban;
    }

    public int getTotalScore() {
        return totalScore;
    }

    @Override
    public int compareTo(Student1 s) {
        return s.totalScore - this.totalScore;
    }
}