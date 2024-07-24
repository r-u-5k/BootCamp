
public class Question_231208 {

	public static void main(String[] args) {
		// 아래 두 코드가 동일하게 작동하는 코드인 게 맞는지 -> 맞음. 오히려 나중엔 아래 방식을 많이 씀
		
		char c = 0; // 0 -> 제일 첫 번째에 할당된 유니코드 (null값)
		while (c < 15) { /* 15 -> 제일 앞에서부터 16번째에 할당된 유니코드 
							(유니코드는 0~65535. 0부터 시작하므로 16번째) */
			System.out.print(c);
			c++;
		}
		
		System.out.println("\n-----------------");
		
		char c1 = '\u0000'; // 유니코드 0000 (제일 첫 번째에 할당)
		while (c1 < '\u000F') { /* 유니코드 000F (16진수에서의 F는 10진수에서 15인데 
									유니코드는 0부터 시작하므로 16번째에 할당) */
			System.out.print(c1);
			c1++;
		}
	}

}
