package ch05.getter_setter;

/*public*/ class Test {
	// 연습용
	
	private static String name;
	private static int num ;
	
	public static String getName() {
		if(Test.name == "이하늘") {
			Test.name = name + "님 입니다.";
		}
		return name;
	}
	public static void setName(String name) {
		
			Test.name = name;
		
	}
	public static int getNum() {
		return num;
	}
	public static void setNum(int num) {
		Test.num = 15;
	}
	
	
	
	
	
	
	
}
