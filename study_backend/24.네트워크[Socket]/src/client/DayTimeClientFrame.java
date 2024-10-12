package client;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.SystemColor;

public class DayTimeClientFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel timeDisplayLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DayTimeClientFrame frame = new DayTimeClientFrame();
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
	public DayTimeClientFrame() {
		setTitle("DayTimeClient");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 688, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JButton requestServerTimeButton = new JButton("서버 시간 요청");
		requestServerTimeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					/*
					 * 1. Socket 생성
					 */
					Socket socket = new Socket("192.168.15.7", 8000);
					/*
					 * 2. Socket으로부터 InputStream 얻기
					 */
//					InputStream in = socket.getInputStream();
//					InputStreamReader isr = new InputStreamReader(in);
//					BufferedReader br = new BufferedReader(isr);
					BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
					String serverTime = br.readLine();
					timeDisplayLabel.setText(serverTime);
					br.close();
					socket.close();
				} catch (Exception e1) {
					System.out.println(e1.getMessage());
				}
			}
		});
		contentPane.add(requestServerTimeButton, BorderLayout.SOUTH);
		
		timeDisplayLabel = new JLabel("12:00");
		timeDisplayLabel.setHorizontalAlignment(SwingConstants.CENTER);
		timeDisplayLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 25));
		contentPane.add(timeDisplayLabel, BorderLayout.CENTER);
	}

}
