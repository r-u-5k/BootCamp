package basic;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/*
 * GUI프로그래밍 방법
 *   1.  컨테이너클래스준비(JFrame)상속
 *   2.  컨테이너클래스(JFrame)객체생성
 *   3.  컨테이너(JFrame)객체의 크기설정
 *   4.  컴포넌트생성(컨테이너(JFrame)의 멤버필드)
 *   5.  컨테이너(JFrame)에 컴포넌트 부치기(add) 
 *   6.  컨테이너객체 보여주기
 */
public class ChildJFrame extends JFrame {
	/*
	 * 컴포넌트를 멤버 필드로 선언
	 */
	private JPanel contentPane;
	private JButton loginButton;
	private JButton joinButton;
	
	public ChildJFrame() {
		
		contentPane = new JPanel();
		contentPane.setBackground(Color.blue);
		setContentPane(contentPane);
		
		/*
		 * 컴포넌트 멤버 필드 객체 생성 (컨테이너(JFrame)의 멤버 필드)
		 */
		loginButton = new JButton("로그인");
		joinButton = new JButton("회원가입");
		
		/*
		 * contentPane 배치 관리자 제거
		 */
		contentPane.setLayout(null);
		
		/*
		 * 컨테이너에 컴포넌트 붙이기
		 */
		loginButton.setBounds(80, 300, 100, 40);
		joinButton.setBounds(200, 300, 100, 40);
		contentPane.add(loginButton);
		contentPane.add(joinButton);
		
		this.setSize(400, 400); // this 생략 가능
		setTitle("MyFirstFrame");
		setVisible(true);
		/*
		 * Container.setVisible(true)
		 *   - 메인 스레드가 호출하면 JVM은 GUI 스레드(이벤트 & 그래픽)를 생성
		 *   - GUI 스레드는 무한 대기하면서 클라이언트의 이벤트와 그래픽 처리를 담당
		 *   - Container(JFrame)는 죽지 않고 계속 떠있음 (JVM이 종료되지 않음)
		 */
	}
	
	public static void main(String[] args) {
		ChildJFrame childJFrame = new ChildJFrame();
	}
	
}
