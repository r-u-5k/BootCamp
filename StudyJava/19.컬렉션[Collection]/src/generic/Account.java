package generic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Account {
	private int no; // 계좌번호
	private String owner; // 계좌주
	private int balance; // 잔고
	private double iyul; // 이율
	
	

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
	public static void headerPrint() {
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

	
	
	
	
}
