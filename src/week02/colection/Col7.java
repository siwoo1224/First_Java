package week02.colection;

import java.util.*;

public class Col7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /////////숙제/////////
        while (true){
            System.out.println("=====================================================================");
            System.out.println("입력 가능한 자료 구조(소대문자 구분함) : List(list), Set(set), Hash(hash)");
            System.out.println("종료 : 멈춰!");
            String colection = sc.next();

            //리스트 구분
            if(colection.equals("List") || colection.equals("list")){
                System.out.println("제목을 입력하세요.");
                String title = sc.next();
                System.out.println("내용을 입력하세요. '끝' 입력시 메모 종료");
                ArrayList<String> strList = new ArrayList<>();
                while(true) {
                    String text = sc.next();
                    if(text.equals("끝")){
                        break;
                    }
                    strList.add(text);
                }//while end
                System.out.println("=====================================================================");
                System.out.println("[" + title + "(리스트)]");
                for(int i = 0; i < strList.size(); i++) {
                    System.out.println((i + 1) + "." + strList.get(i));
                }//for end
            } else if (colection.equals("Set") || colection.equals("set")) {
                System.out.println("제목을 입력하세요.");
                String title = sc.next();
                System.out.println("내용을 입력하세요. '끝' 입력시 메모 종료");
                //그냥 Set선언하면 순서와 상관없이 값이 출력
                //LinkedHashSet : 추가된 순서, 또는 가장 최근에 접근한 순서대로 접근 가능
                LinkedHashSet<String> strSet = new LinkedHashSet<String>(); //선언 및 생성
                while(true) {
                    String text = sc.next();
                    if(text.equals("끝")){
                        break;
                    }
                    strSet.add(text);
                }//while end
                System.out.println("=====================================================================");
                System.out.println("[" + title + "(셋)]");
                Iterator iterator = strSet.iterator(); //리스트를 순회할 수 있게 해주는 객체다
                for(int i = 0; i < strSet.size(); i++) {
                    System.out.println((i + 1) + "." + iterator.next());
                }//for end
            } else if (colection.equals("Hash") || colection.equals("hash")) {
                System.out.println("제목을 입력하세요.");
                String title = sc.next();
                System.out.println("내용을 입력하세요. '끝' 입력시 메모 종료");
                Map<Integer, String> strMap = new HashMap<>();
                int line = 1;
                while(true) {
                    String text = sc.next();
                    if(text.equals("끝")){
                        break;
                    }
                    strMap.put(line++, text); // line 1 들어가고 나서 ++ 실행
                }//while end
                System.out.println("=====================================================================");
                System.out.println("[" + title + "(해쉬)]");
                for(int i = 0; i<strMap.size(); i++){
                    System.out.println((i+1) + "." + strMap.get(i+1));
                }//for end
            } else if (colection.equals("멈춰!")) {
                System.out.println("종료!!!!!!!!");
                break;
            } else{
                System.out.println("해당 자료 구조 없음;;;;;");
            }
        }
    }
}
