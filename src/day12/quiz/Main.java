package day12.quiz;

public class Main {

    public static class Tire {
        public void roll() {
            System.out.println("일반 타이어가 회전합니다.");
        }
    }

    public static class SnowTire extends Tire {

        @Override
        public void roll() {
            System.out.println("스노우 타이어가 회전합니다.");
        }

    }

    public static void main(String[] args) {

        SnowTire snowTire = new SnowTire();
        Tire tire = snowTire;

        snowTire.roll();
        tire.roll();
    }


}

