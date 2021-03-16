package day03;

import java.util.Scanner;

public class ScannerQuiz1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("상품의가격:");
        int money = sc.nextInt();

        System.out.print("상품의 개수:");
        int gessu = sc.nextInt();


        int totalPrice = money * gessu;
        System.out.println("======================");
        System.out.printf("상품 재고 총액", totalPrice);











    }
}
