package Training;

import java.util.Scanner;

public class training_one {
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

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("~~~~~~재미있는 사칙연산 게임~~~~~~");
        System.out.println("[즐겁게 문제를 푸시다가 지겨우면 0을 누르세요~]");

        System.out.println("# 엔터를 누르면 시작합니다.");
        System.out.println("===============================");
        sc.nextLine(); // 엔터를 누르면 내려감.

        System.out.println("# 난이도를 입력하세요! [상,중,하]");
        System.out.print(">> ");
        String gameLevel = sc.next();

        //조건부로 입력한 난이도에 따라 랜덤 값 범위 지정
        int max = 0;
        switch (gameLevel) {
            case "상":
                max = 1000;
                System.out.println("상급 난이도 입니다. 1 ~ 1000까지 범위로 출제됩니다.");
                break;
            case "중":
                max = 100;
                System.out.println("중급 난이도 입니다. 1 ~ 100까지 범위로 출제됩니다.");
                break;
            case "하":
                max = 20;
                System.out.println("하급 난이도 입니다. 1 ~ 20까지 범위로 출제됩니다.");
                break;
            default:
                max = 1000;
                System.out.println("난이도를 잘못 입력했습니다. 상급 난이도로 자동 시작합니다.");
        }

        //질문 번호를 저장할 변수
        int qNumber = 1;

        //정답횟수와 오답횟수를 저장할 변수
        int correctCount = 0;
        int wrongCount = 0;

        while (true) {

            int first = (int) (Math.random() * max) + 1;
            int second = (int) (Math.random() * max) + 1;

            //랜덤 정수 0, 1, 2 생성
            int MarkRn = (int) (Math.random() * max) + 1;
        }
    }
}

