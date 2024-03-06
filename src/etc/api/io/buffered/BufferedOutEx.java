package etc.api.io.buffered;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutEx {


    public static void main(String[] args) {


        System.out.println("시작");

        //dummy data
        StringBuilder text  =new StringBuilder();

        for (int i = 0; i < 1000000; i++) {
            text.append(i + "안녕하세요\n");
        }

        long start = System.currentTimeMillis();


        // buffered가 붙은 객체들은 기존에 사용했던 객체를 생성자의 매개값으로 전달.
        //ex) BufferedOutputStream -> FileOutputStream을 매개값으로 받아야 한다.
        // BufferedInputStream -> FileInputStream을 매개값으로 받아야 한다.
        try(FileOutputStream fos = new FileOutputStream("C:/MyWorkSpace/bout.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos)) {

            // 더미데이터를 stringBuilder로 생성.
            // 새로운 String 객체 생성 -> 생산자의 매개값으로 stringBuilder를 전달.
            // 바이트 제이터로 변환.
            String str = new String(text); //stringBuilder를 String으로 변환
            for (byte b : str.getBytes()) {
                bos.write(b);
            }

        }catch (Exception e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();
        System.out.println("소요시간: " + (end - start)*0.001 + "초");

    }
}
