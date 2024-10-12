
public class IfScorePrint {

	public static void main(String[] args) {

		int kor = 90;
		/*
		 * 1. 입력되는 점수의 유효성 체크
		 */
		if (kor >= 0 && kor <= 100) { // 2-1. 유효한 점수를 대상으로 학점 계산
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
//			System.out.printf("학점은 %c입니다.", grade);
			
		} else { // 2-2. 유효하지 않은 점수에 대한 메세지 출력
			System.out.println(kor + "점은 유효한 점수가 아닙니다.");
		}

	}

}
