package day01;

public class DataType {

    public static void main(String[] args) {

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
        System.out.println("n을 100번 더한 결과: "+n );

        float f1 = 3.754544887414F; // 4byte
        double d1 = 3.74484448118; // 8byte
        System.out.println(f1);
        System.out.println(d1);

    }
}
