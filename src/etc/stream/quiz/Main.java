package etc.stream.quiz;

import util.Utility;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.Integer.sum;
import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;
import static util.Utility.*;

public class Main {
    public static void main(String[] args) {

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = List.of(
                new Transaction(brian, 2021, 300),
                new Transaction(raoul, 2022, 1000),
                new Transaction(raoul, 2021, 400),
                new Transaction(mario, 2021, 710),
                new Transaction(mario, 2022, 700),
                new Transaction(alan, 2022, 950)
        );

        // 연습 1: 2021년에 발생한 모든 거래를 찾아 거래액 오름차 정렬(작은 값에서 큰 값).
        List<Transaction> tr2021 = transactions.stream()
                .filter(transaction -> transaction.getYear() == 2021)
                .sorted(comparing(Transaction::getValue))
                .collect(toList());

        tr2021.forEach(System.out::println);


        makeLine();

        // 연습 2: 거래자가 근무하는 모든 도시 이름을 중복 없이 나열하시오.
        List<String> cities = transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .collect(toList());

        System.out.println("cities = " + cities);


        makeLine();

        // 연습 3: Cambridge에 근무하는 모든 거래자를 찾아 거래자 리스트로 이름순으로 오름차 정렬.
        List<Trader> traders = transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .distinct() // 중복 제거
                .sorted(comparing(Trader::getName))
                .collect(toList());
        traders.forEach(System.out::println);


        makeLine();

        // 연습 4: 모든 거래자의 이름을 리스트에 모아서 알파벳순으로 오름차 정렬하여 반환
        List<String> nameList = transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct() // 중복 제거
     //           .sorted() // 순수 문자나 숫자는 Comparatar를 사용하지 않아도 됩니다.
                .collect(toList());

        Collections.sort(nameList); // 이미 우리가 알고 있는 평범한 정렬 방식.
        System.out.println("nameList = " + nameList);


        makeLine();

        // 연습 5: Milan에 거주하는 거래자가 한명이라도 있는지 여부 확인?
        boolean milan = transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .anyMatch(s -> s.equals("Milan"));
        System.out.println("milan = " + milan);


        makeLine();

        // 연습 6: Cambridge에 사는 거래자의 모든 거래액의 총합 출력.
        // stream 함수 중 sum 하면 끝남 없이도 할 수 있음
        List<String> cambridge = transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .filter(s -> s.equals("Cambridge"))
                .Sum
                .collect(toList());




        // 연습 7: 모든 거래에서 최고 거래액은 얼마인가?




        // 연습 8. 가장 작은 거래액을 가진 거래정보 탐색

    }
}
