package ch04;

import java.util.Calendar;

public class EnumWeekExam {

	public static void main(String[] args) {
		// 이뮴에 쓴 객체 가져오기
		
		Week today = null;
		
		Calendar calendar = Calendar.getInstance();
		
		int year = calendar.get(calendar.YEAR);//내장된 년도를 가져옴
		int month = calendar.get(calendar.MARCH)+1;//0부터 시작하기 때문에 +1을 해줘야한다.
		int day = calendar.get(calendar.DAY_OF_MONTH);//며칠인지 계산해주는 변수
		int week = calendar.get(calendar.DAY_OF_WEEK);
		//DAY_OF_WEEK가 int타입이기 때문에 switch 타입으로 변환 해줘야한다.
		
		switch(week) {//요일 번호를 바꾸는용 스위치문
		case 1 : 
			today = Week.SUNDAY;
			break;
		case 2 : 
			today = Week.MONDAY;
			break;
		case 3 : 
			today = Week.TUESDAY;
			break;
		case 4 : 
			today = Week.WEDNESDAY;
			break;
		case 5 : 
			today = Week.THURSDAY;
			break;
		case 6 : 
			today = Week.FRIDAY;
			break;
		case 7 : 
			today = Week.SATURDAY;
			break;
		}//switch 종료
		
		System.out.println("날짜는 : " + year + "년 " + month + "월 "
							+ day + "일 " + today + "입니다.");
		
		int hour = calendar.get(calendar.HOUR);
		int minute = calendar.get(calendar.MINUTE);
		int second = calendar.get(calendar.SECOND);
		
		System.out.println("현재시간은 : " + hour + "시 " + minute + "분 "
							+ second + "초 입니다.");
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일입니다. 내일 학원 갈 준비를 합니다.");
		}else if(today == Week.MONDAY) {
			System.out.println("월요일입니다. 학원에 왔습니다.");
		}else if(today == Week.TUESDAY) {
			System.out.println("화요일입니다. 자바공부를 합니다.");
		}else if(today == Week.WEDNESDAY) {
			System.out.println("수요일입니다. 데이터베이스를 공부합니다.");
		}else if(today == Week.THURSDAY) {
			System.out.println("목요일입니다. jsp공부를 합니다.");
		}else if(today == Week.FRIDAY) {
			System.out.println("금요일입니다. 불금을 즐깁니다.");
		}else if(today == Week.SATURDAY) {
			System.out.println("토요일입니다. 집에서 쉽니다.");
		}//	if문 종료
		

	}//main 메서드 종료

}//클래스 종료
