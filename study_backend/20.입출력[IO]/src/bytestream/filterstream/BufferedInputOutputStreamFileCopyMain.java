package bytestream.filterstream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedInputOutputStreamFileCopyMain {

	public static void main(String[] args) throws Exception {
		long startTime = System.currentTimeMillis();
		
		BufferedInputStream bi = new BufferedInputStream(new FileInputStream("RedUTF8.exe"));
		BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream("RedUTF888.exe"));
		int byteCount = 0;
		int starCount = 0;
		while (true) {
			int readByte = bi.read();
			if (readByte == -1) break;
			byteCount++;
			if (byteCount % 1024 == 0) {
				System.out.print("*");
				starCount++;
				if (starCount % 50 == 0) {
					System.out.println();
				}
			}
			bo.write(readByte);
		}
		bi.close();
		bo.close();
		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;
		System.out.println();
		System.out.println("BufferedInputOutputFileCopy: " + byteCount + "bytes copy");
		System.out.println(duration / 1000.0 + "s 소요");

	}

}
