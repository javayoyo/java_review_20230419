package ex;// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

    /*
    * ex.HelloService 클래스 만들고 아래 요구사항에 맞는 메서드 정의
    ** hello1() 메서드
    * 리턴 없음
    * 매개변수 없음
    * 호출하면 hello1 이라고 호출
    *
    * hello2() 메서드
    * 리턴타입 : int
    * 매개변수 : String 타입 1개
    * 호출하면 매개변수로 넘겨 받은 변수의 길이가
    * 5 이상이면 1 리턴, 그렇지 않으면 0리턴
    *
    * main 메서드에서는 hello1, hello2 메서드를 각각 호출하고
    * hello2 메서드의 호출결과는 출력하도록 함
    *
    * */

//        sout enter 실행시 sysout 자동실행 / soutm

//    ex.HelloService helloService = new ex.HelloService();
//        alt + enter 단축키
        HelloService helloService = new HelloService();
        helloService.hello1();
        helloService.hello2("안녕하세요");

//        System.out.println("helloService = " + helloService);

//        soutv 변수값을 찍을 때 자동완성(자신과 가까이 있는 위의 대해서 )




        /*
        학생 정보를 다루는 StudentDTO 클래스 선언
        필드 : 번호(id), 이름(studentName), 학번 (studentNumber),
        전화번호 (studentMobile), 주소(studentAddress)
        main 메서드에서 StudentDTO 객체 선언하고 두명의 학생 정보를 각각
        필드값으로 저장하고 StudentDTO 객체를 담을 수 있는 ArrayList 에 저장하고
        반복문으로 리스트에 담긴 전체 데이터를 출력합시다.
        자동완성단축키 alt + insert
        */



    }
}