package day08.player;

public class main {

    public static void main(String[] args) {

        Player kim = new Player("김철수");
        System.out.println("==================================");
        Player park = new Player("박영희", 20);

        kim.info();
        park.info();


        System.out.println("kim의 주소값: " + kim);
        System.out.println("park의 주소값: " + park);

        kim.attack(new Player("고길동"));



    }
}//end
