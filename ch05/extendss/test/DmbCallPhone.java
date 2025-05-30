package ch05.extendss.test;

public class DmbCallPhone extends CallPhone{//부모선택
	//상속연습 자식
	
	int channel; //자식 필드 추가

	// 생성자=========================================================
	public DmbCallPhone(String model, String color, int channel) {
		this.model = model ;
		this.color = color ;//부모필드
		this.channel = channel;//자식필드
	}
	
	//메서드=========================================================
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB방송 수신을 시작합니다.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널을 " + channel + "번으로 변경합니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 중지합니다.");
	}

	
		
}
