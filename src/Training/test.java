package Training;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[][] books = {
                {"A000", "소설책제목", "소설저자", "소설출판사", "소설가격", "소설선호도"},
                {"B100", "인문책제목", "인문저자", "인문출판사", "인문가격", "인문선호도"},
                {"C200", "과학책제목", "과학저자", "과학출판사", "과학가격", "과학선호도"},
                {"D300", "컴퓨터책제목", "컴퓨터저자", "컴퓨터출판사", "컴퓨터가격", "컴퓨터선호도"}
        };

        //추가할 도서를 배열로 생성

        //String firstBook = books[0][0];
        for (int bookNumber = 0; bookNumber <books.length; bookNumber++) {
        }


        System.out.println(" 찾으시는 도서를 입력하세요!.");
        String bookInformation = sc.next();

        //도서 탐색
        boolean containBook = false;

        int i;
        for (i = 0; i < books.length; i++) {
            if (bookInformation.equals(books[i][i])) {
                containBook = true;
                break;
            }
        }

        if (containBook) {
            System.out.println("===============================도 서 정 보===============================");
            books[i][i] = sc.next();
        }


        for (String[] book : books) {
            System.out.println("===============================도 서 정 보 ============================================================");
            System.out.println("번호 \t\t 제목 \t\t     저자 \t\t       출판사\t\t   가격 \t\t     선호도");
            System.out.println("=======================================================================================================");
            for (String bookSearch : book) {
                System.out.print(bookSearch + "\t\t");
            }
            System.out.println();
        }
/*
        if (containBook) {
            System.out.println("===============================도 서 정 보===============================");
            System.out.printf("번호: \t\t 제목: \t\t 저자: \t\t 출판사: \t\t 가격: \t\t 선호도:", books[0][0], books[0][1], books[0][2], books[0][3], books[0][4], books[0][5]);
            System.out.println("===============================도 서 정 보===============================");

        }*/
    }
}





