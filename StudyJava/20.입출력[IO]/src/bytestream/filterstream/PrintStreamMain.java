package bytestream.filterstream;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamMain {

	public static void main(String[] args) throws Exception {
//		System.out.println();
		PrintStream pout = new PrintStream(new FileOutputStream("PrintStream.txt"));
		pout.write(65);
		pout.print('A');
		pout.print("A");
		pout.write(49);
		pout.write(50);
		pout.write(51);
		pout.write(52);
		pout.write('1');
		pout.write('2');
		pout.write('3');
		pout.write('4');
		pout.print(1234); // print는 모든 데이터를 문자열로 변환
		pout.print("1234");
		pout.print(true);
		pout.print("true");
		pout.print(3.14);
		pout.print("3.14");
		pout.println();
		pout.println("첫 번째 줄");
		pout.println("두 번째 줄");
		pout.flush();
		pout.close();
		System.out.println("System 표준 출력");
		System.err.println("System 에러 출력");
		System.out.println("- PrintStream.print() -");
		
	}

}
