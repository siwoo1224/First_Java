package week02.operator;

public class W11 {
    public static void main(String[] args) {
        // 조건문
//        boolean flag = true;
//
//        if (flag) {
//            System.out.println("flag 값은 true 입니다."); // flag 값은 true 입니다. 출력
//        }

        // 조건문 with else
        boolean flag = false;

        if (flag) {
            System.out.println("flag 값은 true 입니다."); // 미출력
        } else {
            System.out.println("flag 값은 false 입니다."); // flag 값은 false 입니다. 출력
        }

        // 조건문 with else if
        int number = 2;

        if (number == 1) {
            System.out.println("number 값은 1 입니다."); // 미출력
        } else if (number == 2) {
            System.out.println("number 값은 2 입니다."); // number 값은 2 입니다. 출력
        } else {
            System.out.println("number 값은 모르는 값입니다."); // 미출력
        }


    }
}
