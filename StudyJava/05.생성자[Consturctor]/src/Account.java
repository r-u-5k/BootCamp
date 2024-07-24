
public class Account {
	private int no; // 계좌번호
	private String owner; // 계좌주
	private int balance; // 잔고
	private double iyul; // 이율
	
	/**
	 * 기본값으로 초기화된 계좌 객체 생성
	 */
	public Account() {
	}
	
	/**
	 * 인자값으로 초기화된 계좌 객체 생성
	 * @param no 		계좌번호
	 * @param owner 	계좌주
	 * @param balance 	잔고<br>
	 * 					음수 입력 시 예외(MinusValueException) 발생
	 * @param iyul 		이율
	 */
	public Account(int no, String owner, int balance, double iyul) {
		
		this.no = no;
		this.owner = owner;
		this.balance = balance;
		this.iyul = iyul;
		
		// this.setAccountData(no, owner, balance, iyul); -> 동일한 코드
	}

	/*
	 * 계좌 데이터를 대입
	 */
	public void setAccountData(int no, String owner, int balance, double iyul) {
		this.no = no;
		this.owner = owner;
		this.balance = balance;
		this.iyul = iyul;
	}
	
	/*
	 * 입금
	 */
	public void deposit(int money) {
		this.balance += money;
	}
	
	/*
	 * 출금
	 */
	public void withdraw(int money) {
		this.balance -= money;
	}
	
	/*
	 * 계좌 헤더 출력
	 */
	public void headerPrint() {
		System.out.println("--------------------------");
		System.out.printf("%s %s %s %s\n", "계좌번호", "계좌주", "잔고", " 이율");
		System.out.println("--------------------------");
	} 
	
	/*
	 * 계좌 정보 출력
	 */
	public void print() {
		System.out.printf("%6d %6s   %d %4.1f\n", this.no, this.owner, this.balance, this.iyul); // this 생략 가능
	}

	
	
	
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public double getIyul() {
		return iyul;
	}

	public void setIyul(double iyul) {
		this.iyul = iyul;
	}
	
}
