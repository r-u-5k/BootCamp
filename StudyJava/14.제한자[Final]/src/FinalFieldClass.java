
public class FinalFieldClass {
	public final int PORT_NUMBER = 80;
	
	public static final double PI = 3.141592;
	public static final int EARTH_RADIUS = 6400;
	
	public final double INCENTIVE_RATE; // 생성자에서 초기화하는 것까지 허용해줌
	
	public FinalFieldClass() {
		INCENTIVE_RATE = 0.1;
//		this.PORT_NUMBER = 81; -> The final field FinalFieldClass.PORT_NUMBER cannot be assigned
//		this.INCENTIVE_RATE = 0.2; -> The final field INCENTIVE_RATE may already have been assigned
		System.out.println(this.PORT_NUMBER);
		System.out.println(this.INCENTIVE_RATE);
		System.out.println(FinalFieldClass.PI);
		System.out.println(FinalFieldClass.EARTH_RADIUS);
	}
	
	public FinalFieldClass(double INCENTIVE_RATE) {
		this.INCENTIVE_RATE = INCENTIVE_RATE;
	}
}
