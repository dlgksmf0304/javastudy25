package ch02;

public class SwitchStringExam {

	public static void main(String[] args) {
		// string을 써서 switch문을 만들수있다.
		
		String position = "사원";
		//원하는 직급 선택
		
		switch (position) {
		
		case "부장" :
			System.out.println(position + "님의 월급은 500만원입니다.");
			break;//멈춰주는 역할
		case "과장" :
			System.out.println(position + "님의 월급은 400만원입니다.");
			break;
		case "대리" :
			System.out.println(position + "님의 월급은 300만원입니다.");
			break;
		case "사원" :
			System.out.println(position + "의 월급은 200만원입니다.");
			break;
		default :
			System.out.println("직급을 정확히 입력하세요.");
		
		}// 스위치문 종료

	}//main 메서드 종료

}//클래스종료
