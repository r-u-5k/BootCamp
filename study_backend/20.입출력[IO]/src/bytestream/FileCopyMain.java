package bytestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyMain {

	public static void main(String[] args) throws Exception {
		long startTime = System.currentTimeMillis();
		
		FileInputStream fis = new FileInputStream("RedUTF8.exe");
		FileOutputStream fos = new FileOutputStream("RedUTF888.exe");
		int byteCount = 0;
		int starCount = 0;
		while (true) {
			int readByte = fis.read();
			if (readByte == -1) break;
			byteCount++;
			if (byteCount % 1024 == 0) {
				System.out.print("*");
				starCount++;
				if (starCount % 50 == 0) {
					System.out.println();
				}
			}
			fos.write(readByte);
		}
		fis.close();
		fos.close();
		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;
		System.out.println();
		System.out.println("FileCopy: " + byteCount + "bytes copy");
		System.out.println(duration / 1000.0 + "s 소요");

	}

}
