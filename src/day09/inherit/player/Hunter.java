package day09.inherit.player;

public class Hunter extends Player {

    String beast;

    public Hunter(String nickName) {
        super(nickName);
        this.beast = "멍멍이";
    }

    @Override
    public void info() {
        super.info();
        System.out.println("# 동물: " + beast);
    }

    public void frozenShot(Player... targets) {

        //모든이에게 랜덤 데미지
        if (targets.length > 0) {

            System.out.printf("# %s님 냉동샷 발사!\n", this.getNickName());

            for (Player target : targets) {

                if (target == this) continue;

                if (target.hp >= 5) {
                    int damage = (int) (Math.random() * 3) + 10;
                    target.hp -= damage;
                    System.out.printf("%s님이 %d의 피해를 입었습니다. (남은 체력: %d)\n", target.getNickName(), damage, target.hp);

                } else {
                    System.out.printf("# %s님의 hp는 %d임으로 공격대상이 아닙니다. (남은 체력: %d)\n", target.getNickName(), target.hp,target.hp);
                }

            }

        }
    }
}
