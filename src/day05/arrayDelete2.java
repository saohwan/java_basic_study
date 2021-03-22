package day05;

import java.util.Arrays;
import java.util.Scanner;

public class arrayDelete2 {
    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 7, 9, 11, 13};

        System.out.println("삭제전 : " + Arrays.toString(arr));

       /* System.out.println("삭제하고 싶은 인덱스: ");
        Scanner sc = new Scanner(System.in);*/

        /*int input = sc.nextInt();

        int delIndex = input;*/
        int delIndex = 2;
        for (int i = 2; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        int[] temp = new int[arr.length-1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp; temp = null;

        System.out.println("삭제후: " + Arrays.toString(arr));

    }
}
