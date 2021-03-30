package day06;

import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {



        //배열을 값목록으로 생서
        int[][] arr2d = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("arr2d.length: " + arr2d.length);

        System.out.println(Arrays.toString(arr2d[1]));

        int [] temp = arr2d[2];
        System.out.println(arr2d[2][0]);

        int number = arr2d[2][2];
        System.out.println("number = " + number);

        System.out.println("===================================");

        arr2d[1][1] = 0;
        arr2d[2] = new int[] {10,20,30}; //통째로 바꿀때 선언 할때 제외하고는 new int[] 를 꼭 써줘
        for (int [] arr : arr2d) {
            for (int n : arr) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
        System.out.println(Arrays.toString(arr2d[1]));

        //배열 생성문으로 배열 생성
        int[][] testArr = new int[4][5];

        for (int[] ints : testArr) {

            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();

        }

        //3차원 배열

    }
}
