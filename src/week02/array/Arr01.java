package week02.array;

public class Arr01 {
    public static void main(String[] args) {
        // 배열 생성

        //배열 생성후 초기화하면 배열의 주소가 할당된다.
        int[] intArray = new int[3]; // 초기값 {0,0,0}
        boolean[] boolArray = new boolean[3]; // 초기값 {false, false, false}
        String[] stringArray = new String[3]; // 초기값 {"","",""}

        //배열 선언만 해놓고 나중에 초기화를 시킬수도 있다.
        int[] intArray2;
        intArray2 = new int[3]; // 초기값 {0,0,0}

        //생성한 배열을 '순회' -> 배열의 값을 하나씩 뽑아서 조회한다.
        //(1) 단건 조회
        System.out.println(intArray[1]);

        //(2) 단건 조회
        for (int i=0; i<intArray2.length; i++){
            System.out.println(intArray2[i]);
        }
    }
}
