package basic;

public class ChildJFrameMain {

	public static void main(String[] args) {
		/*
		 * 컨테이너 클래스(JFrame) 객체 생성
		 */
//		ChildJFrame childJFrame = new ChildJFrame();
		/*
		 * 컨테이너(JFrame) 객체의 크기, 제목 설정
		 */
//		childJFrame.setSize(500, 600);
//		childJFrame.setTitle("Title");
		/*
		 * 컨테이너(JFrame) 객체 보여주기
		 */
//		childJFrame.setVisible(true);
		/*
		 * Container.setVisible(true)
		 *   - 메인 스레드가 호출하면 JVM은 GUI 스레드(이벤트 & 그래픽)를 생성
		 *   - GUI 스레드는 무한 대기하면서 클라이언트의 이벤트와 그래픽 처리를 담당
		 *   - Container(JFrame)는 죽지 않고 계속 떠있음 (JVM이 종료되지 않음)
		 */
		
//		System.out.println("main thread end jvm return");
		
	}

}
