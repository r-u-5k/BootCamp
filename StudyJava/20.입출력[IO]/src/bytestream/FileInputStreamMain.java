package bytestream;

import java.io.FileInputStream;

public class FileInputStreamMain {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("FileOutputStream.dat");
		int byteCount = 0;
		int readByte = fis.read();
		byteCount++;
		System.out.println("1. byte: " + Integer.toBinaryString(readByte));
		readByte = fis.read();
		byteCount++;
		System.out.println("2. byte: " + Integer.toBinaryString(readByte));
		readByte = fis.read();
		byteCount++;
		System.out.println("3. byte: " + Integer.toBinaryString(readByte));
		readByte = fis.read();
		byteCount++;
		System.out.println("4. byte: " + Integer.toBinaryString(readByte));

		while (true) {
			readByte = fis.read();
			if (readByte == -1) break;
			byteCount++;
			System.out.println(Integer.toBinaryString(readByte));
		}
		fis.close();
		System.out.println("FileInputStream.read() <- FileOutputStream.dat: " + byteCount + " 바이트 읽음");
	}

}
