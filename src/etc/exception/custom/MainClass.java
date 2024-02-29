package etc.exception.custom;

import java.sql.ResultSet;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        UserLogin user = new UserLogin("abc1234", "aaa1111!");

        System.out.print("id: ");
        String id = sc.next();

        System.out.print("pw: ");
        String pw = sc.next();

        try {
            String result = user.loginValidete(id, pw); // 여기로 객체 전달됨
            System.out.println("result = " + result);
        } catch (LoginValidateException e) {
            e.printStackTrace();  // 캐치문으로 이동
        }
        // 에러가 발생하면 객체가 생성된다. 메서드를 호출한 곳으로 던져진다.
        // 호출되는곳으로 예외객체가 던져진다.
        sc.close();

    }
}
