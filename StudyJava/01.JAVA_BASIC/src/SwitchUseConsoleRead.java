import java.util.Scanner;

public class SwitchUseConsoleRead{

	public static void main(String[] args) {
		/*
		 * 키보드로부터 수를 입력받아서 짝수 홀수 판별
		 */
		Scanner scanner = new Scanner(System.in);
		
		/*
		 * - 키보드로부터 데이터를 입력받기 위해 실행흐름을 멈추고 대기
		 * - 사용자가 키보드를 사용해서 문자(숫자)를 입력한 후
		 *   엔터키를 타이핑하면 입력한 값이 num 변수에 대입됨
		 */
		System.out.print("숫자를 입력하세요: ");
		int num = scanner.nextInt();
		
		
		/*
		 * 짝수 홀수 판별
		 */
		switch (num % 2) {
		case 0:
			System.out.printf("%d는 짝수입니다.\n", num);
			break;

		case 1:
			System.out.printf("%d는 홀수입니다.\n", num);
			break;
		}
		
		/*
		 * 입력되는 문자(열)에 따라 게임 캐릭터 이동
		 */
		
		System.out.print("캐릭터를 이동시키세요(a: left, w: up, d: right, x: down, s: rotate): ");
		String readStr = scanner.next();
		char direction = readStr.charAt(0);

		switch (direction) {
		case 'a': case 'A':
			System.out.println("move left");
			break;
		case 'w': case 'W':
			System.out.println("move up");
			break;
		case 'd': case 'D':
			System.out.println("move right");
			break;
		case 'x': case 'X':
			System.out.println("move down");
			break;
		case 's': case 'S':
			System.out.println("move rotate");
			break;
		default:
			System.out.println("nothing");
			break;
		}
		scanner.close(); // -> 안 배움
	}

}
