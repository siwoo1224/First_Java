package week03;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(); //객체 생성

       // 메서드 호출 및 반환값을 저장
        double speed = car.gasPedal(100,'D');

        System.out.println("speed = "+speed);

        boolean lights = car.onOffLight();
        System.out.println("lights = " + lights);

        System.out.println();
        System.out.println("페달 밟고 난 후의 car.gear = " + car.gear);

        System.out.println();
        car.carSpeeds(100, 80);
        System.out.println();
        car.carSpeeds(110, 120, 150);
    }
}
