package ch05.extendss.test;

public class StudentExam {

	public static void main(String[] args) {
		// 상속연습 2 main메서드
		Student st = new Student(15, "이하늘", "123456-1234567");
		
		System.out.println("이름 : " + st.name); //부모
		System.out.println("학번 : " + st.studentNO); //자식
		System.out.println("주민번호 : " + st.ssn);//부모
		
		
	}//main메서드 종료

}//클래스 종료
