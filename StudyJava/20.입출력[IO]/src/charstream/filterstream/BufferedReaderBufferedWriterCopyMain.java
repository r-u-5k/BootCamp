package charstream.filterstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedReaderBufferedWriterCopyMain {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("죄와벌.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("죄와벌[복사].txt"));
		int lineCount = 0;
		/*
		public String readLine() throws IOException
		- Reads a line of text.
		- A line is considered to be terminated 
		     by any one of a line feed ('\n'), 
		     a carriage return ('\r'), 
		     or a carriage return followed immediately by a linefeed.
		Returns:
			- A String containing the contents of the line, 
			  not including any line-termination characters, 
			  or null if the end of the stream has been reached
		 */
		/*
		String readLine = br.readLine();
		System.out.println("1. " + readLine);
		readLine = br.readLine();
		System.out.println("2. " + readLine);
		*/
		while (true) {
			String readLine = br.readLine();
			if (readLine == null) break;
			if (readLine.equals("")) { 
				continue;
			}
			lineCount++;
			readLine = lineCount + readLine.replace("제이든", "김경호");
			
			bw.write(readLine);
			bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();
		System.out.println("BufferedReaderBufferedWriterCopy: " + lineCount);
		
		
	}

}
