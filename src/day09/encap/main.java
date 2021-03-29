package day09.encap;

public class main {

    public static void main(String[] args) {

        cat mycat = new cat("야옹이");
        mycat.setWeight(7.88);

        mycat.printWeight();

        double tripleWeight = mycat.getWeight(false) * 3;
    }
}
