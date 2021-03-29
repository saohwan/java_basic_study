package day08.player;

public class Player {

    String name;
    int level;
    int hp;
    Player() {
        this("이름없음", 1);
    }

    Player(String name) {
        //this(),super()는 반드시 생성자의 첫라인에 기술
        this(name, 1 ); //나의 다른 생성자를 연계호출하겠다
        System.out.println("2번 생성자 호출!");
    }

    Player(String name, int level) {
        System.out.println("3번 생성자 호출!");

        this.name = name;
        this.level = level;
        this.hp = this.level * 50;
    }

    void attack2(Player target) {
        System.out.printf("%s가 %s를 공격합니다.\n", this.name, target.name);
    }

    void info() {
        System.out.printf("이름: %s , 레벨 : %d , 체력: %d\n" , this.name,this.level,this.hp);
    }

    void attack( Player target) {
        System.out.println("===========================");
        System.out.println("targer의 주소값: " + target);
        System.out.println("this의 주소값 : " + this);

        System.out.println("맞은플레이어 이름: " + target.name);
        System.out.println("때린 플레이어 이름: " + this.name);

    }


}
