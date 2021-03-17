package day04;

import java.util.Scanner;

public class LoopQuiz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int ncount = 0;
        System.out.println("~~~~~~난이도를 입력하세요 [상, 중, 하]~~~~~~");
        System.out.println("===============================================");
        String rank = sc.next();

        while (true) {
            //첫번째 넘버와 두번째 넘버를 랜덤으로 조합하기 위해 int n1,n2를 랜덤 변수를 지정.
            int n1 = (int) (Math.random() * 100) + 1;
            int n2 = (int) (Math.random() * 100) + 1;
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
            //연산자 + , - , * 를 랜덤으로 받기위해 스트링(문자열)로 변수를 저장하기.
            int n = (int) (Math.random() * 3);
            //스트링 변수에는 x를 지정하고 해당 대입자는 비워두기.?
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
            System.out.printf("%d %s %d = ? \n", n1, x, n2);


            int answer = sc.nextInt();

            if (answer == 0) {
                System.out.printf("정답횟수는 %d, 오답횟수는 %d\n", count, ncount);
                break;
            }

            if (answer == realAnswer) {
                System.out.println("정답입니다!!");
                System.out.println("----------------------------------");
                count++;
            } else {
                System.out.println("틀렸어새끼야");
                ncount++;
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
