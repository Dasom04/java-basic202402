package etc.api.lang.obj;

public class Mainclass {

    public static void main(String[] args) {

        Person kim = new Person("김춘식", 30);
        Person hong = new Person("홍길동", 25);

        // 객체 타입의 변수를 입력하거나 값을 얻을 때는
        //뒤에 자동으로 .toString()이 붙어서 진행됩니다. (Object가 물려주는 메서드)
        System.out.println(kim);
        System.out.println(hong);  // kim, hong 둘 다 주소가 나온다.

        if(kim.equals(hong)){
            System.out.println("이름과 나이가 같네요~");
        } else {
            System.out.println("이름이 다를 수도, 나이가 다를 수도, 둘 다 다를 수도");
        }

       // kim.equals(hong)  -> kim == hong 둘 다 동일한 내용

        System.out.println(kim.hashCode());
        System.out.println(hong.hashCode());

        // finalize는 gc를 호출하는 순서가 보장되지 않기 때문에
        // 사용이 권장되지 않습니다. (deprecated)
//        hong = null;
//        kim = null;
//        System.gc(); // 가비지 컬렉터를 호출. (부른다고 바로 안올 수 있습니다;;)

          Person park = new Person("박복제인간", 100);
//          Person clonePerson = park; // 객체 복사가 아니라 주소값 복사임

        try {
            Person clonePerson = (Person) park.clone();
            System.out.println("복사된 객체 정보: " + clonePerson);
           park.setName("박영희");
            System.out.println(park);
            System.out.println(clonePerson);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }


}
