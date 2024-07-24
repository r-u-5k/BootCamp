
public class FinalFieldClassMain {

	public static void main(String[] args) {
		System.out.println("- FinalFieldClass 객체1 -");
//		FinalFieldClass.PI = 3.15; -> The final field FinalFieldClass.PI cannot be assigned
//		FinalFieldClass.EARTH_RADIUS = 6651;
		System.out.println(FinalFieldClass.PI); // static final이므로 객체가 달라져도 달라지지 않는 상수
		System.out.println(FinalFieldClass.EARTH_RADIUS);
		
		FinalFieldClass ffc1 = new FinalFieldClass();
//		ffc1.PORT_NUMBER = 88; -> The final field FinalFieldClass.PORT_NUMBER cannot be assigned
//		ffc1.INCENTIVE_RATE = 0.3;
		System.out.println(ffc1.PORT_NUMBER); // static final이 아니고 그냥 final이므로 객체에서마다 달라지는 상수
		System.out.println(ffc1.INCENTIVE_RATE);
		
		System.out.println("- FinalFieldClass 객체2 -");
		FinalFieldClass ffc2 = new FinalFieldClass(0.5);
		System.out.println(ffc2.INCENTIVE_RATE);
		System.out.println(Math.PI);
		
	}

}
