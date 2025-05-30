package ch05.test;

public class AccountDTO {
	
	protected  String name ;
	private int kor ; // 국어
	private int eng ; // 영어
	private int mat ; // 수학

	public AccountDTO(String name, int kor, int eng, int mat) {
		
		this.name = name ;
		this.kor = kor ;
		this.eng = eng ;
		this.mat = mat ;
		
		
	}

	public AccountDTO() {
		super();
	}
	
	public String getname() {
		return name;
	}

	public int getKor() {
		
		
		return kor;
	}

	public int getEng() {
		
		
		return eng;
	}

	public int getMat() {
		
		
		return mat;
	}

	public void setname(String name) {
		this.name = name;
	}
	
	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

}
