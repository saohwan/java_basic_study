package day04;

import java.util.Scanner;

public class whileQuiz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("정수1: ");
        int x = sc.nextInt();

        System.out.print("정수2: ");
        int y = sc.nextInt();

        sc.close();

        // x ~ y까지의 총합
        int total = 0;

        /*int n = x;
        while (n <= y) {
            total += n;
            n++;
        }*/
        for (int n = x; n <= y; n++) {
            total += n;
        }

        System.out.printf("%d~%d까지의 총합: %d\n", x, y, total);
    }
}