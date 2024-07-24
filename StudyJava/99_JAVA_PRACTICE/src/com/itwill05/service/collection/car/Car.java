package com.itwill05.service.collection.car;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Car {

	private String no;// 번호
	private int inTime;// 입차시간
	private int outTime;// 출차시간
	private int fee;// 주차요금
	/*
	 * 생성자 오버로딩
	 */

	public Car(String no, int inTime) {
		this.no = no;
		this.inTime = inTime;
	}

	public void setIpChaData(String no, int inTime) {
		this.no = no;
		this.inTime = inTime;
	}

	public void calculateFee() {
		this.fee = (this.outTime - this.inTime) * 1000;
	}

	// - 타이틀출력
	public static void headerPrint() {
		System.out.println("-----------------------------------");
		System.out.printf("%s %s %s %s%n", "차량번호", "입차시간", "출차시간", "주차요금");
		System.out.println("-----------------------------------");
	}

	// - 차량정보출력기능
	public void print() {
		System.out.printf("%7s %7d %9d %7d%n", this.no, this.inTime, this.outTime, this.fee);
		return;
	}

}