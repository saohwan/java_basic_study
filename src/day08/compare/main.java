package day08.compare;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student kim1 = new Student("김철수");

        System.out.println("이름 : ");
        String inputName = sc.next();



        System.out.println("kim1 = " + kim1.name);
        System.out.println("inputName = " + inputName);

        System.out.println(kim1.name == inputName);
        System.out.println(kim1.name.equals(inputName));

    }
}
