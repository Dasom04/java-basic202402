package oop.encap.good;

public class MainClass {
    public static void main(String[] args) {

        MyBirth my = new MyBirth();
//        my.year = 1992; (x)
        my.setYear(1992);
        my.setMonth(10);
        my.setDay(31);

        my.birthInfo();

//        System.out.printf("내 생일 연도는 %d년 %d %d 입니다.\n"
//                , my.getYear("aaa111"), my.getMonth(), my.getDay());


    }

}
