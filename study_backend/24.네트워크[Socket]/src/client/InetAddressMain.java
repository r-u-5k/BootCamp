package client;

import java.net.InetAddress;

public class InetAddressMain {

	public static void main(String[] args) throws Exception {
		System.out.println("- Local Address (IP) -");
		InetAddress localAddress = InetAddress.getLocalHost();
		System.out.println("Local Host Name: " + localAddress.getHostName()); // DESKTOP-PUS031K
		System.out.println("Local Host Address: " + localAddress.getHostAddress()); // 192.168.15.7
		
		System.out.println("- Remote Address (IP) -");
		InetAddress remoteAddress = InetAddress.getByName("www.naver.com");
		System.out.println("Remote Host Name: " + remoteAddress.getHostName());
		System.out.println("Remote Host Address: " + remoteAddress.getHostAddress());
		
		InetAddress[] remoteAddresses = InetAddress.getAllByName("www.naver.com");
		for (InetAddress inetAddress : remoteAddresses) {
			System.out.println(inetAddress);
		}
		
		
	}

}
