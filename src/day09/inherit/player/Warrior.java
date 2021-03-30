package day09.inherit.player;

//상위클래스로부터 상속받은 클래스를 자식, 하위 클래스(sub class)라고 부릅니다.
//상속은 is-a관계를 만족합니다.
public class Warrior extends Player {

    int rage;

    public Warrior(String nickName) {
        super(nickName);
        this.rage = 60;
    }

    @Override //오버라이딩 룰을 위반했는지 확인
    public void info() {
        super.info();
        System.out.println("# 분노: " + rage);
    }

    public void fireSlash(Player targets) {



              //마법사는 20
              //전사는 10
              //헌터는 15
              int aDamage = 20;
              int bDamage = 10;
              int cDamage = 15;

              if (targets instanceof Mage) {
                  targets.hp -= aDamage;
                  System.out.printf("%s님이 %d의 피해를 입었습니다.(남은 체력: %d)\n", targets.getNickName(),aDamage,targets.hp);
              } else if (targets instanceof Warrior) {
                  targets.hp -= bDamage;
                  System.out.printf("%s님이 %d의 피해를 입었습니다.(남은 체력: %d)\n", targets.getNickName(),cDamage,targets.hp);
              } else if (targets instanceof Hunter) {
                  targets.hp -= cDamage;
                  System.out.printf("%s님이 %d의 피해를 입었습니다.(남은 체력: %d)\n", targets.getNickName(),bDamage,targets.hp);
          }

      }
    }