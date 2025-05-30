package ch05.extendss.test;

public class Student extends People{ // 자식 클래스
	//상속 연습 2
	public int studentNO;

public Student(int studentNO, String name, String ssn) {
	super(name, ssn);// 부모생성자 호출
	// 기본생성자를 안했을경우 super에 호출한다.
	this.studentNO = studentNO;
}
	
	

}
