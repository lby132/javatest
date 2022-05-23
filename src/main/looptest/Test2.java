package main.looptest;

public class Test2 {

    public static void main(String[] args) {
        //for문에 Loop1이라는 이름을 붙였다.
        Loop1 :
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (j == 5) {
                    break Loop1; //for 문에 달린 이름을 적어주면 이중포문을 완전히 빠져나간다.그렇지 않고 break 문만 써주면 if문 조건에 맞는곳만 제외되고 포문은 계속 돈다.
                }
                    System.out.println(i+"*"+j+"="+i*j);
            }
            System.out.println();
        }
    }


}
