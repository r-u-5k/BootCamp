package lang;

public class MathMain {

	public static void main(String[] args) {
		/*
		 * Math 클래스
		 *   - 수학 계산 함수를 가지고 있는 클래스
		 *   - 모든 메서드가 static
		 *   - 객체 생성 불가능 (생성자 접근제한자 private)
		 */
		// Math math = new Math();
		double r = Math.abs(-127.9);
		System.out.println(r);
		System.out.println(Math.max(999, 888));
		System.out.println(Math.min(999, 888));
		System.out.println(Math.round(33.55555 * 100) / 100.0); // 33.55555 * 100 = 3355.555, round(3355.555) = 3356, 3356 / 100 = 33.56
		System.out.println(Math.sqrt(2));
		System.out.println(Math.pow(2, 12)); // 2의 12승
		
		System.out.println("- Math.random() -");
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		
		System.out.println("- 1~10 사이의 정수 랜덤 생성 -");
		System.out.println((int)(Math.random() * 10) + 1);
		
		System.out.println("- 1~45 사이의 정수 6개 랜덤 생성 -");
		System.out.println((int)(Math.random() * 45) + 1);
		System.out.println((int)(Math.random() * 45) + 1);
		System.out.println((int)(Math.random() * 45) + 1);
		System.out.println((int)(Math.random() * 45) + 1);
		System.out.println((int)(Math.random() * 45) + 1);
		System.out.println((int)(Math.random() * 45) + 1);

	}

}
