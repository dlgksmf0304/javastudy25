package ch04.statictast;

public class Television {
	// static 연습 2
	
	
	//필드 =====================================
	static String company = "Sansung";
	static String model = "LED";
	static String info ;
	
	//생성자 ======================================
	static {
		info = company + "-" + model;
	}

	
	

}
