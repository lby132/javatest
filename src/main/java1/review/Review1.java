package main.java1.review;

public class Review1 {

    public static void main(String[] args) {
        int[] score = new int[5];
        int k = 1;

        score[0] = 50;
        score[1] = 60;
        score[k+1] = 70; //score[2] = 70
        score[3] = 80;
        score[4] = 90;

        int tmp = score[k + 2] + score[4]; // int tmp = score[3] + score[4]

        for (int i = 0; i < 5; i++) {
            System.out.println(score[i]);
        }

        System.out.println("tmp = " + tmp);

    }


}
