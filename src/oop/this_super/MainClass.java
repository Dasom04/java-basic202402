package oop.this_super;

public class MainClass {

    public static void main(String[] args) {

    player p1 = new player();
    p1.name = "플레이어1";
    p1.characterInfo();

    System.out.println("-------------------");

    player p2 = new player("플레이어2");
    p2.characterInfo();

    System.out.println("-------------------");

    player p3 = new player("플레이어3",100);
    p3.characterInfo();

        System.out.println("--------------------");

        p1.attack(p2);
        p2.attack(p3);
        p3.attack(p1);

        System.out.println("--------------------");

        Warrior w1 = new Warrior("전사짜짱맨");
        w1.characterInfo();
    }

}
