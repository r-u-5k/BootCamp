
public class Car {
	private int no; // 차량번호
	private String model; // 모델명
	private Engine engine; // 엔진 객체 주소를 저장할 멤버 필드
	
	public void print() {
		System.out.print(no + "\t" + model + "\t");
		engine.print(); // this.engine.print(); 도 가능
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public Engine getEngine() {
		return engine; // return this.engine; 도 가능
	}
	
	public Car() {
	}
	public Car(int no, String model, Engine engine) {
		this.no = no;
		this.model = model;
		this.engine = engine;
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
	
}
