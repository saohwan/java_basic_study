package day01;

public class Variable {


    public static void main(String[] args) {

        //변수 선언
        int number = 20;
//        int point = 78.9; // 선언타입이 다르면 저장 불가

        number = 70;
        System.out.println("number = " + number);

        int tripleNumber = number * 3;
        System.out.println("tripleNumber = " + tripleNumber);

        //문자열을 저장하는 타입 string
        String name = "김철수";
        System.out.println("name = " + name);

        //변수의 범위: 변수는 선언된 블록을 벗어나면 메모리에서 제거된다.
        int n1 = 1, n2 = 2;

        if (true) {
            int n3 = n1 + n2;

        } //end if
        int n3 = 100;
        //System.out.println(n3);
    } //end main
    //int n4 = n1 + n2;
}// end class
