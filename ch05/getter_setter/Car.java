package ch05.getter_setter;

public class Car {
	// getter_setter연습
	
	// 개인적인 필드===========================================
	private int speed;
	private boolean stop;
	
	
	// 공용 메서드 ===========================================
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
			return ;
		}else {
			this.speed = speed;
		}// if 문 종료
		//speed 입력값이 음수이면 0으로 입력

	}
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}// stop값이 true면 스탑을 진행하고 스피드를 0으로 조절한다.
	
	
	
	
}
