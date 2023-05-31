package week02.operator;

public class W15 {
    public static void main(String[] args) {
        // for문
        // (초기값 ; 조건문 ; 증가연산)
//        for (int i = 0; i < 10; i++){
//            System.out.println(i + "번째 출력!");
//        }

        // 향상된 for 문
        // 기존 : for문 안에 3개의 표현이 들어가죠 -> (초기값; 조건문; 증가연산)
        // 향상된 for문 : 2개로 줄여줌
//        int[] numbers = {3,6,9,12,15};
//        for(int number: numbers) {
//            System.out.print(number + " ");
//        }
        // 만약 기존 for 문으로 구현한다면?
        int[] numbers = {3,6,9,12,15};
        for(int i = 0; i < numbers.length; i++) { // 배열에 .length 를 붙이면 길이값이 응답됩니다.
            System.out.println(numbers[i] + " ");
        }
    }
}
