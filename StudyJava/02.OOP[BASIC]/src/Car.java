/*
 * 주차장에서 차 객체를 생성할 클래스 (틀)
 * Car 객체의 주소를 저장할 수 있는 타입
 */
public class Car {
	
	/*
	 * 멤버 필드(변수)[속성]
	 */
	String no; 		// 차량번호
	int inTime; 	// 입차시간
	int outTime; 	// 출차시간
	int fee; 		// 주차요금
	
	/*
	 * 멤버 메서드[기능]
	 */
	/*
	 * 입차 데이터(차량번호, 입차시간) 대입
	 */
	public void setIpChaData(String no, int inTime) {
		this.no = no;
		this.inTime = inTime;
		return;
	}
	
	/*
	 * 출차 시간 멤버 필드 outTime에 대입
	 */
	public void setOutTime(int outTime) {
		this.outTime = outTime;
	}
	
	/*
	 * 주차 요금 계산
	 */
	public void calculateFee() {
		this.fee = (this.outTime - this.inTime) * 1000;
		return;
	}
	
	/*
	 * 차량 정보 헤더 출력
	 */
	public void headerPrint() {
		System.out.println("------------------------------------------------------------");
		System.out.printf("%s %s %s %s\n", "차량번호", "입차시간", "출차시간", "주차요금");
		System.out.println("------------------------------------------------------------");
		return;
	}
	
	/*
	 * 차량 정보 출력
	 */
	public void print() {
		/*
		 * this 
		 *   - self 참조>>변수<<
		 *   - public void print() 메서드가 실행될 때 호출의 주체가 되는 객체의 주소값을 가지는 변수
		 *   - this는 생략이 가능함 (공부 초반엔 생략하지 말 것)
		 */
		
		System.out.printf("%6s %7d %8d     ￦%d\n", this.no, this.inTime, this.outTime, this.fee);
		return;
	}

	
	
}