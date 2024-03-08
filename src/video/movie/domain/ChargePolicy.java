package video.movie.domain;

import java.time.LocalDate;

/**
 * 요금 정책
 * 1. 올해 출시된 영화는 기본적으로 5000원
 * 2. 출시 후 1년이 지날때 마다 500원식 차감
 * 3. 최소 요금은 2000원이며 그 밑으로 차감되지 않음.
 */
public class ChargePolicy {

     private static final int BASE_CHARGE = 5000;
     private static final int DISCOUNT = 500;
     private static final int LIMIT_CHARGE = 2000;

    // 전달된 Movie의 발행년도에 따른 가격을 개선하는 메서드
    public static int calculateDvdCharge(Movie movie) {
        // 올해 연도 첨부
        int thisYear = LocalDate.now().getYear();
        // 출시 후 경과년도 계산
        int movieAge = thisYear - movie.getPubYear();
        int charge = BASE_CHARGE - (movieAge * DISCOUNT);

        if(charge < LIMIT_CHARGE) {
            charge = LIMIT_CHARGE;
        }
        return charge;

    }


}









