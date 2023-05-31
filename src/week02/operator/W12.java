package week02.operator;

public class W12 {
    public static void main(String[] args) {
        // 중첩 조건문
        boolean flag = true;
        int number = 2;

        if (flag) {
            if (number == 1) {
                System.out.println("flag 값은 true, number 값은 1 입니다."); // 미출력
            } else if (number == 2) {
                System.out.println("flag 값은 true, number 값은 2 입니다."); // flag 값은 true, number 값은 2 입니다. 출력
            }
        } else {
            if (number == 1) {
                System.out.println("flag 값은 false, number 값은 1 입니다."); // 미출력
            } else if (number == 2) {
                System.out.println("flag 값은 false, number 값은 2 입니다."); // 미출력
            }
        }
    }
}
