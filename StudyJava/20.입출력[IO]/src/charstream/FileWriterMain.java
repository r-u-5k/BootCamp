package charstream;

import java.io.FileWriter;

public class FileWriterMain {

	public static void main(String[] args) throws Exception {
		FileWriter fw = new FileWriter("FileWriter.txt");
		
		fw.write(44356);
		fw.write('A');
		fw.write('김');
		for (int i = 0; i < 65536; i++) {
			fw.write(i);
			if (i % 100 == 0) {
				fw.write('\n');
			}
		}
		
		fw.write("\n");
		fw.write("문자열을 맘대로 막 써요\n");
		fw.write("한 라인\n");
		fw.write("두 라인\n");
		fw.write("세 라인\n");
		fw.write("네 라인\n");
		fw.write("다섯 라인\n");
		fw.write("여섯 라인\n");
		fw.write("일곱 라인\n");
		fw.write("여덟 라인\n");
		fw.write("아홉 라인\n");
		fw.write("열 라인\n");
		/*
		 * 채워지지 않은 버퍼에 있는 데이터를 출력 스트림에 씀
		 */
		fw.flush();
		
		fw.close();
		System.out.println("FileWriter.write() -> FileWriter.txt");
		
	}

}
