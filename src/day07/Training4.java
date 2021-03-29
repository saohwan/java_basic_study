package day07;

public class Training4 {
    public static void main(String[] args) {
        // 1. 변수를 생성
        int num = 3;
        // 2. 메소드를 통한 칼로리를 계산
        double result = calculate7(num);
        // 3. 결과를 출력
        System.out.printf("삼겹살 $d인 분: %.2f kcal", num, result);
    }

    // 4. 칼로리 계산을 위한 메소드를 작성하시오.
    public static double calculate7(int n) {
        int gram = n * 180; //1인분 => 180g
        double kcal = gram * 5.179;//1g => 5.179kcal
        return kcal;
    }

}
