package ch04.staticfinal;

public class Earth {
	// static과 final을 같이 연습
	
	//필드==================================
	static final double PI = Math.PI;
	static final double EATRH_RADIUS = 6400;
	static final double EATRH_SURFACE_AREA;
	
	//생성자 ====================================
	static {
		EATRH_SURFACE_AREA = 4 * PI * EATRH_RADIUS * EATRH_RADIUS;
	}
	
	

}
