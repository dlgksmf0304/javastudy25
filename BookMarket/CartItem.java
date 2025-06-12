package BookMarket;

public class CartItem {
	
	private String[] itemBook = new String[7];
	private String bookID;
	private int quantity;
	private int totalPrice;
	
	// 기본생성자
	// Source -> Generate Constructor using Fidlds...
	public CartItem() {
		super();
	}

	public CartItem(String[] book) {
		super();
		this.itemBook = book;
		this.bookID = book[0];
		this.quantity = 1;
		updateTotalPrice();
	}

	public String[] getItemBook() {
		return itemBook;
	}

	public String getBookID() {
		return bookID;
	}

	public int getQuantity() {
		return quantity;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setItemBook(String[] itemBook) {
		this.itemBook = itemBook;
	}

	public void setBookID(String bookID) {
		this.bookID = bookID;
		this.updateTotalPrice();
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
		this.updateTotalPrice();
	}


	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
		
	}
	
	private void updateTotalPrice() {
		totalPrice = Integer.parseInt(this.itemBook[2]) * this.quantity; // 문자열을 숫자열로 변경하는 메서드
		
	}
	
	

}
