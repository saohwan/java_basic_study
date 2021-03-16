package day03;

import java.util.Scanner;

public class Quiz정수출력 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("정수:");

        int number = scanner.nextInt();

        if (number == 0) {
            System.out.println("입력한 숫자는 0입니다");
        } else if ((number % 7) == 0) {
            System.out.println("입력하신 숫자는 7의 배수입니다.");
        } else if ((number % 7) != 0) {
            System.out.println("입력하신 숫자는 7의 배수가 아닙니다.");
        }
    }
}
