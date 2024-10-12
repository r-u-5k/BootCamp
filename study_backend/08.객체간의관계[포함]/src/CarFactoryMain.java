
public class CarFactoryMain {

	public static void main(String[] args) {
		/*
		 * 자동차 공장
		 */
		
		Engine gv80Engine = new Engine("A", 5000);
		
		Car car1 = new Car();
		car1.setNo(1234);
		car1.setModel("GV80");
		car1.setEngine(gv80Engine);
		
		car1.print();
		
		System.out.println("- 차량 엔진 검사 -");
		Car gumsaCar = car1;
		Engine returnEngine = gumsaCar.getEngine();
		returnEngine.print();
		
		// gumsaCar.getEngine().print(); -> 동일.

		System.out.println();
		
		Car car2 = new Car(5678, "XC90", new Engine("S", 4900));
		car2.print();
		
		System.out.println("- 차량 엔진 검사 -");
		car2.getEngine().print();
		
	}

}
