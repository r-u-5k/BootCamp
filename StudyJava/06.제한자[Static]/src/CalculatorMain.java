
public class CalculatorMain {
	
	public static void main(String[] args) {
		/* Calculator calculator1 = new Calculator(); // 이런 작업을 막고 싶으면 생성자를 private로 막음
		
		int result=calculator1.add(23,34);
		System.out.println(result);
		result=calculator1.sub(23,34);
		System.out.println(result);
		result=calculator1.mul(23,34);
		System.out.println(result);
		result=calculator1.div(45435,34);
		System.out.println(result);
		
		Calculator calculator2 = new Calculator(); 
		System.out.println(calculator2.add(23,34));
		System.out.println(calculator2.sub(23,34));
		*/
		
		System.out.println(Calculator.add(23, 34));
		System.out.println(Calculator.sub(23, 34));
		System.out.println(Calculator.div(23, 34));
		System.out.println(Calculator.mul(45435, 34));
		
	}
}