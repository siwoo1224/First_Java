package week02.colection;

import java.util.Stack;

public class Col3 {
    // Stack
    // push, peek, pop
    // 수직으로 값을 쌓아놓고, 넣었다가 뺀다, FILO(Basket)[바구니] First-In Last-Out
    // 최근 저장된 데이터를 나열하고 싶거나, 데이터의 중복 처리를 막고 싶을 때 사용

    public static void main(String[] args) {
        Stack<Integer> intStack = new Stack<Integer>(); // 선언 및 생성

        intStack.push(10);
        intStack.push(15);
        intStack.push(1);

        // 다 지워질 때 까지 출력
        while (!intStack.isEmpty()) {
            System.out.println(intStack.pop()); //pop : intStack 최상단에 있는 값을 뽑아온다
            //1
            //15
            //10
        }

        //다시 추가
        intStack.push(10);
        intStack.push(15);
        intStack.push(1);

        // peak : 조회
        System.out.println(intStack.peek()); //맨위에 있는 1이 찍힘
        System.out.println(intStack.size()); // 3
    }
}
