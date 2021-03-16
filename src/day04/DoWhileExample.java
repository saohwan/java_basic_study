package day04;

import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {

        int total = 0;
        int n = 0;

        Scanner scanner = new Scanner(System.in);
        //while의 시작조건이 처음부터 false이므로 0 회 반복됨.
       /* while (n != 0) {
            System.out.println("정수(0입력시 종료):");
            n = sc.nextInt();
            total += n;
        }*/
       do {
            System.out.println("정수(0입력시 종료):");
            n = scanner.nextInt();
            total += n;
        }  while (n != 0);

        System.out.println("입력 누적값: " + total);
        scanner.close();
    }
}
