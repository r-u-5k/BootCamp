package basic;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JComboBox;

public class ChildJFrameWB extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton loginButton;
	private JButton joinButton;
	private JTextField idTextField;
	private JTextField pwTextField;
	private JLabel idLabel;
	private JLabel pwLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		ChildJFrameWB frame = new ChildJFrameWB();
		frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public ChildJFrameWB() {
		setTitle("MyFirstWBFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 444, 333);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		loginButton = new JButton("로그인");
		loginButton.setBounds(87, 216, 97, 23);
		contentPane.add(loginButton);
		
		joinButton = new JButton("회원가입");
		joinButton.setBounds(240, 216, 97, 23);
		contentPane.add(joinButton);
		
		idTextField = new JTextField();
		idTextField.setBounds(168, 69, 179, 21);
		contentPane.add(idTextField);
		idTextField.setColumns(10);
		
		pwTextField = new JTextField();
		pwTextField.setBounds(168, 133, 179, 21);
		contentPane.add(pwTextField);
		pwTextField.setColumns(10);
		
		idLabel = new JLabel("아이디");
		idLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		idLabel.setHorizontalAlignment(SwingConstants.CENTER);
		idLabel.setBounds(67, 72, 77, 15);
		contentPane.add(idLabel);
		
		pwLabel = new JLabel("패스워드");
		pwLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		pwLabel.setHorizontalAlignment(SwingConstants.CENTER);
		pwLabel.setBounds(67, 136, 77, 15);
		contentPane.add(pwLabel);
	}
}
