
public class VariableDeclare2 {

	public static void main(String[] args) {
		int score1;
		score1 = 78;
		System.out.println("score1 = " + score1);
		int score2 = 90;
		System.out.println("score2 = " + score2);
		
		int _number = 333;
		int $number = 444;
		int 번호 = 555; // 한글은 비추
		// int 7up = 666; -> 숫자 시작 불가능
		System.out.println("_number = " + _number);
		System.out.println("$number = " + $number);
		System.out.println("번호 = " + 번호);
	
		int kor, eng, math;
		kor = 90;
		eng = 89;
		math = 99;
		System.out.println("kor = " + kor);
		System.out.println("eng = " + eng);
		System.out.println("math = " + math);

		/*
		 * int kor = 99; -> Duplicate local variable kor
		 * history = 89; -> history cannot be resolved to a variable
		 */
		
		String name;
		name = "장유진";
		System.out.println("name = " + name);
	}

}
