package oop.constructor;

import com.sun.tools.javac.Main;

public class PhoneMain {
    public static void main(String[] args) {

        Phone basic = new Phone();
        basic.showSpec();

        System.out.println("-------------------------");

        Phone galaxy = new Phone("galaxy");
        galaxy.showSpec();


        System.out.println("--------------------------");
        Phone iPhone = new Phone("아이폰 15", "스체이스 그레이");
        iPhone.showSpec();

    }
}
