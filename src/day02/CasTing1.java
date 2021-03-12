package day02;

public class CasTing1 {
    public static void main(String[] args) {

        //묵시적 형변환, upcasting(promotion)
        byte a = 100;
        int b = a; // a가 byte -> int 자동 형 변환.

        double c = b; //b가 int -> double 자동 형 변환.
        System.out.println(c);


        // 명시적 형변환, downcasting
        int n = 1000;
        byte m = (byte) n;
        System.out.println("m = " + m);
        
        double d = 500.3333;
        int i = (int) d; // 때로는 이런 방식으로 소수점을 버리기 위해 사용한다.
        System.out.println("i = " + i);
    }
}
