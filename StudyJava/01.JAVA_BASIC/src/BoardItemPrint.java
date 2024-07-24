
public class BoardItemPrint {

	public static void main(String[] args) {
		int num, viewCount;
		String title, writer, writeDate;
		
		num = 9928;
		title = "안녕하세요";
		writer = "장유진";
		writeDate = "2023.12.06";
		viewCount = 10;
		
		System.out.println("************************************************************************");

		System.out.println(" 순번 \t\t 제목 \t\t 작성자 \t 작성일 \t 조회수");
		System.out.println(" " + num + "\t      " + title + "\t " + writer + "\t       " 
							+ writeDate + "\t   " + viewCount);
		
		System.out.println("************************************************************************");

	}

}
