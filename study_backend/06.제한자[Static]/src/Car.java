
public class Car {
	/**
	 * 생산되는 차량 객체의 수를 저장할 변수
	 */
	public static int count; // 차량 총 생산 대수
	private int no; 		 // 차량번호
	private String model; 	 // 모델명
	private String color; 	 // 색상
	
	public Car(int no, String model, String color) {
		this.no = no;
		this.model = model;
		this.color = color;
		Car.count++; // 클래스 안에선 Car. 생략 가능
	}
	/**
	 * 차량 출력 시 헤더 프린트 메서드
	 */
	public static void headerPrint() {
		System.out.println("-----------------------");
		System.out.println(" 번호 \t 모델 \t  색상");
		System.out.println("-----------------------");

	}

	public void print() {
		System.out.println("  " + no + "\t  " + model + "\t  " + color);
	}
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
		
	
	@Override
	public String toString() {
		return "Car [no=" + no + ", model=" + model + ", color=" + color + "]";
	}



}
