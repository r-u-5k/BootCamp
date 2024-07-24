
public class CarFactoryStaticMain {

	public static void main(String[] args) {
		Car.count = 0;
		Car c1 = new Car(1, "K3", "RED");
		Car c2 = new Car(2, "K5", "GREEN");
		Car c3 = new Car(3, "K7", "BLUE");
		
		System.out.println("차량 총 생산 대수: " + Car.count);
		Car.headerPrint(); // this로 접근하고 있지 않으므로 static으로.
		c1.print();
		c2.print();
		c3.print();
		
	}

}
