package day09.inherit.player;

public class Mage extends Player {

    int mana;

    public Mage(String nickName) {
        super(nickName);
        this.mana = 100;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("# 마력: " + mana);
    }

    public void meteo(Player...targets) {
        //타겟된 플레이어들은 10 ~ 15의 랜덤 피해를 입고
        //실제 hp에 반영되어야 하며, 자기 자신은 피해를 입지 않아야 함.

        //targets에는 메테오에 맞은 플레이어들이 있으니까
        //한명씩 꺼내서 10~15의 정수를 hp에서 차감시켜야함.
       /* for (int i = 0; i < targets.length ; i++) {
            int dm = (int)(Math.random() * 6) + 10;
            */

        if (targets.length > 0) {

            System.out.printf("# %s님 메테오 시전!!!!\n",this.getNickName());

            for (Player target : targets) {

                if (target == this) continue;

                //10~15정수 생성
                int damage = (int) (Math.random() * 6) + 10;
                target.hp -= damage; //체력 차감
                System.out.printf("%s님이 %d의 피해를 입었습니다.(남은 체력: %d)\n", target.getNickName(),damage,target.hp);

            }

            } else {
            System.out.println("# 타겟된 플레이어가 없습니다.");



        }

    }
}