
public class IfUse {

	public static void main(String[] args) {

		/*
		 * 짝수, 홀수 판별
		 */
		int no1 = 45;
		if (no1 % 2 == 0) {
			System.out.printf("%d은 짝수입니다.\n", no1);
		} else {
			System.out.printf("%d은 홀수입니다.\n", no1);
		}

		/*
		 * 4의 배수 판별
		 */
		int no2 = 48;
		if (no2 % 4 == 0) {
			System.out.printf("%d는 4의 배수입니다.\n", no2);
		} else {
			System.out.printf("%d는 4의 배수가 아닙니다.\n", no2);
		}

		/*
		 * 점수의 유효성 체크
		 */
		int kor = 90;
		if (kor >= 0 && kor <= 100) {
			System.out.printf("%d는 유효한 점수\n", kor);
		} else {
			System.out.printf("%d는 유효하지 않은 점수\n", kor);
		}
		
		/*
		 * 윤년 여부 출력
		 */
		int year = 2000;
		String msg = "";
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			msg = "윤년";
		} else {
			msg = "평년";
		}
		System.out.printf("%d년은 %s입니다.\n", year, msg);
		
		/*
		 * 문자 판별
		 */
		char c = 'V';
		if (c >= 'A' && c <= 'Z') {
			System.out.printf("%c는 알파벳 대문자입니다.\n", c);
		}
		if (c >= 'a' && c <= 'z') {
			System.out.printf("%c는 알파벳 소문자입니다.\n", c);
		}
		if (c >= '0' && c <= '9') {
			System.out.printf("%c는 숫자 형태 문자입니다.\n", c);
		}
		
		/*
		 * 아이디 첫 글자(알파벳 대문자 or 소문자인지)
		 */
		char idFirstLetter = '&';
		if ((idFirstLetter >= 'A' && idFirstLetter <= 'Z') || (idFirstLetter >= 'a' && idFirstLetter <= 'z')) {
			System.out.println("아이디 첫 글자 가능");
		} else {
			System.out.println("아이디 첫 글자 불가능");
		}
	}

}
