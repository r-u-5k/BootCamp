/*
 * 변수의 필요성
 */
public class VariableRequire {

	public static void main(String[] args) {
		System.out.println("- 변수 사용 X -");
		System.out.println("<< 점수출력 >>");
		System.out.println(80);
		System.out.println(95);
		System.out.println(89);
		System.out.println("<< 총점출력 >>");
		System.out.println(80+95+89);
		System.out.println("<< 평균출력 >>");
		System.out.println((80+95+89)/3);
		
		System.out.println("- 변수 사용 O -");
		int kor = 88;
		int eng = 95;
		int math = 82;
		
		System.out.println("<< 점수출력 >>");
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(math);
		System.out.println("<< 총점출력 >>");
		System.out.println(kor+eng+math);
		System.out.println("<< 평균출력 >>");
		System.out.println((kor+eng+math)/3);
		
	}

}
