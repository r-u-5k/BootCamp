
public class ForTest {

	public static void main(String[] args) {
		System.out.println("- while -");
		int k = 0; 							// 반복변수 초기화
		while (k < 10) { 					// 반복변수 비교 (반복조건)
			System.out.println("k = " + k); // 반복문
			k++;							// 반복변수 증가/감소
		}
		
		System.out.println("- for i 증가-");
		
		for (int i = 0; i < 10; i++) {
			System.out.println(("i = " + i));
		}
		
		System.out.println("-for i 감소 -");
		
		for (int i = 10; i > 0; i--) {
			System.out.println("i = " + i);
		}
		System.out.println();
		
		System.out.println("- 홀수만 출력 [1~100] -");
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println("\n");
		
		System.out.println("- 4의 배수만 출력 [1~100] -");
		for (int i = 1; i <= 100; i++) {
			if (i % 4 == 0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println("\n");
		
		System.out.println("- 3과 4의 공배수만 출력 [1~100] -");
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 4 == 0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println("\n");
		
		/*
		 * break문
		 * - 1. 반복문에서 사용
		 * - 2. break문 이후의 반복코드를 실행하지 않는다
		 * - 3. 다음 반복블록도 실행하지 않는다
		 */
		
		System.out.println("- 3과 4의 최소공배수 출력 (break) -");
		for (int i = 1; ; i++) {
			System.out.printf("%d(%d == %d) \n", i, i % 3, i % 4);
			if (i % 3 == 0 && i % 4 == 0) {
				System.out.println("3과 4의 최소공배수: " + i);
				break;
			}
		}
		
		System.out.println("\n");
		
		/*
		 * continue문
		 * - 1. 반복문에서 사용
		 * - 2. continue문 이후의 반복코드를 실행하지 않는다
		 * - 3. 다음 반복블록은 실행한다
		 */
		
		System.out.println("- 4의 배수가 아닌 수만 출력 [1~100] (continue) -");
		for (int i = 1; i <= 100; i++) {
			if (i % 4 == 0) {
				continue;
			}
			System.out.print(i + " ");
		}
		
		System.out.println("\n");
		
		System.out.println("- 홀수, 짝수 합 [1~100] -");
		int oddTot = 0;
		int evenTot = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				oddTot += i;
			} else {
				evenTot += i;
			}
		}
		System.out.println("짝수 합: " + evenTot);
		System.out.println("홀수 합: " + oddTot);
		
		System.out.println("\n");
		
		System.out.println("- 문자 출력 (continue) -");
		for (char c = 'a'; c <= 'z'; c++) {
			System.out.print(c);
			if (c == 'z') {
				continue;
			}
			System.out.print(", ");
		}

	}

}
