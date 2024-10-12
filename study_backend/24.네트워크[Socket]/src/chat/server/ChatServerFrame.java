package chat.server;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ChatServerFrame extends JFrame {

	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JTextField noticeTF;
	private JTextArea displayTA;
	/**** 접속된 클라이언트 객체(Socket)를 보관할 서비스 객체 ****/
	private ServerClientService clientService;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		ChatServerFrame frame = new ChatServerFrame();
		frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public ChatServerFrame() {
		setAlwaysOnTop(true);
		setTitle("ChatServer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 634, 394);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);

		displayTA = new JTextArea();
		displayTA.setFont(new Font("나눔고딕코딩", Font.BOLD, 18));
		displayTA.setEditable(false);
		scrollPane.setViewportView(displayTA);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);

		noticeTF = new JTextField();
		noticeTF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * 연결된 모든 클라이언트에게 공지사항 전송
				 */
				String noticeString = noticeTF.getText();
				noticeTF.setText("");
				if (noticeString.trim().equals("")) {
					noticeTF.setText("");
					noticeTF.requestFocus();
					return;
				}
				clientService.sendBroadcasting("[서버공지] " + noticeString);
			}
		});
		panel.add(noticeTF);
		noticeTF.setColumns(45);

		JButton noticeB = new JButton("공지");
		noticeB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * 연결된 모든 클라이언트에게 공지사항 전송
				 */
				String noticeString = noticeTF.getText();
				noticeTF.setText("");
				if (noticeString.trim().equals("")) {
					noticeTF.setText("");
					noticeTF.requestFocus();
					return;
				}
				clientService.sendBroadcasting("[서버공지] " + noticeString);
			}
		});
		panel.add(noticeB);

		/***** 접속된 클라이언트 객체를 보관할 ServerClientService 객체 생성 *****************/
		clientService = new ServerClientService();
		/***** 클라이언트의 소켓 연결 요청을 처리하는 ChatServerThread 객체 생성 스레드 start **/
		ChatServerThread chatServerThread = new ChatServerThread();
		chatServerThread.start();

	}// 생성자

	private void setLog(String log) {
		displayTA.append(log + "\n");
		int maxSize = scrollPane.getVerticalScrollBar().getMaximum();
		scrollPane.getVerticalScrollBar().setValue(maxSize);
	}

	/***********************************************
	 * 특정 포트를 열고 클라이언트의 소켓 연결 요청을 처리해서 소켓을 생성하는 클래스
	 ***********************************************/
	/*
	 setLog("0.ChatServerThread:8888번포트에 ServerSocket생성");
	 setLog("1.ChatServerThread:클라이어트소켓연결요청대기");
	 setLog("2.ChatServerThread:접속클라이언트:"+socket);
	 setLog("3.ChatServerThread:ClientService 객체에 ServerClientThread객체추가 쓰레드start");
	 */
	public class ChatServerThread extends Thread {
		@Override
		public void run() {
			try {
				setLog("0. ChatServerThread: 8888번 포트에 ServerSocket 생성");
				ServerSocket serverSocket = new ServerSocket(8888);
				while (true) {
					setLog("1. ChatServerThread: 클라이언트 소켓 연결 요청 대기");
					Socket socket = serverSocket.accept();
					setLog("2. ChatServerThread: 접속 클라이언트: " + socket);
					setLog("3. ChatServerThread: ClientService 객체에 ServerClientThread 객체 추가 스레드 start");
					ServerClient client = new ServerClient(socket);
					client.start();
					clientService.addClient(client);
				}
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}

		}
	}

	/********************************************
	 * 서버쪽 소켓을 사용하여 클라이언트와 통신을 담당하는 클래스 
	 * - 한명의 클라이언트와 통신을 담당하는 클래스 
	 * - 클라이언트와 연결된 서버쪽 소켓 1개를 가지고 있는 클래스 
	 * - 클라이언트의 정보를 가지고 있는 클래스 
	 * - 클라이언트 당 1개의 객체가 생성
	 ********************************************/
	public class ServerClient extends Thread {
		private String userID;
		private Socket socket; // 서버쪽 소켓
		private PrintWriter out;
		private BufferedReader in;

		public ServerClient(Socket socket) throws Exception {
			this.socket = socket;
			this.in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			this.out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
			this.userID = socket.getInetAddress().getHostAddress() + "[" + socket.getPort() + "]";
		}

		public String getUserID() {
			return userID;
		}

		public void setUserID(String userID) {
			this.userID = userID;
		}
		
		/*
		 * 서버에서 클라이언트로 데이터 전송
		 */
		public void send(String message) {
			out.println(message);
			out.flush();
		}
		
		/*
		 * 클라이언트에서 서버로 데이터 전송
		 */
		@Override
		public void run() {
			try {
				while (true) {
					setLog("가. ServerClient: " + this.userID + "로부터 데이터를 읽기 위해 스레드 대기");
					String chatString = in.readLine();
					setLog("나. ServerClient: " + this.userID + "로부터 읽은 데이터: " + chatString);
					setLog("다. ServerClient: 연결된 모든 클라이언트에게 읽은 데이터를 전송");
					clientService.sendBroadcasting(chatString);
				}
			} catch (Exception e) {
				System.err.println(e.getMessage());
				clientService.removeClient(this);
			}
			
		}
	}

	/********************************************
	 * 서버에 연결된 클라이언트 객체들을 관리(Service)할 클래스 
	 * - 클라이언트 객체 추가 
	 * - 클라이언트 객체 찾기 
	 * - 클라이언트 객체 삭제
	 * - 모든 클라이언트 객체에 데이터 전송
	 ********************************************/
	public class ServerClientService {
		private List<ServerClient> clientList;

		public ServerClientService() {
			clientList = new ArrayList<ServerClient>();
		}

		/*
		 * 클라이언트 객체 추가
		 */
		public void addClient(ServerClient client) {
			clientList.add(client);
			sendBroadcasting(client.getUserID() + "님 입장");
			setLog("A. ServerClientService: " + client.getUserID() + "님 입장");
			setLog("B. ServerClientService 현재 접속자 수: " + clientList.size() + "명");
		}

		/*
		 * 클라이언트 객체 삭제
		 */
		public void removeClient(ServerClient client) {
			clientList.remove(client);
			sendBroadcasting(client.getUserID() + "님 퇴장");
			setLog("A. ServerClientService: " + client.getUserID() + "님 퇴장");
			setLog("B. ServerClientService 현재 접속자 수: " + clientList.size() + "명");
		}
		
		/*
		 * 모든 클라이언트에 메세지 전송
		 */
		public void sendBroadcasting(String message) {
			for (ServerClient client : clientList) {
				client.send(message);
			}
		}
	}
}
