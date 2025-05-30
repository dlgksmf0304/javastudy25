package ch04.finaltest;

public class PersonExam {

	public static void main(String[] args) {
		// final연습 main메서드

		Person user = new Person("123456-1234567", "이하늘");
		
		System.out.println("이름 : " + user.name);
		System.out.println("국가 : " + user.nation);
		System.out.println("주민번호 : " + user.ssn);
		
		//neme은 final로 하지 않았기 때문에 이름이 바뀌지만
		//natioㅜ, ssn은 final로 선언했기 때문에 바뀌지 않는다.
		user.name = "하늘";
		
		System.out.println("이름 : " + user.name);
		System.out.println("국가 : " + user.nation);
		System.out.println("주민번호 : " + user.ssn);
		
		
	}//main메서드 종료

}//클래스 종료
