package oop.this_super;

public class MainClass {

    public static void main(String[] args) {

    player p1 = new player();
    p1.name = "플레이어1";
    p1.characterInfo();

    System.out.println("-------------------");

    player p2 = new player("플레이어2");
        System.out.println("main에서 p2의 주소값" +p2);
    p2.characterInfo();

    System.out.println("-------------------");

    player p3 = new player("플레이어2");
    System.out.println("main에서 p2의 주소값" +p3);
    p2.characterInfo();



    }





}
