package event;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;

public class ActionEventJFrame extends JFrame {

	JPanel contentPane;
	JButton northButton;
	JButton southButton;
	private JButton westButton;
	private JButton eastButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				ActionEventJFrame frame = new ActionEventJFrame();
				frame.setVisible(true);
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ActionEventJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 316, 240);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		northButton = new JButton("이벤트소스[NORTH]");
		contentPane.add(northButton, BorderLayout.NORTH);

		southButton = new JButton("이벤트소스[SOUTH]");
		contentPane.add(southButton, BorderLayout.SOUTH);
		
		westButton = new JButton("이벤트소스[WEST]");
		contentPane.add(westButton, BorderLayout.WEST);
		
		eastButton = new JButton("이벤트소스[EAST]");
		eastButton.addActionListener(new ActionListener() {
			int buttonClickCount = 0;
			public void actionPerformed(ActionEvent e) {
				System.out.println("east button click!");
				setTitle("EastButtonClick");
				eastButton.setText("이벤트소스[EAST] " + ++buttonClickCount);
				int r = (int) (Math.random() * 256);
				int g = (int) (Math.random() * 256);
				int b = (int) (Math.random() * 256);
				contentPane.setBackground(new Color(r, g, b));
				return;
			}
		});
		contentPane.add(eastButton, BorderLayout.EAST);

		/* Event Source에 Event Handler 객체 등록 */
		/* 1. 외부 클래스 */
		NorthButtonActionEventHandler northButtonActionEventHandler = new NorthButtonActionEventHandler(this);
		northButton.addActionListener(northButtonActionEventHandler);
		/* 2. 내부 클래스 */
		southButton.addActionListener(new SouthButtonActionEventHandler());
		/* 3. 이름 없는 local 내부 클래스 */
		ActionListener westButtonActionEventHandler = new ActionListener() {
			int buttonClickCount = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("west button click!");
				westButton.setText("이벤트소스[WEST] " + ++buttonClickCount);
				setTitle("WestButtonClick");
				int r = (int) (Math.random() * 256);
				int g = (int) (Math.random() * 256);
				int b = (int) (Math.random() * 256);
				contentPane.setBackground(new Color(r, g, b));
				return;
			}
		};
		westButton.addActionListener(westButtonActionEventHandler);
		
	}
		
	public class SouthButtonActionEventHandler implements ActionListener {
		int buttonClickCount = 0;
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("south button click!");

			/* 이벤트 소스 얻기 */
			Object source = e.getSource();
			JButton eventSourceButton = (JButton) source;
			eventSourceButton.setText("이벤트소스[SOUTH] " + ++buttonClickCount);

			/* ActionEventJFrame의 멤버 접근 */
			setTitle("SouthButtonClick");
			int r = (int) (Math.random() * 256);
			int g = (int) (Math.random() * 256);
			int b = (int) (Math.random() * 256);
			contentPane.setBackground(new Color(r, g, b));
			return;
		}
	}
}
