
public class OperatorArithmetic {

	public static void main(String[] args) {
		int a = 5;
		int b = 2;

		int result = 0;

		result = a + b;
		System.out.println("a + b = " + result);

		result = a - b;
		System.out.println("a - b = " + result);

		result = a * b;
		System.out.println("a * b = " + result);

		result = a / b;
		System.out.println("a / b = " + result);
		
//		double dresult = a / b;
//		System.out.println("a / b = " + dresult); -> 0.0 나옴
		
		double dresult = (double)a / b;
		System.out.println("a / b = " + dresult);
		
		dresult = 5.0 / 2;
		System.out.println("a / b = " + dresult);

		result = a % b;
		System.out.println("a % b = " + result);

		/*
		 * 나머지연산자
		 */
		int number = 16;
		result = number % 4; // 0, 1, 2, 3
		System.out.println("result 변수값이 0이면 4의 배수: " + result);

		int year = 2023;
		result = year % 4;
		System.out.println("2023 % 4 -> " + result);
		result = year % 100;
		System.out.println("2023 % 100 -> " + result);
		result = year % 400;
		System.out.println("2023 % 400 -> " + result);

		System.out.println("- 문자연산 -");
		char ca = 'A';
		char cz = 'Z';

		int numberOfAlphabet = cz - ca + 1;
		System.out.println("알파벳 대문자 수: " + numberOfAlphabet);
		int numberOfHangul = '힣' - '가' + 1;
		System.out.println("한글 글자 수: " + numberOfHangul);

		char hangul1 = '가';
		System.out.println(hangul1);
		char hangul2 = '가' + 2;
		System.out.println(hangul2);

		/*
		 * char hangul3 = hangul1 + 2; -> hangul1은 char, 2는 int이므로 
		 * hangul3은 char와 int 중 넓은 범위에 속하는 int가 되어야 함
		 * System.out.println(hangul3);
		 */

		int hangul4 = hangul1 + 2;
		System.out.println((char) hangul4);

	}

}
