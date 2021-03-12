package day01;

public class DataType {

    public static void main(String[] args) {


        //정수형
        byte a = 50;
        short b = 32767;
        int c = 2147483647;
        long d = 214748364844L;
        System.out.println("d = " + d);


        int i;
        double n = 0.0;
        for (i = 0; i < 100; i++) {
            n += 0.1;
        }
        System.out.println("n을 100번 더한 결과: " + n);

        //실수형
        float f1 = 3.754544887414F; // 4byte F필수 끝자리에
        double d1 = 3.74484448118; // 8byte
        System.out.println(f1);
        System.out.println(d1);

        //논리형 논리를 정의할때 boolean 명시
        boolean b1 = true;
        boolean b2 = false;
//        boolean b3 = 0;
//        boolean b4 = null;
//        boolean b5 = "true";
//        boolean b6 = True;

        //문자형
        //char타입은 문자 1개를 저장할 수 있는 타입,홑따옴표로 저장.
        char c1 = 'A';
        //String 타입은 문자여를 저장할 수 있는 타입, 겹따옴표로 저장. String 은 참조타입이다. (참고)
        String s1 = "ABCdef";
        String s2 = "A";

        System.out.println("100" + "200");
        System.out.println(100 + "200");
//        System.out.println("200" - 100);




    }
}
