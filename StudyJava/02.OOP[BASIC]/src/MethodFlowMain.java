
public class MethodFlowMain {

	public static void main(String[] args) {
		/*
		// 계산1
		int a = 1;
		int b = 2;
		int sum1 = a + b;
		System.out.println("결과1 출력: " + sum1);
		
		// 계산2
		int x = 10;
		int y = 20;
		int sum2 = x + y;
		System.out.println("결과2 출력: " + sum2);
		*/
		
		System.out.println("- add 메서드 호출(call, invoke) -");
		int sum1 = add(1, 2);
		System.out.println("결과 출력 1: " + sum1);
		
		System.out.println("- add 메서드 호출(call, invoke) -");
		int sum2 = add(10, 20);
		System.out.println("결과 출력 2: " + sum2);
	}
	
	public static int add(int a, int b){
		System.out.println(a + "+" + b + " 연산 수행");
		int sum = a + b;
//		System.out.println("결과 출력: " + sum);
		return sum;
	}
}
