package event;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class NorthButtonActionEventHandler implements ActionListener {
	private int buttonClickCount = 0;
	private ActionEventJFrame actionEventJFrame;

	public NorthButtonActionEventHandler() {
	}

	public NorthButtonActionEventHandler(ActionEventJFrame actionEventJFrame) {
		this.actionEventJFrame = actionEventJFrame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("north button click!");

		/* 이벤트 소스 얻기 */
		Object source = e.getSource();
		JButton eventSourceButton = (JButton) source;
		eventSourceButton.setText("이벤트소스[NORTH] " + ++buttonClickCount);

		/* ActionEventJFrame의 멤버 접근 */
		actionEventJFrame.setTitle("NorthButtonClick");
		int r = (int) (Math.random() * 256);
		int g = (int) (Math.random() * 256);
		int b = (int) (Math.random() * 256);
		actionEventJFrame.contentPane.setBackground(new Color(r, g, b));
		return;
	}

}
