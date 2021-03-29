package day10.protec.pac2;

import day10.protec.pac1.A;

public class D extends A {


    protected D(String b) {
        //super(10);//default
        super("10");//protected

//        this.f1 = 10; //default 다른패키지에서 참조 불가능
        this.f2 = 10; //protected " 가능

//        m1(); //default
        m2(); // protected
    }
}
