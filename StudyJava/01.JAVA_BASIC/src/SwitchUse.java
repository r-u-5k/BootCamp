
public class SwitchUse {

	public static void main(String[] args) {
		/*
		 * 짝수 홀수 판별
		 */
		int num = 34;
		
		switch (num % 2) {
		case 0:
			System.out.printf("%d는 짝수입니다.\n", num);
			break;

		case 1:
			System.out.printf("%d는 홀수입니다.\n", num);
			break;
		}
		
		/*
		 * < 주사위 > 1~6 사이의 정수를 랜덤하게 발생
		 */
		int diceNo = (int)(Math.random() * 6) + 1;
		
		switch (diceNo) {
		case 1:
			System.out.println("dice no: " + diceNo);
			break;
		case 2:
			System.out.println("dice no: " + diceNo);
			System.out.println("dice no: " + diceNo);
			break;
		case 3:
			System.out.println("dice no: " + diceNo);
			System.out.println("dice no: " + diceNo);
			System.out.println("dice no: " + diceNo);
			break;
		case 4:
			System.out.println("dice no: " + diceNo);
			System.out.println("dice no: " + diceNo);
			System.out.println("dice no: " + diceNo);
			System.out.println("dice no: " + diceNo);
			break;
		case 5:
			System.out.println("dice no: " + diceNo);
			System.out.println("dice no: " + diceNo);
			System.out.println("dice no: " + diceNo);
			System.out.println("dice no: " + diceNo);
			System.out.println("dice no: " + diceNo);
			break;
		case 6:
			System.out.println("dice no: " + diceNo);
			System.out.println("dice no: " + diceNo);
			System.out.println("dice no: " + diceNo);
			System.out.println("dice no: " + diceNo);
			System.out.println("dice no: " + diceNo);
			System.out.println("dice no: " + diceNo);
			break;
			
		}
		
		/*
		 * 입력되는 문자(열)에 따라 게임 캐릭터 이동
		 */
		
		char direction = 's';

		switch (direction) {
		case 'a':
			System.out.println("move left");
			break;
		case 'w':
			System.out.println("move up");
			break;
		case 'd':
			System.out.println("move right");
			break;
		case 'x':
			System.out.println("move down");
			break;
		case 's':
			System.out.println("move rotate");
			break;
		default:
			System.out.println("nothing");
			break;
		}
		
		/*
		 * Quiz: 대소문자 구분 없이 실행되도록.
		 */
		
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
	}

}
