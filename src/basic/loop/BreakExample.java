package basic.loop;

import java.util.Scanner;

public class BreakExample {
    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
            if(i > 6) break;
            System.out.print(i + " ");
        }
        System.out.println("\n 반복문 종료!");

        System.out.println("------------------------------------");

        for (int i = 1; i < 11; i++) {
            if(i == 6) continue;  // 조건식이 true일 때 그 부분만 건너 뛴다.
            System.out.print(i + " ");
        }
        System.out.println("\n 반복문 종료!");

        System.out.println("------------------------------------");

        Scanner sc = new Scanner(System.in);
        System.out.println("15 x 6 = ???");
        System.out.println("정답을 모르시면 0을 입력하시오.");

        while (true) {
            System.out.print("> ");
            int anwser = sc.nextInt();

            if(anwser == 90) {
                System.out.println("정답");
                break;
            } else if (anwser == 0) {
                System.out.println("정답은 90");
                break;
            } else {
                System.out.println("틀렸습니다.");
            }
        }
    }
}
