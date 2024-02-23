package oop.inherit.good;

public class Hunter extends player{
     String pet;

    @Override
    void characterInfo() {
        super.characterInfo();
        System.out.println("# 펫 이름: " + pet);
    }
}
