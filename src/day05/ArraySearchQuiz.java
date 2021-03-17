package day05;

import java.util.*;

public class ArraySearchQuiz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] member = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};

        System.out.println("- 수정할 멤버의 이름을 입력하세요");
        String targetMember = sc.next();

        boolean containMember = false;

        int i;
        for (i = 0; i < member.length ; i++) {
            if(targetMember.equals(member[i])) {
                containMember=true;
                break;
            }

        }
        if(containMember) {
            System.out.println("수정할 멤버의 이름을 입력하세요.");
            member[i] = sc.next();
            System.out.println(targetMember+ "의 별명을변경합니다." + Arrays.toString(member));
        } else {
            System.out.println(targetMember + "는 없는 이름입니다.");
        }

    }
}
