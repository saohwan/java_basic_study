package day07;

public class quiz1 {

    static int calcDivisor(int n) {
        int total = 0;

        System.out.printf("%d의 약수: ", n);
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                total += i;
                System.out.printf("%d ", i);
            }
        }
        System.out.println();
        return total;
    }//end calcDivisor

    public static void main(String[] args) {
        System.out.println("10의 약수의 총합: " + calcDivisor(10));
        System.out.println("==================================");
        System.out.println("10의 약수의 총합: " + calcDivisor(30));
    }
}//end class



