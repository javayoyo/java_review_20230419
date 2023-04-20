package ex;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {


      /*
        학생 정보를 다루는 StudentDTO 클래스 선언
        필드 : 번호(id), 이름(studentName), 학번 (studentNumber),
        전화번호 (studentMobile), 주소(studentAddress)
        main 메서드에서 StudentDTO 객체 선언하고 두명의 학생 정보를 각각
        필드값으로 저장하고 StudentDTO 객체를 담을 수 있는 ArrayList 에 저장하고
        반복문으로 리스트에 담긴 전체 데이터를 출력합시다.
        자동완성단축키 alt + insert
        */

//    List<StudentDTO> studentDTOList = new ArrayList<>();

    List<StudentDTO> studentDTOList = new ArrayList<>();



    // 기본 생성자를 이용한 객체(인스턴스) 생성
//    StudentDTO studentDTO = new StudentDTO();
// ㄴ 에러뜨는 이유 > 특정생성자 만들시 기본 생성자 사라짐


//
//    studentDTO.setId(1L);
//    studentDTO.setStudentName("학생1");
//    studentDTO.setStudentNumber("111111");
//    studentDTO.setStudentMobile("010-1234-5678");
//    studentDTO.setStudentAddress("인천");
//    studentDTOList.add(studentDTO);
StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(1L);
        studentDTO.setStudentName("학생1");
        studentDTO.setStudentNumber("11111111");
        studentDTO.setStudentMobile("010-1111-1111");
        studentDTO.setStudentAddress("인천광역시");
        studentDTOList.add(studentDTO);







 // 매개변수가 있는 생성자 이용
    studentDTO = new StudentDTO(2L, "학생2","22222",
                                "010-2222-2222","제주도");

    studentDTOList.add(studentDTO);

    for(int i =0; i< studentDTOList.size() ;i++) {
        System.out.println(studentDTOList.get(i));

}

    for(StudentDTO s : studentDTOList) {
        System.out.println("s = " +s);
    }
}
}


