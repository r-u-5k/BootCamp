
public class WhileUseChar {

	public static void main(String[] args) {
		/*
		 * 문자 출력
		 */

		char c1 = 0;
		while (c1 < 65535) {
			System.out.print(c1);
			c1++;
			if (c1 % 100 == 0) {
				System.out.println();
			}
		}

		System.out.println();
		
		// 영문 소문자 출력
		
		char c2 = 'a';
		while (c2 <= 'z') {
			System.out.print(c2 + " ");
			c2++;
		}
		
		System.out.println();
		
		 /* << Quiz >>
		 * - 영문소문자출력
		 *   a b c d e
		 *   f g h i j 
		 *   k l m n o 
		 *   p q r s t 
		 *   u v w x y 
		 *   z 
		 */
		
		char c3 = 'a';
		
		while (c3 <= 'z') {
			System.out.print(c3 + " ");
			c3++;
			if ((c3 - 'a') % 5 == 0) {
				System.out.println();
			}
		}
		
		System.out.println();
		
		 // 한글 출력
		 
		char han = '가';
		while (han <= '힣') {
			System.out.print(han);
			han++;
			if ((han - '가') % 100 == 0) {
				System.out.print("\n"); // 100개씩 출력하고 줄바꿈
			}
		}
		System.out.println();
	}

}
