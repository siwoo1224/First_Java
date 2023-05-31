package week02.array;

// 깊은 복사 메서드

import java.util.Arrays;

public class Arr04 {
    public static void main(String[] args) {
        // 깊은 복사 메서드
        // 1. clone() 메서드
//        int[] a = { 1, 2, 3, 4 };
//        int[] b = a.clone(); // 가장 간단한 방법입니다.
        // 하지만, clone() 메서드는 2차원이상 배열에서는 얕은 복사로 동작합니다!!


        // 2. Arrays.copyOf() 메서드
        // 복사기능
        int[] a = { 1, 2, 3, 4 };
        int[] b = Arrays.copyOf(a, a.length); // 배열과 함께 length값도 같이 넣어줍니다.
    }
}
