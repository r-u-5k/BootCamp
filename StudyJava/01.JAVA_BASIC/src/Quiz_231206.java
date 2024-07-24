
public class Quiz_231206 {

	public static void main(String[] args) {
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
		char c = 'ㅇ';
		boolean isHangul = (c >= '\uAC00' && c <= '\uD7FF') || (c >= '\u3131' && c <= '\u318E');
		System.out.println("한글 여부: " + isHangul);
		
		/*
		 * Quiz:아이디의첫글자는 영문대문자이거나 소문자여야한다.
		 */
		char idFirstLetter = '@';
		boolean isValidIdFirstLetter = (idFirstLetter >= 'A' && idFirstLetter <= 'Z') 
									|| (idFirstLetter >= 'a' && idFirstLetter <= 'z');
		System.out.println(idFirstLetter+" 의 적합성 여부:"+isValidIdFirstLetter);
	}

}
