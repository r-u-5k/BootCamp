package server;

import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketMain {

	public static void main(String[] args) throws Exception {
		/*
		 * ServerSocket 클래스  
		 *   - 클라이언트의 소켓연결요청신호를 받아서
		 *     Socket을 생성하는 클래스
		 *   - 서버컴퓨터의 포트(0~65535)중의 하나를 점유하고
		 *     ServerSocket을 생성한다.    
		 */
		ServerSocket serverSocket = new ServerSocket(3333);
		/*
		 public Socket accept() throws IOException;
		 	- Listens for a connection to be made to this socket and accepts it. 
		 		A. 3333번포트를열고 클라이언트의 소켓연결요청을 무한하게 대기한다.
		 			(쓰레드블록킹)
		 		B. 소켓연결요청이오면 소켓을 생성한다.(반환한다)
		 	- The method blocks until a connection is made
		 	    A. 소켓이생성될때까지 쓰레드블록킹
		 */
		while (true) {
			System.out.println("0. 3333번 포트를 열고 클라이언트의 소켓 연결 요청을 " + "처리하기 위해 쓰레드가 무한하게 대기한다.");
			Socket socket = serverSocket.accept();
			System.out.println("1. 클라이언트 소켓 연결 요청을 처리한 후 소켓 반환");
			System.out.println("2. 클라이언트와 연결된 서버 소켓: " + socket);

			System.out.println("***** 서버쪽 소켓 정보 *****");
			InetAddress remoteAddress = socket.getInetAddress();
			InetAddress localAddress = socket.getLocalAddress();
			System.out.println(">> Remote IP: " + remoteAddress.getHostAddress());
			System.out.println(">> Remote Port: " + socket.getPort());
			System.out.println(">> Local IP: " + localAddress.getHostAddress());
			System.out.println(">> Local Port: " + socket.getLocalPort());
			System.out.println("****************************");

			System.out.println("3. 클라이언트와 연결된 서버쪽 소켓 닫기");
			socket.close();
		}
	}

}
