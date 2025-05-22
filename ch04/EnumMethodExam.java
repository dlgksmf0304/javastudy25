package ch04;

public class EnumMethodExam {

	public static void main(String[] args) {
		// name(), ordinal(), compareTo(), valueOf(), values()메서드 연습

		Week today = Week.FRIDAY ;
		//today라는 변수에 Week에서 가져온 FRIDAY를 넣음
		String name = today.name();
		System.out.println("객체의 이름 : " + name);
		
		int ordinal = today.ordinal();
		System.out.println("열거 순서 : " + ordinal);
		//Enum에서 쓴 순서
		//0번부터 시작한다.
		
		Week day = Week.FRIDAY;
		Week day1 = Week.THURSDAY;
		int result = day.compareTo(day1);
		int result1 = day1.compareTo(day);
		System.out.println(result);
		System.out.println(result1);
		//열거객체를 기준으로 전 후 몇번째에 위치하는지 비교
		//앞에있으면 음수, 뒤에있으면 양로 표기된다.
		
		
		Week weekday = Week.valueOf("MONDAY");
		if(weekday == Week.SUNDAY || weekday == Week.SATURDAY) {
			System.out.println("주말입니다.");
		}else {
			System.out.println("평일입니다.");
		}
		
		Week[] days = Week.values();
		for(Week a : days) {
			System.out.println(a + " ");
		}
		//열거타입의 모든 열거객체들을 배열로 만들어 리턴한다.
		//Enum에 작성한 모든 객체들이 나옴
		
		
		
		
	}//main 메서드 종료

}//클래스 종료
