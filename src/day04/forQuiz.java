package day04;

import java.util.Scanner;

public class forQuiz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        int n = (int) (Math.random()*9) + 1;
        System.out.println("랜덤구구단" + n +  "단");
        System.out.println("=============================");
        for (int i = 1; i <= 9; i++) {
            int answer = n * i;
            System.out.printf("%d x %d = %d\n", n, i, answer);
        }







    }
}