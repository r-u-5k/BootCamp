package event;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JScrollPane;

public class ChatJFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField chatTextField;
	private JScrollPane scrollPane;
	private JTextArea chatTextArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChatJFrame frame = new ChatJFrame();
					frame.setVisible(true);
					frame.chatTextField.requestFocus();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ChatJFrame() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ChatJFrame.class.getResource("/image/common.png")));
		setTitle("채팅");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 384, 513);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel southPanel = new JPanel();
		southPanel.setBackground(new Color(238, 232, 170));
		contentPane.add(southPanel, BorderLayout.SOUTH);
		
		chatTextField = new JTextField();
		chatTextField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sendMessage = chatTextField.getText();
				if (sendMessage.trim().equals("")) {
					chatTextField.setText("");
					chatTextField.requestFocus();
					return;
				}
				chatTextField.setText("");
				chatTextArea.append("\n유진: " + sendMessage);
				chatTextField.requestFocus();
			}
		});
		southPanel.add(chatTextField);
		chatTextField.setColumns(20);
		
		JButton chatSendButton = new JButton("전송");
		chatSendButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sendMessage = chatTextField.getText();
				chatTextField.setText("");
				chatTextArea.append("\n유진: " + sendMessage);
				chatTextField.requestFocus();
			}
		});
		southPanel.add(chatSendButton);
		
		JLabel chatLabel = new JLabel("오픈채팅");
		chatLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		chatLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(chatLabel, BorderLayout.NORTH);
		
		scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		chatTextArea = new JTextArea();
		chatTextArea.setText("무지: ㅎㅇ\r\n라이언: ㅂㅂ");
		chatTextArea.setEditable(false);
		scrollPane.setViewportView(chatTextArea);
		
	}

}
