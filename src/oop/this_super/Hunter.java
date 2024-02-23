package oop.this_super;

public class Hunter extends player {
     String pet;

    @Override
    void characterInfo() {
        super.characterInfo();
        System.out.println("# 펫 이름: " + pet);
    }
}
