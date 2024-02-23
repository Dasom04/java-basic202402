package oop.basic;

public class FieldMain {
    public static void main(String[] args) {

        FieldAndLocal fl = new FieldAndLocal();  // 실체가 있어야 사용이 가능하다.
        fl.a = 2;
        fl.printNumber(4);
        fl.foo();

    }
}
