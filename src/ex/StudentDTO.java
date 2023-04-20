package ex;

public class StudentDTO {
       /*
        학생 정보를 다루는 StudentDTO 클래스 선언
        필드 : 번호(id), 이름(studentName), 학번 (studentNumber),
        전화번호 (studentMobile), 주소(studentAddress)
        main 메서드에서 StudentDTO 객체 선언하고 두명의 학생 정보를 각각
        필드값으로 저장하고 StudentDTO 객체를 담을 수 있는 ArrayList 에 저장하고
        반복문으로 리스트에 담긴 전체 데이터를 출력합시다.
        자동완성단축키 alt + insert
        */

    private Long id;
    private String studentName;
    private String studentNumber;
    private String studentMobile;
    private String studentAddress;

    // 기본 생성자 생성
    public StudentDTO() {
    }

    public StudentDTO(Long id, String studentName, String studentNumber, String studentMobile, String studentAddress) {

        this.id = id;
        this.studentName = studentName;
        this.studentNumber = studentNumber;
        this.studentMobile = studentMobile;
        this.studentAddress = studentAddress;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getStudentMobile() {
        return studentMobile;
    }

    public void setStudentMobile(String studentMobile) {
        this.studentMobile = studentMobile;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    // toString  // 오버라이드 > 재정의 /
    @Override
    public String toString() {
        return "StudentDTO{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", studentNumber='" + studentNumber + '\'' +
                ", studentMobile='" + studentMobile + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                '}';
    }
}
