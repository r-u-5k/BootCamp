
public class WhileUse {

	public static void main(String[] args) {
		/*
		 * 10회 반복 실행
		 */
		System.out.println("--- i = 0 ---");
		int i = 0; // 반복 횟수를 저장할 반복변수
		while (i < 10) {
			System.out.println("stmt" + i);
			i++;
		}
		
		System.out.println("--- i = 1 ---");
		i = 1;
		while (i <= 10) {
			System.out.println("stmt" + i);
			i++;
		}
		
		System.out.println("- 1~10 사이의 정수 출력 -");
		i = 1;
		while (i <= 10) {
			System.out.print(i + " \n");
			i++;
		}
		
		/*System.out.println("- 1~10 사이의 정수 중 홀수만 출력 (내 방법) -");
		i = 1;
		while (i <= 10) {
			System.out.print(i + " ");
			i += 2;
		}
		
		System.out.println();*/
		
		System.out.println("- 1~10 사이의 정수 중 홀수만 출력 (강사님 방법) -");
		i = 1;
		while (i <= 10) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}
			i++;
		}
		
		System.out.println();
		
		System.out.println("- 1~100 사이의 정수 중 4의 배수만 출력 -");
		i = 1;
		while (i <= 100) {
			if (i % 4 == 0) {
				System.out.print(i + " ");
			}
			i++;
		}
		
		System.out.println();
		
		System.out.println("- 1900년부터 2023년까지 윤년인 연도를 출력하세요 -");
		int year = 1900;
		while (year <= 2023) {
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				System.out.print(year + " ");
			}
			year++;
		}
		
		/*
		 * 누적
		 */
		
		System.out.println();
		
		System.out.println("- 1~100 사이의 정수 합");
		i = 1;
		int tot = 0; // 누적 합
		int oddTot = 0; // 홀수 합
		int evenTot = 0; // 짝수 합
		
		while (i <= 100) {
			tot += i;
			if (i % 2 == 1) {
				oddTot += i;
			} else {
				evenTot += i;
			}
			i++;
		}
		System.out.println("1~100 사이의 정수 합: " + tot);
		System.out.println("1~100 사이의 홀수 합: " + oddTot);
		System.out.println("1~100 사이의 짝수 합: " + evenTot);
		
	}

}
