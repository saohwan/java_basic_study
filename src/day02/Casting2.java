package day02;

public class Casting2 {
    public static void main(String[] args) {

        char c = 'B';
        int i = 2;

        System.out.println(c + i); // c는 아스키코드 66

        char result = (char) (c + i);
        System.out.println("result = " + result); // char 은 문자열로 출력하기때문 68의 아스키코드인 D 가 출력.

        //int 보다 작은 (byte, short, char)의 연산은 결과가 자동 int 로 변환됨.
        byte b1 = 100;
        byte b2 = 110;
//        int b3 = b1 + b2;
        System.out.println('A' + 'B');

        int n1 = 27;
        int n2 = 5;

        double res = (double) n1 / n2;
        System.out.println("res = " + res);
    }
}
