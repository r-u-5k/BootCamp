
public class IfTest2 {
	int a; // 멤버변수

	public static void main(String[] args) {
		int x = 21;
		int y = 30;
		
		if (x > y) {
			System.out.println("x > y -> true");
		} else {
			System.out.println("x > y -> false");
		}
		
		if (x < y) {
			System.out.println("x < y -> true");
		} else {
			System.out.println("x < y -> false");
		}
		
		if (x == y) {
			System.out.println("x == y -> true");
		}
		if (x != y) {
			System.out.println("x != y -> true");
		}
		System.out.println("- 변수의 범위 (scope) -");
		/*
		 * 지역변수 (local variable)
		 *  - 클래스 블록을 제외한 블록 안에 선언된 변수
		 *  - 지역변수의 범위 (해당 변수가 선언된 블록과 그 블록 안에 포함된 하위 블록 안에서만 사용 가능)
		 */
		int kor = 98;
		if (kor >= 90) {
			char grade = 'A';
			String msg = "참 잘했어요";
			System.out.println("kor -> " + kor);
			System.out.println("grade -> " + grade);
			System.out.println("msg -> " + msg);
		} // grade, msg는 이 블록 안에서만 사용 가능
		System.out.println("kor -> " + kor);
//		System.out.println("grade -> " + grade); -> grade cannot be resolved to a variable
//		System.out.println("msg -> " + msg);
		
	}

}
