package com.itwill05.service.collection.account;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

/*
 * 계좌객체를 생성하기위한 클래스
 */
public class Account {

	/*
	 * 멤버필드 private
	 */
	private int no;// 계좌번호
	private String owner;// 계좌주
	private int balance;// 잔고
	private double iyul;// 이율
	

	/*
	 멤버메쏘드 public
	 */
	// 계좌데이타를 set하는 메쏘드
	public void setAccountData(int no, String owner, int balance, double iyul) {
		this.no = no;
		this.owner = owner;
		this.balance = balance;
		this.iyul = iyul;
	}

	// 입금
	public void deposit(int m) {
		this.balance = this.balance + m;
	}

	// 출금
	public void withDraw(int m) {
		this.balance = this.balance - m;
	}

	// 계좌헤더출력
	public static void headerPrint() {
		System.out.printf("%s\n", "---------------------------");
		System.out.printf("%s %5s %4s %4s\n", "번호", "이름", "잔고", "이율");
		System.out.printf("%s\n", "---------------------------");
	}

	// 계좌객체의 정보출력
	public void print() {
		System.out.printf("%d %6s %8d %5.1f \n", this.no, this.owner, this.balance, this.iyul);
	}
}
