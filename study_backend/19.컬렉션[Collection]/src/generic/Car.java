package generic;

import java.util.Objects;

public class Car {
	private String no; // 차량번호
	private int inTime; // 입차시간
	private int outTime;// 출차시간
	private int fee; // 주차요금

	public Car() {
	}

	public Car(String no, int inTime) {

		this.no = no;
		this.inTime = inTime;
	}

	public Car(String no, int inTime, int outTime, int fee) {
		this.no = no;
		this.inTime = inTime;
		this.outTime = outTime;
		this.fee = fee;
	}

	public void setIpChaData(String no, int inTime) {
		this.no = no;
		this.inTime = inTime;
		return;
	}

	public void setOutTime(int outTime) {
		this.outTime = outTime;
	}

	public void calculateFee() {
		this.fee = (this.outTime - this.inTime) * 1000;
		return;
	}
	
	/*
	 * 차량번호가 동일한 경우 같은 차량이므로 중복되지 않도록 Car 클래스의 equals()와 hashCode() 메서드를 재정의함
	 */
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (!(obj instanceof Car)) return false;
		Car car = (Car) obj;
		return this.no.equals(car.no);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(no);
	}

	public static void headerPrint() {
		System.out.printf("---------------------------------------\n");
		System.out.printf("%s %s %s %s\n", "차량번호", "입차시간", "출차시간", "주차요금");
		System.out.printf("---------------------------------------\n");
	}

	public void print() {
		System.out.printf("%7s %8d %8d   ￦%4d\n", this.no, this.inTime, this.outTime, this.fee);
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public int getInTime() {
		return inTime;
	}

	public void setInTime(int inTime) {
		this.inTime = inTime;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public int getOutTime() {
		return outTime;
	}
}