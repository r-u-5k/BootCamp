
public class IfScorePrintReturn {

	public static void main(String[] args) {

		int kor = 96;
		/*
		 * 1. 입력되는 점수의 유효성 체크
		 */
		if (kor < 0 || kor > 100) { // 유효하지 않은 점수
			System.out.println(kor + "점은 유효하지 않은 점수입니다.");
			return; // 현재 return문을 실행하는 실행흐름을 실행흐름을 만들어서 호출한 곳으로 반환
		}
		/*
		 * 2. 유효한 점수에 대해서만 학점 계산
		 */
		char grade = 'F';
		if (kor >= 90) {
			grade = 'A';
		} else if (kor >= 80) {
			grade = 'B';
		} else if (kor >= 70) {
			grade = 'C';
		} else if (kor >= 60) {
			grade = 'D';
		}
		System.out.println("학점은 " + grade + "입니다.");
//		System.out.printf("학점은 %c입니다.", grade);
	}
}
