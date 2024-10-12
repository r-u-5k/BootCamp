
public class CarMemberMethodMain {

	public static void main(String[] args) {
		/*
		 * 1. 차량번호 1234번 (car1) 차량 12시 입차
		 */
		Car car1 = new Car();
		Car car2 = new Car();
		
		/*
		 * 1-1. car1 차량 입차 시 데이터(차량번호, 입차시간) 대입 메서드 호출
		 */
		car1.setIpChaData("1234", 12);
		car2.setIpChaData("5678", 10);
		
		/*
		 * 2. 차량 출차
		 */
		/*
		 * 2-1. 출차 시간 대입
		 */
		car1.setOutTime(16);
		car2.setOutTime(16);
		
		/*
		 * 2-2. 주차 요금 계산 메서드 호출
		 */
		car1.calculateFee();
		car2.calculateFee();
		
		/*
		 * 2-3. 차량 정보 출력 메서드 호출
		 */
		car1.headerPrint();
		car1.print();
		car2.headerPrint();
		car2.print();
		
	}

}
