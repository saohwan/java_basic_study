package day08.modi.member.pac1;

import day08.modi.member.pac1.D;

public class E {

    E() {
        D d =new D();

        d.f1 =1;
        d.f2 =2;
//        d.f3 =3; //private 접근자여서 D클래스에서 불러올 수 없음.

        d.m1();
        d.m2();
        //d.m3(); //private
    }
}
