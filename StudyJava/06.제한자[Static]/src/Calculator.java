
	/*
	 * 4개의 멤버 메서드를 가짐
	 */
public class Calculator {
	private Calculator() {
		
	}
	
	public static int add(int a, int b) {
		return (a + b);
	}
	
	public static int sub(int a, int b) {
		return (a - b);
	}
	
	public static int div(int a, int b) {
		return (a / b);
	}
	
	public static int mul(int a, int b) {
		return (a * b);
	}
	
}