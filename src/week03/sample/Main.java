package week03.sample;

// 지역 변수
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.getNumber());
        System.out.println(main.getNumber());
    }
//    //기본생성자 (생략가능)
//    public Main(){}

    // 메서드
    public int getNumber(){
        //지역변수 휠발성....  <-> 전역변수
        // 해당 메서드가 실행될 때 마다 독립적인 값을 저장하고 관리합니다.
        // 이지역변수는 메서드 내부에서 정의될 때 생성된다.
        // 이 메서드가 종료될 때 소멸된다.
        int number = 1;
        number += 1; // number = bumber + 1
        return number;
    }
}
