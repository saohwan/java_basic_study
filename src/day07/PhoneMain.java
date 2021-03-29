package day07;

//실행용 클래스는 main메서드를 포함합니다.
public class PhoneMain {

    public static void main(String[] args) {

        //객체의 생성

        Phone galaxyS20 = new Phone();
//        //객체의 속성과 기능을 참조 : 참조연산자 . 을 사용

        galaxyS20.showSpec();

        System.out.println("============================");

        Phone iPhoneX = new Phone("아이폰x");
        iPhoneX.showSpec();

        Phone LgV6 = new Phone("LG v6", "그레이");
        LgV6.showSpec();

        System.out.println("=======================================");

        galaxyS20.powerOff();
        iPhoneX.powerOff();

        galaxyS20.powerOn();
        iPhoneX.powerOn();
        galaxyS20.sendMessage(iPhoneX,"야 밥먹었냐?");


        iPhoneX.checkMessages();

        iPhoneX.sendMessage(galaxyS20, "어먹었다.");

        galaxyS20.checkMessages();

        galaxyS20.sendMessage(iPhoneX, "에베베베베베ㅔ베");
        galaxyS20.sendMessage(iPhoneX, "에베베베베베ㅔ베");
        galaxyS20.sendMessage(iPhoneX, "에베베베베베ㅔ베");
        galaxyS20.sendMessage(iPhoneX, "에베베베베베ㅔ베");
        galaxyS20.sendMessage(iPhoneX, "에베베베베베ㅔ베");
        galaxyS20.sendMessage(iPhoneX, "에베베베베베ㅔ베");

        galaxyS20.powerOn();
        galaxyS20.calculator3(2,3);

        //        galaxyS20.model = "갤럭시S20";
//        galaxyS20.color = "펄 블루";
//        galaxyS20.price = 1000000;
//
//        iphoneX.model = "아이폰X";
//        iphoneX.color = "스노우 화이트";
//        iphoneX.price = 1200000;
//
//        galaxyS20.powerOff();
//        galaxyS20.showSpec();
//
//        iphoneX.powerOn();
//        iphoneX.showSpec();


    }
}
