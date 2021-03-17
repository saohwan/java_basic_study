package Training.ex14;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {


        //과목 스코어 배열을 지정.
        int[] scores = {98, 71, 85, 67, 100, 95};
        // 합계 total, 평균인 avg를 초기화


        int total = 0;

        Scanner sc = new Scanner(System.in);

        // 배열에서 6개의 점수를 입력받고 점수의 합계를 계산


        for (int i = 0; i < scores.length; i++) {
            total += scores[i];
        }
            for (double avg : scores) {
                avg = total / (double)6;
                System.out.printf("총점: %d , 평점: %f", total, avg);

            }
        }
    }
