
public class CarMemberFieldMain {

	public static void main(String[] args) {
		/*
		 * 1. 차량번호 1234번 차량 12시 입차
		 */
		Car car1; // 차 객체의 데이터를 저장할 Car 클래스 타입의 변수를 선언함
		car1 = new Car(); //  Car 클래스를 사용해서 차 객체를 생성한 후 차 객체 데이터가 car1 변수에 대입
		
		car1.no = "1234"; // 차 객체(car1)의 멤버 필드(no)에 차량번호 "1234"값 대입
		
		car1.inTime = 12; // 차 객체(car1)의 멤버 필드(inTime)에 입차시간 12값 대입
		
		/*
		 * 2. car1 객체 16시 출차
		 */
		car1.outTime = 16; // 차 객체(car1)의 멤버 필드(outTime)에 출차시간 16값 대입
		
		car1.fee = (car1.outTime - car1.inTime) * 1000; // 차 객체(car1)의 멤버 필드(fee)에 차 객체(car1)의 
		 												// outTime, inTime 멤버 필드를 이용해서 주차 요금 계산 후 대입 
		 
		System.out.println("------------------------------------------------------------");
		System.out.printf("%s %s %s %s\n", "차량번호", "입차시간", "출차시간", "주차요금");
		System.out.println("------------------------------------------------------------");
		System.out.printf("%6s %7d %8d     ￦%d", car1.no, car1.inTime, car1.outTime, car1.fee);
//		System.out.println(car1.no + "\t" + car1.inTime + "\t" + car1.outTime + "\t" + car1.fee);

		return;
		/*
		 return  <<호출한 클래스(객체)에게 반환할 값(변수, 리터럴, 연산의 결과)>>
		  	- 호출한곳으로 실행흐름(쓰레드) 반환
		  	- 호출한곳으로 데이타반환
		  	- 반환할 데이타가 없는 경우에는(void) return문 생략가능하다. 
		  	- 반환할 데이타가 있는 경우에는 return문 반드시 기술하여야 한다. 
		 */
	}

}
