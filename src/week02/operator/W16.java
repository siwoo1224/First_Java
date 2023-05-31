package week02.operator;

public class W16 {
    public static void main(String[] args) {
//        int number = 0;
//
//        // ~하는 동안
//        while(number < 3) { // number < 3 인 동안~~
//            number++;
//            System.out.println(number + "출력");
//        }

//         do ~ while
//        int number = 4;
//        do {
//            // 이 로직을 먼저 수행하겠다!!
//            System.out.println(number + "출력");
//        } while(number < 3); // 연산을 한번 수행 후 조건문 체크

        // break (개부수다)
        // 가장 가까운 블록의 for문 또는 while, switch문을 중단!
//        int number = 0;
//        while (number < 3){
//            number++;
//            if(number == 2){
//                break;
//            }
//            System.out.println(number + "출력");
//        }

//        for(int i=0; i<10; i++){
//            System.out.println("i: " + i);
//            if(i==2){
//                break; // i가 2일때, 가장 바깥 반복문이 종료
//            }
//            for (int j=0; j < 10; j++){
//                System.out.println("j : " + j);
//                if (j==2){
//                    break; // j가 2일때, 안쪽반복문이 종료
//                }
//            }
//        }

        // continue
        int number = 0;
        while ( number < 3){
            number++;
            if(number == 2){
                continue;
            }
            System.out.println(number + "출력!");
        }
    }
}
