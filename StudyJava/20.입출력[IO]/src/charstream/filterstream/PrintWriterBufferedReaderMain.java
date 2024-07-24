package charstream.filterstream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class PrintWriterBufferedReaderMain {

	public static void main(String[] args) throws Exception {
		PrintWriter pw = new PrintWriter(new FileWriter("PrintWriterBufferedReader.txt"));
		pw.println("첫 번째 줄");
		pw.println("두 번째 줄");
		pw.println("세 번째 줄");
		pw.println("네 번째 줄");
		pw.println("다섯 번째 줄");
		pw.println("여섯 번째 줄");
		pw.println("일곱 번째 줄");
		pw.flush();
		pw.close();
		System.out.println("PrintWriter.println() --> PrintWriterBufferedReader.txt");
		
		BufferedReader br = 
				new BufferedReader(
						new InputStreamReader(
								new FileInputStream(
										"PrintWriterBufferedReader.txt")));
		while (true) {
			String readLine = br.readLine();
			if (readLine == null) break;
			System.out.println(readLine);
		}
		br.close();
		System.out.println("BufferedReader.readLine() <-- PrintWriterBufferedReader.txt");
		
	}

}
