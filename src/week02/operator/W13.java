package week02.operator;

// 조건문으로 가위바위보 만들기

import java.util.Objects;
import java.util.Scanner;

public class W13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // A에게 값 입력받기
        System.out.print("A 입력 : ");
        String aHand = sc.nextLine(); // A 입력
        // B에게 값 입력받기
        System.out.print("B 입력 : ");
        String bHand = sc.nextLine(); // B 입력

        // 두 개의 값을 비교하는 메서드 -> Objects.equals(좌, 우) : 좌 우가 같은 경우 true, 다른경우 fasle
        if (Objects.equals(aHand, "가위")) { // 값을 비교하는 Obects.equals() 메서드 사용
            if (Objects.equals(bHand, "가위")) {
                System.out.println("A 와 B 는 비겼습니다."); // A 와 B 의 입력값을 비교해서 결과 출력
            } else if (Objects.equals(bHand, "바위")) {
                System.out.println("B 가 이겼습니다.");
            } else if (Objects.equals(bHand, "보")) {
                System.out.println("A 가 이겼습니다.");
            } else {
                System.out.println(" B 유저 값을 잘못 입력하셨습니다.");
            }
        } else if (Objects.equals(aHand, "바위")) {
            if (Objects.equals(bHand, "가위")) {
                System.out.println("A 가 이겼습니다.");
            } else if (Objects.equals(bHand, "바위")) {
                System.out.println("A 와 B 는 비겼습니다.");
            } else if (Objects.equals(bHand, "보")) {
                System.out.println("B 가 이겼습니다.");
            } else {
                System.out.println(" B 유저 값을 잘못 입력하셨습니다.");
            }
        } else if (Objects.equals(aHand, "보")) {
            if (Objects.equals(bHand, "가위")) {
                System.out.println("B 가 이겼습니다.");
            } else if (Objects.equals(bHand, "바위")) {
                System.out.println("A 가 이겼습니다.");
            } else if (Objects.equals(bHand, "보")) {
                System.out.println("A 와 B 는 비겼습니다.");
            }else {
                System.out.println(" B 유저 값을 잘못 입력하셨습니다.");
            }
        }else {
            System.out.println(" A 유저 값을 잘못 입력하셨습니다.");
        }
    }
}
// 입/출력 예시
// A 입력 : 가위
// B 입력 : 보
// A 가 이겼습니다.
