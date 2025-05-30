package ch05.mbcbank.DTO;

public class AccountDTO {
	// 개인적필드======================================================================
		private String ano ; // 계좌번호
		private String owner ; // 계좌주
		private int balance ; // 잔고
		private String bankname ; // 은행명
		
//생성자==========================================================================

		public AccountDTO(String ano, String owner, int balance, String bankname) {
			//super();
			this.ano = ano;
			this.owner = owner;
			this.balance = balance;
			this.bankname = bankname;
		}//모든필드 사용 생성자
		
		//기본생성자
		public AccountDTO() {
		//	super();
		}
		
	//메서드===========================================================================
		public String getAno() {
			return ano;
		}

		public String getOwner() {
			return owner;
		}

		public int getBalance() {
			return balance;
		}

		public String getBankname() {
			return bankname;
		}

		public void setAno(String ano) {
			this.ano = ano;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public void setBalance(int balance) {
			this.balance = balance;
		}

		public void setBankname(String bankname) {
			this.bankname = bankname;
		}

		//출력 테스트
		@Override
		public String toString() {
			return "AccountDTO [ano=" + ano + ", owner=" + owner + ", balance=" + balance + ", bankname=" + bankname
					+ "]";
		}



}
