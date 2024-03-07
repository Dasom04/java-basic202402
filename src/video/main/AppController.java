package video.main;

import video.common.AppService;
import video.movie.service.MovieService;
import video.oder.service.OderService;
import video.user.service.UserService;

public class AppController {

    private AppService service;

    // 선택한 메뉴에 따라 시스템을 정해주느 니능
    public void  chooseSystem (int selectNumber) {
        switch (selectNumber) {
            case 1:
                service = new UserService();
                break;
            case 2:
                service = new OderService();
                break;
            case 3:
                service = new MovieService();
                break;
            case 4:
                System.out.println("# 프로그램을 종료합니다.");
                System.exit(0);

            default:
                System.out.println("# 메뉴를 다시 입력해 주세요!");
        }

        service.start();
    }

}
