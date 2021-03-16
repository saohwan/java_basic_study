package day03;

import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("직급을 입력하세요.");
        System.out.println("[사원,대리,과장,차장,부장]");
        System.out.print(">>");

        String rank = scanner.next();

        switch (rank) {
            case "사원":
                System.out.println(rank +"사원의 급여는 200만원입니다.");
                break;
            case "대리":
                System.out.println(rank +"사원의 급여는 300만원입니다.");
                break;
            case "과장":
                System.out.println(rank +"사원의 급여는 400만원입니다.");
                break;
            case "차장":
                System.out.println(rank +"의 급여는 500만원입니다.");
                break;
            case "부장":
                System.out.println(rank +"사원의 급여는 600만원입니다.");
                break;
            default:
                System.out.println(rank + " (는) 없는 직급입니다.");
                System.out.println("직급을 다시 입력해주세요.");
        }
    }
}
