package ch1;

public class LocalVariableExam {

	public static void main(String[] args) {
		// 변수의 사용범위는 괄호(블럭) 안에서 효과를 발휘함
		
		int v1 = 20 ;
		int v2 = 0 ;
		if(v1>5) { //v1이 5보다 크면 작동한다
			v2 = v1 + 10 ;//v2는 v1 + 10 값이다
		}
		
		int v3 = v1 + v2 + 10 ;
		
		System.out.println("v1의 값 : " + v1 );//쌍따움표("")안에 글을 넣고
		System.out.println("v2의 값 : " + v2 );//그 뒤에 + 변수값을 넣으면
		System.out.println("v3의 값 : " + v3 );//글자와 함께 계산된 값이 나온다.
	}

}
