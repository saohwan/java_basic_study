package day03;

public class BitOperator {

    public static void main(String[] args) {

        //비트 연산
        byte a = 5;
        byte b = 3;
        //비트곱 : 각 자리수를 곱하라
        System.out.println(a & b); // 0000 0001 -> 1
        //비트합: 각 자리수를 더하고 1 + 1은 1로 처리
        System.out.println(a | b); // 0000 0111 -> 7
        //배타적 논리합:
        System.out.println(a ^ b); // 0000 0110 -> 6

        //비트 이동 연산
        int x = 152;
        System.out.println(x << 3);
        //비트 반전(단항)
        int y = 8;
        System.out.println(~y);
    }
}
