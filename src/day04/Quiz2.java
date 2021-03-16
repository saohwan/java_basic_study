package day04;

import java.util.Scanner;

public class Quiz2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int ncount = 0;
        System.out.println("~~~~~~~난이도를 입력하세요 [상, 중, 하]~~~~~~");
        System.out.println("----------------------------------");
        String rank = scanner.next();
        while (true) {
            int n1 = (int) (Math.random() * 100) + 1;
            int n2 = (int) (Math.random() * 100) + 1;
            //랜덤값 0 1 2
            //랜덤값 0일때 if 문제 +로 출력 답도 ran1 + ran2
            //1일때 문제 -로 출력 답도 ran1 - ran2


            // case 로 난이도 구별
            switch (rank) {
                case "상":
                    n1 = (int) (Math.random() * 1000) + 1;
                    n2 = (int) (Math.random() * 1000) + 1;
                    break;
                case "중":
                    n1 = (int) (Math.random() * 500) + 1;
                    n2 = (int) (Math.random() * 500) + 1;
                    break;
                case "하":
                    n1 = (int) (Math.random() * 100) + 1;
                    n2 = (int) (Math.random() * 100) + 1;
                    break;
                default:
                    System.out.println("꺼지세요");
                    break;
            }
            int n = (int) (Math.random() * 3);
            String x = "";

            int realAnswer = 0;
            switch (n) {
                case 0:
                    x = "+";
                    realAnswer = n1 + n2;
                    break;
                case 1:
                    x = "-";
                    //만약 두 숫자가 같다면 2번째 숫자에서 1을 빼주겠다.
                    if (n1 == n2) {
                        n2--;
                    }
                    //뒷 숫자가 앞 숫자보다 크다면 두 값을 교체
                    if (n1 < n2) {
                        int temp = n1;
                        n1 = n2;
                        n2 = temp;
                        //만약 2개의 값이 같다면
                    }
                    realAnswer = n1 - n2;
                    break;
                case 2:
                    x = "*";
                    realAnswer = n1 * n2;
                    break;
            }

            int total = n1 + n2;

            System.out.printf("%d %s %d = ? \n", n1, x, n2);


            int answer = scanner.nextInt();

            if (answer == 0) {
                System.out.printf("정답횟수는 %d, 오답횟수는 %d\n", count, ncount);
                break;
            }

            if (answer == total) {
                System.out.println("정답입니다!!");
                System.out.println("----------------------------------");
                count++;
            } else if (answer != total) {
                System.out.println("틀렸어새끼야");
                System.out.println("----------------------------------");
                ncount++;
                continue;
            }
        }

    }
}

 /*
        1. 일단 1~20의 랜덤 숫자로 두 수의 덧셈문제를 1문제 출제한 후
           정답인지 오답인지 출력해보세요.
        2. 0을 입력할 때까지 반복해서 새로운 덧셈문제를 출제하고
           지속해서 정답 오답을 출력해보세요.
        3. 프로그램 종료되면 그동안의 정답횟수와
           오답횟수를 출력하세요.
        4. 빼기 기능을 추가하세요.


        5. 곱하기 기능을 추가하세요.
        6. 만약 두번째 숫자가 더 크다면 빼기 문제를 낼 때
           양수가 나올 수 있도록 앞숫자와 교체해주세요
           ex)  4 - 17 = ?    <- 이런문제가 출제될 경우
               17 - 4 = ?      <- 이렇게 바꿔서 출제할 것!
         */
