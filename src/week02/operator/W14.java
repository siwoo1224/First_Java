package week02.operator;

public class W14 {
    public static void main(String[] args) {
        // switch/case 문

        int month = 8;
        String monthString = "";
        // swich문
        // swich : 변경  .... 하나하나씩 변경해 가면서 비교를 한다
        switch (month) {
            // case~~~ 연산
            case 1:
                monthString = "1월";
                break;
            case 2:
                monthString = "2월";
                break;
            case 3:
                monthString = "3월";
                break;
            case 4:
                monthString = "4월";
                break;
            case 5:
                monthString = "5월";
                break;
            case 6:
                monthString = "6월";
                break;
            case 7:
                monthString = "7월";
                break;
            case 8:
                monthString = "8월";
                break;
            case 9:
                monthString = "9월";
                break;
            case 10:
                monthString = "10월";
                break;
            case 11:
                monthString = "11월";
                break;
            case 12:
                monthString = "12월";
                break;
            default:
                monthString = "알수 없음";
        }
        System.out.println(monthString); // 8월 출력
    }
}
