package week02.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Arr02 {
    public static void main(String[] args) {
        //초기화

        //1.배열의 특정값 대입해서 선언
        int[] intArr = {1, 2, 3, 4, 5};
        String[] stringArray = {"a","b","c","d"};

        //2.for문을 통해서 대입
//        for (int i=0; i<intArr.length; i++){
//            intArr[i] = i;
//        }
//        System.out.println("===============================");
//        for (int i=0; i<intArr.length; i++){
//            System.out.println(intArr[i]);
//        }

        //배열의 주소를 모두 같은 값으로 초기화
        Arrays.fill(intArr, 1);

        for (int item: intArr){
            System.out.println(item);
        }
    }
}
