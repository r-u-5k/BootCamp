package bytestream;

import java.io.FileOutputStream;

public class FileOutputStreamMain {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("FileOutputStream.dat");
		fos.write(0);
		fos.write(1);
		fos.write(2);
		fos.write(3);
		fos.write(4);
		fos.write(5);

		for (int i = 0; i < 256; i++) {
			fos.write(i);
		}

		fos.close();
		System.out.println("FileOutputStream.write() -> FileOutputStream.dat");

	}

}
