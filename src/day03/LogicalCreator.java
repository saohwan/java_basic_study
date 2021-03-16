package day03;

public class LogicalCreator {

    public static void main(String[] args) {

        int x = 10, y = 20;

        boolean result1 = (x != 10) && (++y == 21);
        boolean result2 = (x == 10) || (++y == 21);
        System.out.println("result = " + result1);
        System.out.println("result = " + result2);
        System.out.println("result = " + x);
        System.out.println("result = " + y);

    }
}
