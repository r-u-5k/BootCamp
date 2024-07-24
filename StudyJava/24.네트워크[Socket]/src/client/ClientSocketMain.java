package client;

import java.net.InetAddress;
import java.net.Socket;

public class ClientSocketMain {

	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("192.168.15.7", 3333);
		System.out.println(">> Client쪽 Socket: " + socket.toString());
		InetAddress remoteAddress = socket.getInetAddress();
		InetAddress localAddress = socket.getLocalAddress();
		System.out.println(">> Remote IP: " + remoteAddress.getHostAddress());
		System.out.println(">> Remote Port: " + socket.getPort());
		System.out.println(">> Local IP: " + localAddress.getHostAddress());
		System.out.println(">> Local Port: " + socket.getLocalPort());
		
	}

}
