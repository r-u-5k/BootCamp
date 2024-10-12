package charstream.filterstream;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintWriter;

public class PrintWriterMain {

	public static void main(String[] args) throws Exception {
//		PrintWriter pw = new PrintWriter(new FileWriter("PrintWriter.txt"));
//		PrintWriter pw = new PrintWriter(new FileOutputStream("PrintWriter.txt"));
		PrintWriter pw = new PrintWriter("PrintWriter.html");
		pw.println("<html><body><h1>프린트스트림</h1></body></html>");
		pw.flush();
		pw.close();
		System.out.println("PrintWriter.print() --> PrintWriter.txt");
		
	}

}
