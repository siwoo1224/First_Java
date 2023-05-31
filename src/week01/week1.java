package week01;// 숫자 -> 문자
import java.util.Scanner;

//클래스
// public : (접근)제어자, public(공공의, 공통의)
public class week1 {

    // [JDK]
    // (1) compiler : .java -> .class
    // (2) JRE
    // (3) JDB : 디버깅

    // () : 소괄호
    // {} : 중괄호
    // [] : 대괄호

    // main 메소드
    // 자바 프로젝트(앱)는, 제일 먼저 클래스의 main 메소드를 실행시킨다.
    // = JVM의 약속
    // static : 이 프로그램이 시작될 때 무조건 실행되는 녀석임을 표현

    // void : 메서드의 출력값의 데이터 타입
    // void : "아무것도 없다." -> 출력은 없다.

    // input
    // String[] args : 매개변수 자리
    public static void main(String[] args) {

        // 객체 : 특징(속성, 변수), 행동(메소드) [동사]
        // print -> 줄 바꿈은 하지 x
        // println -> 줄 바꿈 o
        // ln : line
        //System.out.print("Our First Project! ");

        // 1. 7
        // 2. 3
        // 3. 3.14
        // 4. JAVA
//        System.out.println(7);
//        System.out.println(3);
//        System.out.println(3.14);
//        System.out.println("JAVA");

        //========================================================================================================
//        int number; // number 라는 이름의 int(숫자)타입의 저장공간을 선언
//        String name; // name 이라는 이름의 String(문자열)타입의 저장공간을 선언

        //int number = 10; // 1. 선언과 동시에 값을 저장공간에 저장 (=초기화)
//        number = 11; // 2. 선언 이후에 다른값을 저장공간에 저장

        //int number = 10; // 1. 변수로 선언 및 초기화
//        number = 11; // 2. 변수의 값을 바꾼다. (덮어쓰기)

        //final int number = 10; // 1. 상수로 선언 (데이터 타입 앞에 final 을 붙이면 됩니다.)
        //number = 11; // e2. 변수의 값을 바꾸려고하면 에러가 납니다!

        //========================================================================================================
        //기본형 변수
        // (1) 논리형
//        boolean flag = true; // 1. 논리형 변수 boolean 으로 선언 및 True 값으로 초기화
//        flag = false; // 2. False 값으로도 저장할 수 있습니다.

        // (2) 문자형
//        char alphabet = 'A'; // 문자 하나를 저장합니다.

        // (3) 정수형
//        byte byteNumber = 127; // byte 는 -128 ~ 127 범위의 숫자만 저장 가능합니다.
//        short shortNumber = 32767; // short 는 -32,768~32,767 범위의 숫자만 저장 가능합니다.
//        int intNumber = 2147483647; // int 는 -21억~21억 범위의 숫자만 저장 가능합니다.
//        long longNumber = 2147483647L; // long 은 숫자뒤에 알파벳 L 을 붙여서 표기하며 매우 큰수를 저장 가능합니다.

        // (4) 실수형
//        float floatNumber = 0.123f; // float 는 4byte 로 3.4 * 10^38 범위를 표현하는 실수값
//        double doubleNumber = 0.123123123; // double 은 8byte 로 1.7 * 10^308 범위를 표현하는 실수값

        //========================================================================================================
        // 참조형 변수
        // (1) 문자열 변수
//        String message = "Hello World"; // 문자열을 저장합니다.

        // (2) 배열(Array)
//        int[] a = {1, 2, 3};

//        System.out.println(a); //주소값 출력
//        System.out.println(Arrays.toString(a)); // {1, 2, 3}
        //========================================================================================================
        // 래퍼 클래스(Wrapper Class 변수)
//        int number2 = 21;
//        Integer num =  number2; // boxing

//        System.out.println(num.intValue()); // unboxing

        //========================================================================================================
//        Scanner sc = new Scanner(System.in);

//        int asciiNumber = sc.nextInt();
//        char ch = (char)asciiNumber; // 문자로 형변환을 해주면 숫자에 맞는 문자로 표현됩니다.

//        System.out.println(ch);
        //========================================================================================================
//        Scanner sc2 = new Scanner(System.in);

//        char letter = sc2.nextLine().charAt(0); // 첫번째 글자만 받아오기위해 charAt(0) 메서드를 사용합니다.
//        int asciiNumber2 = (int)letter; // 숫자로 형변환을 해주면 저장되어있던 아스키 숫자값으로 표현됩니다.

//        System.out.println(asciiNumber);
        //========================================================================================================
        // 형 변환 예제 : 변수의 타입을 바꾸는 방법
        // 문자열 -> 숫자
        // 정수 -> 실수
        // 실수 -> 정수

        // double형 or float형 -> int
        // 실수 -> 정수(0.xxxx -> 0)
//        double doubleNumber = 10.101010;
//        float floatNumber = 10.101010f; // float변수는 뒤에 f 붙여줘야함

        // 변환(int)
//        int intNumber;
//        intNumber = (int)doubleNumber; // double -> int 형변환
//        intNumber = (int)floatNumber; // float -> int 형변환
//        double doubleNumber = (double)intNumber; // int -> double 형변환
//        float floatNumber = (float)intNumber;  // int -> float 형변환

//        System.out.println("Int Type =>" + intNumber);
//        System.out.println("Double Type =>" + doubleNumber);

//        System.out.println("Double Type =>" + doubleNumber2);
//        System.out.println("Int Type =>" + intNumber2);
        //========================================================================================================
        // 변수 타입별 크기 순서
        // byte(1) → short(2) → int(4) → long(8) → float(4) → double(8)

        // (1) byte -> int
//        byte byteNumber = 10;
//        int intNumber = byteNumber;    // byte -> int 형변환
//        System.out.println(intNumber); // 10

        // (2) char(1 byte) -> int(4 byte) 형변환
//        char charAlphabet = 'A';
//        intNumber = charAlphabet;   // char -> int 형변환
//        System.out.println(intNumber); // A의 유니코드 : 65

        // (3) int -> long number 형변환
//        intNumber = 100;
//        long longNumber = intNumber; // int -> number 형변환
//        System.out.println(longNumber); // 100

        // (4) int -> double 형 변환
//        intNumber = 200;
//        double doubleNumber = intNumber; // int -> double 형변환
//        System.out.println(doubleNumber); // 200.0  (소수점이 추가된 실수출력)
        //========================================================================================================
        //작은 크기의 타입이 큰 크기의 타입과 '계산'될 때,
        // 자동으로 큰 크기의 타입으로 형 변환이 된다.
//        int intNumber = 10;
//        double doubleNumber = 5.5;
//        double result = intNumber + doubleNumber; // result 에 15.5 저장됨 (int -> double)

        // 1) 정수로 나누기
//        intNumber = 10;
//        int iResult = intNumber / 4; // iResult 에 2 저장됨 (int형 연산 -> 소수점 버려짐)

        // 2) 실수로 나누기
//        intNumber = 10;
//        double dResult = intNumber / 4.0; // dResult 에 2.5 저장됨 (double형 연산 -> 소수점 저장)
        //========================================================================================================\
        // 과제
        Scanner sc = new Scanner(System.in);

        String title = sc.nextLine();
        float star = sc.nextFloat();
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();
        String input3 = sc.nextLine();
        String input4 = sc.nextLine();
        String input5 = sc.nextLine();
        String input6 = sc.nextLine();
        String input7 = sc.nextLine();
        String input8 = sc.nextLine();
        String input9 = sc.nextLine();
        String input10 = sc.nextLine();

        System.out.println("[ " + title + " ]"); // 제목
        int intRate = (int)star; // 강제 형변환 star(float)
        double percentageRate = intRate * 100 / 5.0;
        System.out.println("별점 : " + intRate + "(" + percentageRate + " %)");
        System.out.println("1." + input1);
        System.out.println("2." + input2);
        System.out.println("3." + input3);
        System.out.println("4." + input4);
        System.out.println("5." + input5);
        System.out.println("6." + input6);
        System.out.println("7." + input7);
        System.out.println("8." + input8);
        System.out.println("9." + input9);
        System.out.println("10." + input10);
    }
}