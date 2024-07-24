package charstream.filterstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class OutputStreamWriterInputStreamReaderMain {

	public static void main(String[] args) throws Exception {
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("OutputStreamWriter.txt"));
		osw.write("첫 번째 라인\n");
		osw.write("두 번째 라인\n");
		osw.write("세 번째 라인\n");
		osw.write("네 번째 라인\n");
		osw.write("다섯 번째 라인\n");
		osw.flush();
		osw.close();
		System.out.println("OutputStreamWriter.write() --> OutputStreamWriter.txt");
		
		InputStreamReader isr = new InputStreamReader(new FileInputStream("OutputStreamWriter.txt"));
		/*BufferedReader br = new BufferedReader(isr);
		
		String readLine = br.readLine();
		System.out.println("1. readLine: " + readLine);
		readLine = br.readLine();
		System.out.println("2. readLine: " + readLine);
		readLine = br.readLine();
		System.out.println("3. readLine: " + readLine);
		readLine = br.readLine();
		System.out.println("4. readLine: " + readLine);
		readLine = br.readLine();
		System.out.println("5. readLine: " + readLine);*/
		
		while (true) {
			int readChar = isr.read();
			if (readChar == -1) break;
			System.out.print((char) readChar);
		}
		isr.close();
		System.out.println("InputStreamReader.read() <-- OutputStreamWriter.txt");

	}

}
