package ch05.extendss.test;

public class DmbCellPhoneExam {

	public static void main(String[] args) {
		// 상속연습 main메서드
		DmbCallPhone dmbphone = new DmbCallPhone("디엠비폰", "빨강", 10);
		//생성자로 초기값을 전달 (모델명, 색상, 채널번호)
		
		System.out.println("모델 : " + dmbphone.model);
		System.out.println("색상 : " + dmbphone.color);
		//부모---------------------------------------------
		System.out.println("채널 : " + dmbphone.channel);
		System.out.println("====================");
		//자식-------------------------------------------
		
		dmbphone.powerOn();//전원켜기
		dmbphone.powerOff();//전원끄기
		dmbphone.sendVoice("여보세요");
		dmbphone.receiveVoice("여보세요");
		dmbphone.sendVoice("누구세요?");
		dmbphone.receiveVoice("상속 연습중입나다.");
		dmbphone.receiveVoice("연습을 종료합니다.");
		dmbphone.hanagup();//전화종료
		System.out.println("===================");
		
		dmbphone.turnOnDmb();
		dmbphone.changeChannelDmb(12);
		dmbphone.turnOffDmb();
		
	}//main메서드 종료

}//클래스 종료
