import java.util.*;

public class Main {

    static int count = 0; //시도 횟수
    static List<Integer> com = new ArrayList<>(); //컴퓨터
    static List<Integer> usern = new ArrayList<>(); // 유저
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main.comRandom(); // 컴퓨터 랜덤 함수
        System.out.println(com);

        while (true){
            System.out.print((count + 1) + "번째 시도 : ");
            int user = scanner.nextInt();
            Main.userNumber(user);

            int total = Main.diff(com, usern); // 컴퓨터랑 같은 숫자 수
            int s = Main.strike(com, usern);   // 스트라이크
            int b = total - s;                 // 컴퓨터랑 같은 수에서 스트라이크 빼면 볼

            System.out.println(b + "B" + s + "S");
            count++;    //시도 횟수
            if(s == 3){
                System.out.println(count + "만에 맞히셨습니다.");
                break;
            }
        }
    }

    private static int strike(List<Integer> com, List<Integer> usern) {
        int s = 0;
        // 스트라이크
        for (int i = 0; i < com.size(); i++) {
            if(com.get(i) == usern.get(i)){
                s++;
            }
        }
        return s;
    }

    private static int diff(List<Integer> com, List<Integer> usern) {
        int result = 0;
        // 숫자 같은 횟수
        for (int i = 0; i < com.size(); i++) {
            if(com.contains(usern.get(i))){
                result++;
            }
        }
        return result;
    }

    private static void userNumber(int user) {
        usern.clear();
        String num = Integer.toString(user);
        if(num != null) {
            for (int j = 0; usern.size() < 3; ) {
                usern.add(num.charAt(j) - '0');
                j++;
            }
        }
        System.out.println(usern);
    }

    public static void comRandom(){
        Random random = new Random();
        for (int i = 0; com.size() < 3; i++) {
            int n = random.nextInt(10);
            if(com.contains(n)){
                continue;
            }
            com.add(n);
        }
        System.out.println("컴퓨터가 숫자를 생성하였습니다. 답을 맞춰보세요!");
    }
}
