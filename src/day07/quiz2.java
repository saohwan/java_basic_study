package day07;

public class quiz2 {

    public static void main(String[] args) {
        int[] numbers = {57, 89, 78, 91, 93, 47};
        double[] arrTotAvg = calcArrayTotal(numbers);
        System.out.printf("총점: %d점, 평균: %.2f점\n", (int) arrTotAvg[0], arrTotAvg[1]);
    }

    private static double[] calcArrayTotal(int... numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        double average = total / (double) numbers.length;
        return new double[] {total, average};
    }
}
//    static double[] calcArrayTotal(int... numbers) {
//        double total = 0;
//        double[] arrTotAvg = new double[2];
//        for (int i = 0; i < numbers.length; i++) {
//            total += numbers[i];
//        }
//        arrTotAvg[0] = total;
//        arrTotAvg[1] = total / numbers.length;
//        return arrTotAvg;
//    }
//}/* end calcArrayTotal */
//    public static void main(String[] args) {
//        int[] numbers = {57, 89, 78, 91, 93, 47};
//        double[] arrTotAvg = calcArrayTotal(numbers);
//        System.out.printf("총점: %d, 평균: %.2f점\n", (int) arrTotAvg[0], arrTotAvg[1]);
//    }
//}
