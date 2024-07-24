
public class OperatorLogical {

	public static void main(String[] args) {
		boolean b1, b2, b3, b4;
		boolean result;
		
		b1 = true;
		b2 = true;
		b3 = false;
		b4 = false;
		
		result = b1 || b2;
		System.out.println(result);
		result = b1 || b3;
		System.out.println(result);
		result = b3 || b1;
		System.out.println(result);
		result = b3 || b4;
		System.out.println(result);
		
		System.out.println("-------------");
		
		result = b1 && b2;
		System.out.println(result);
		result = b1 && b3;
		System.out.println(result);
		result = b3 && b1;
		System.out.println(result);
		result = b3 && b4;
		System.out.println(result);
	
		/*
		 * 점수의 유효성 체크[0~100 사이의 정수]
		 */
		int kor = 67;
		int eng = 90;
		boolean condition1 = kor >= 0;
		boolean condition2 = kor <= 100;
		boolean isValidScore = condition1 && condition2;
		
		System.out.println("국어 점수 유효성 체크: " + isValidScore);
		
		System.out.println(">> A대학 국어점수가 90점 이상이거나 영어점수가 90점 이상이면 합격");
		boolean isPass1 = kor >= 90 || eng >= 90;
		System.out.println("\tA대학합격여부: " + isPass1);
		
		System.out.println(">> B대학 국어점수가 90점 이상이고 영어점수도 90점 이상이면 합격");
		boolean isPass2 = kor >= 90 && eng >= 90;
		System.out.println("\tB대학합격여부: " + isPass2);
		
		int math = 108;
		boolean isValidMathScore = math >= 0 && math <= 100;
		System.out.println("수학 점수 유효성 체크: " + isValidMathScore);
		
		boolean isInvalidMathScore = math < 0 || math > 100;
		System.out.println("수학 점수의 유효하지 않은지 여부: " + isInvalidMathScore);
		System.out.println("-------------");
		
		System.out.println("- 배수판별 -");
		int number = 12;
		boolean isMultiple3 = number % 3 == 0;
		System.out.println("3의 배수 여부: " + isMultiple3);
		boolean isMultiple4 = number % 4 == 0;
		System.out.println("4의 배수 여부: " + isMultiple4);
		
		System.out.println("3과 4의 공배수 여부: " + (isMultiple3 && isMultiple4));
		
		/****************************************************************************/
		/*
		 * Quiz: 윤년여부판단
		 *    - 4의배수(4로나누어떨어지는수)이면서 100의배수가아닌수(100로나누어떨어지는않는수) 이거나
		 *    - 400의배수(400로나누어떨어지는수)
		 */
		int year = 2023;
		boolean isLeapYear = year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
		System.out.println(year + "의 윤년 여부:" + isLeapYear);
		
		/*
		 * Quiz: 한글여부판단
		 */
		char c = 'ㅢ';
		boolean isHangul = (c >= '\uAC00' && c <= '\uD7FF') || (c >= '\u3131' && c <= '\u318E');
		System.out.println("한글 여부: " + isHangul);
		
		/*
		 * Quiz:아이디의첫글자는 영문대문자이거나 소문자여야한다.
		 */
		char idFirstLetter = 'c';
		boolean isValidIdFirstLetter = (idFirstLetter >= 'A' && idFirstLetter <= 'Z') 
									|| (idFirstLetter >= 'a' && idFirstLetter <= 'z');
		System.out.println(idFirstLetter+" 의 적합성 여부:"+isValidIdFirstLetter);
	}

}
