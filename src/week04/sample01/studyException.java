package week04.sample01;

public class studyException {
    public static void main(String[] args) {
        OurClass ourClass = new OurClass();

        // try ~ catch ~ finally 구문
        // try : 시도하다
        // catch : 잡다(붙잡다)
        // finally : 마침내

        // 일단 try해 ~~~ 그리고, 예외가 발생하면 그걸 잡아!!(catch)
        // 그리고, 정상적으로 수행되든, 예외가 발생하든 결국, 마침내 수행돼야 하는 로직을 'finally' 수행해..!!

        try {
            // 일단 실행!!
            ourClass.thisMethodIsDangerous();
        } catch (OurBadException e) {
            System.out.println(e.getMessage());
        } finally {
            // 무조건 여기는 거친다!!
            System.out.println("우리는 방금 예외를 handling 했습니다. 정상처리되든, 예외사항이 발생하든 무조건 거친다.");
        }
    }
}
