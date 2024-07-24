package layout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.SystemColor;
import javax.swing.JDesktopPane;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CardLayoutFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel parentPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CardLayoutFrame frame = new CardLayoutFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CardLayoutFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 578, 469);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		parentPanel = new JPanel();
		parentPanel.setBackground(SystemColor.textHighlight);
		contentPane.add(parentPanel, BorderLayout.CENTER);
		parentPanel.setLayout(new CardLayout(0, 0));
		
		JPanel joinPanel = new JPanel();
		joinPanel.setBackground(Color.RED);
		parentPanel.add(joinPanel, "JOIN");
		
		JPanel loginPanel = new JPanel();
		loginPanel.setBackground(Color.ORANGE);
		parentPanel.add(loginPanel, "LOGIN");
		
		JPanel infoPanel = new JPanel();
		infoPanel.setBackground(Color.GREEN);
		parentPanel.add(infoPanel, "INFO");
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(Color.BLUE);
		parentPanel.add(mainPanel, "MAIN");
		
		JPanel menuPanel = new JPanel();
		menuPanel.setBackground(SystemColor.activeCaption);
		menuPanel.setForeground(Color.BLACK);
		contentPane.add(menuPanel, BorderLayout.SOUTH);
		
		JButton joinPanelButton = new JButton("가입패널");
		joinPanelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((CardLayout) parentPanel.getLayout()).show(parentPanel, "JOIN");
			}
		});
		
		JLabel prevLabel = new JLabel("");
		prevLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				((CardLayout) parentPanel.getLayout()).previous(parentPanel);
			}
		});
		prevLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		prevLabel.setIcon(new ImageIcon(CardLayoutFrame.class.getResource("/image/free-icon-direction-arrow-left.png")));
		menuPanel.add(prevLabel);
		joinPanelButton.setBackground(Color.WHITE);
		menuPanel.add(joinPanelButton);
		
		JButton loginPanelButton = new JButton("로그인패널");
		loginPanelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((CardLayout) parentPanel.getLayout()).show(parentPanel, "LOGIN");
			}
		});
		menuPanel.add(loginPanelButton);
		
		JButton infoPanelButton = new JButton("정보패널");
		infoPanelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((CardLayout) parentPanel.getLayout()).show(parentPanel, "INFO");
			}
		});
		menuPanel.add(infoPanelButton);
		
		JButton mainPanelButton = new JButton("메인패널");
		mainPanelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((CardLayout) parentPanel.getLayout()).show(parentPanel, "MAIN");
			}
		});
		menuPanel.add(mainPanelButton);
		
		JLabel nextLabel = new JLabel("");
		nextLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				((CardLayout) parentPanel.getLayout()).next(parentPanel);
			}
		});
		nextLabel.setIcon(new ImageIcon(CardLayoutFrame.class.getResource("/image/free-icon-direction-arrow-right.png")));
		nextLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		menuPanel.add(nextLabel);
		
		/* 초기 카드 설정 */
		CardLayout cardLayout = (CardLayout) parentPanel.getLayout();
		cardLayout.show(parentPanel, "MAIN");
	}

}
