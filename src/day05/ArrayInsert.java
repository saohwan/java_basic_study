package day05;

import java.util.Arrays;

public class ArrayInsert {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30};

        int newData = 40;

        //1. 원본 배열보다 사이즈가 1개 큰 새로운 배열을 생성.
        int[] temp = new int[arr.length + 1];
        //2. 기존 배열 데이터를 복사해서 신규 배열에 저장.
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        //3. 추가할 데이터를 마지막 위치에 저장.
        // temp.length - 1 << 템프의 마지막 배열 만약 3 이면 -1 로 [2] , 0 1 2  <<3개 그래서 2
        temp[temp.length - 1] = newData;

        // arr 을 출력했을때 추가되게하고 이제 필요없는 주소인 temp 는 null로 처리한다.
        //teacher 기존 배열 변수가 신규 배열의 주소를 가질 수 있도록 설정.
        arr = temp; temp = null;

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(temp));

    }
}
