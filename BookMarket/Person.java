package BookMarket;

public class Person {
	private String name;
	private int phone;
	private String address;
	
	
	// 기본생성자 생성해야됌
	public Person() {
		super();
	}

	// Source -> Generate Constructor using Fidlds...
	public Person(String name, int phone) { 
		super();
		this.name = name;
		this.phone = phone;
	}
	
	// Source -> Generate Constructor using Fidlds...
	public Person(String name, int phone, String address) {
		super();
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	// Source -> Generate Getters and Setters...
	public String getName() {
		return name;
	}

	public int getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	

}
