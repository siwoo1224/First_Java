package week02.operator;
import java.util.*;

public class W17 {
    public static void main(String[] args) {
        //입력받은 단을 제외하고 출력!!
        Scanner sc = new Scanner(System.in);
        int passNum = sc.nextInt(); //출력을 제외할 구구단수 값

//        // 구구단!!!
//        for(int i = 2; i <=9; i++){ //구구단의 첫번째
//            if(i == passNum){
//                continue;
//            }
//            for (int j = 1; j<9; j++){
//                System.out.println(i + "x" + j + "=" + (i*j));
//            }
//        }

        for(int i = 2; i <= 9; i++){ //구구단의 첫번째
            for (int j = 1; j<=9; j++){
                if(i == passNum){
                    System.out.println(i + "x" + j + "=" + (i*j));
                }
            }
        }
    }
}
