package web.server;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import web.server.address.Address;
import web.server.address.AddressService;
import web.servlet.AddressListServlet;
import web.servlet.HelloServlet;

public class WebApplicationServerFrame extends JFrame {

	private JPanel contentPane;
	private JTextArea displayTA;
	WebServerThread webServerThread;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WebApplicationServerFrame frame = new WebApplicationServerFrame();
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
	public WebApplicationServerFrame() {
		setTitle("WebApplicationServer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 572, 297);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);

		displayTA = new JTextArea();
		displayTA.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 16));
		displayTA.setEditable(false);
		scrollPane.setViewportView(displayTA);
		/************* 서버쓰레드시작 ******************/
		new WebServerThread().start();

	}

	private void displayLog(String log) {
		displayTA.append(log + "\n");
		int maxLocation = scrollPane.getVerticalScrollBar().getMaximum();
		scrollPane.getVerticalScrollBar().setValue(maxLocation);

	}

	/*********************************************/
	public class WebServerThread extends Thread {
		HelloServlet helloServlet = new HelloServlet();
		AddressListServlet addressListServlet = new AddressListServlet();

		@Override
		public void run() {
			try {
				ServerSocket serverSocket = new ServerSocket(80);
				displayLog("0. WebServerThread: ServerSocket 생성(80)");

				while (true) {
					displayLog("1. WebServerThread: 클라이언트 연결 요청 대기(쓰레드 대기)");
					Socket socket = serverSocket.accept();
					displayLog("2. WebServerThread: 클라이언트와 연결된 서버쪽 소켓생성" + socket);
					BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
					displayLog("3. WebServerThread: 소켓으로부터 InputStream 생성");
					PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"));
					displayLog("3. WebServerThread: 소켓으로부터 OutputStream 생성");
					/*********** 자바 서블릿 객체 service 메쏘드 실행 start **********/
//					helloServlet.service(out);
					addressListServlet.service(out);
					
					out.flush();
					/*********** 자바 서블릿 객체 service 메쏘드 실행 end **********/

					displayLog("4. WebServerThread: 소켓으로부터 생성된 OutputStream에 서버 시간 쓰기");
					socket.close();
					displayLog("5. WebServerThread: 클라이언트와 연결된 서버쪽 소켓 닫기");
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
