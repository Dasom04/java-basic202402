package oop.inherit.good;

public class Mage extends  player{
    int mana;

    @Override
    void characterInfo() {
        super.characterInfo();
        System.out.println("# 마나: " + mana);
    }


}
