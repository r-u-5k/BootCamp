
public class SwitchTest {

	public static void main(String[] args) {
		int level = 3; // 게임 레벨 (1~5 사이의 정수)
		
		switch (level) {
		case 1:
			System.out.println("초보"); // 명령문 기술 위치
			break; // switch 블록을 빠져나감
		case 2:
			System.out.println("중수");
			break;
		case 3: case 4: case 5:
			System.out.println("고수");
			break;
		default:
			System.out.println("게임 레벨은 1~5 사이의 정수");
			break;
		}
	}

}
