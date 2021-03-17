package Training;


import java.util.Scanner;

public class training_two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1부터 10까지 합을 출력하세요.
        System.out.println("1부터 10까지 더하기~~~");
        System.out.println("====================");
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("1부터 10까지의 합은 : " + sum);
        System.out.println("=========끝=========");
        //1~10까지 홀수값의 합은?
        System.out.println("1부터 10까지 홀수값 더하기~~~");
        System.out.println("====================");
        int x = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                x += i;
            }
        }
        System.out.println("1부터 10까지 홀수를 더한값은 : " + x);
        System.out.println("=========끝=========");


        //1~10 까지 짝수값의 합은?
        System.out.println("1부터 10까지 짝수값 더하기~~~");
        System.out.println("====================");

        int y = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                y += i;
            }
        }
        System.out.println("1부터 10까지 짝수를 더한값은 : " + y);
        System.out.println("=========끝=========");

    }
}
