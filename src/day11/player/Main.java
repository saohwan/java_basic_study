package day11.player;

import day09.inherit.player.Mage;
import day09.inherit.player.Warrior;
import day09.inherit.player.Hunter;

public class Main {

    public static void main(String[] args) {

       Warrior w = new Warrior("봉사왕김파괴");
       Mage m = new Mage("메테오킹불바다");
       Hunter h = new Hunter("활팡팡팡");

       m.meteo();
        System.out.println("========================");
       m.meteo(h, m, w, new Warrior("말썽쟁이전사"), new Mage("블리자드왕눈보라"));
        System.out.println("========================");

        w.fireSlash(new Warrior("말썽꾸러기"));
        w.fireSlash(m);
        w.fireSlash(h);
        //마법사는 20
        //전사는 10
        //헌터는 15

        System.out.println("========================");
        h.frozenShot(new Hunter("활팡팡팡팡"), w, m);


    }
}
