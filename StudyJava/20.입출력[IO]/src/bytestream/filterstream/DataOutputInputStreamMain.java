package bytestream.filterstream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataOutputInputStreamMain {

	public static void main(String[] args) throws Exception {
		/*
		 * 자바의 기본 데이터를 출력 스트림에 쉽게 쓸 수 있도록 하는 필터 스트림
		 */
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("DataOutputStream.itwill"));
		int intData = 2147483647;
		dos.writeInt(intData);
		dos.writeBoolean(true);
		dos.writeChar('가');
		dos.writeDouble(3.14);
		dos.writeUTF("오늘은 자바 입출력을 공부합니다"); // String
		dos.close();
		System.out.println("DataOutputStream.write...() --> DataOutputStream.itwill");
		
		/*
		 * 자바의 기본 데이터를 입력 스트림으로부터 쉽게 읽을 수 있도록 하는 필터 스트림
		 */
		DataInputStream dis = new DataInputStream(new FileInputStream("DataOutputStream.itwill"));
		int readInt = dis.readInt();
		System.out.println("readInt: " + readInt);
		System.out.println("readBoolean: " + dis.readBoolean());
		System.out.println("readChar: " + dis.readChar());
		System.out.println("readDouble: " + dis.readDouble());
		System.out.println("readUTF: " + dis.readUTF());
		dis.close();
		System.out.println("DataInputStream.read...() <-- DataOutputStream.itwill");
	}

}
