package lang;

public class LottoMain {

	public static void main(String[] args) {
		System.out.println("- 로또 번호 6개 생성 (중복 허용 X) -");
		
		int[] lottoNumber = {0, 0, 0, 0, 0, 0};
		/*
		 * 번호생성
		 *   - Quiz: 중복 체크
		 */
		for (int i = 0; i < lottoNumber.length; i++) {
			lottoNumber[i] = (int)(Math.random() * 45) + 1;
		}
		/*
		 * 번호출력
		 */
		for (int no : lottoNumber) {
			System.out.print(no + " ");
		}
	}

}
