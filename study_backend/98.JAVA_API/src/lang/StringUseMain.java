package lang;

public class StringUseMain {

	public static void main(String[] args) {

		System.out.println("- String.length() -");
		String str1 = "Have a nice day!";
		String str2 = "오늘은 수요일";
		System.out.println(str1.length());
		System.out.println(str2.length());
		System.out.println("자바가 재미있네요.".length());
		String emptyStr = "";
		System.out.println("empty string length: " + emptyStr.length());

		System.out.println("- null -");
		String id = null;
		// String id = "";
		if (id == null || id.equals("")) {
			System.out.println("아이디를 입력하세요");
		}

		System.out.println("- chatAt() -");
		String userId = "testST@$#34254";
		char firstChar = userId.charAt(0);
//		char lastChar = userId.charAt(userId.length() - 1);
		System.out.println("아이디의 첫 문자는 영문대(소)문자여야 한다");
		System.out.println("아이디는 영문대(소)문자 또는 숫자여야 한다");
		if ((firstChar >= 'a' && firstChar <= 'z') || (firstChar >= 'A' && firstChar <= 'Z')) {
			System.out.println(firstChar + "는 아이디의 첫 문자로 유효합니다.");
		} else {
			System.out.println(firstChar + "는 아이디의 첫 문자로 유효하지 않습니다.");
		}
		System.out.println("[Quiz] userId 유효성 체크");

		System.out.println("- substring() -");
		System.out.println("Have a nice day!!!".substring(7));
		System.out.println("Have a nice day!!!".substring(7, 11));
		System.out.println("오늘은 수요일 String 클래스를 공부해요".substring(4, 7));
		System.out.println("오늘은 수요일 String 클래스를 공부해요".substring(4));

		System.out.println("- indexOf() -");
		String email = "yj9999@gmail.com";
		int atSignPosition = email.indexOf('@'); // "@"도 가능
		System.out.println(email.substring(0, atSignPosition)); // 아이디만 추출
		System.out.println(email.substring(atSignPosition + 1)); // 도메인만 추출

		System.out.println("- split() - ");
		String phoneNumber = "010-1234-5678";
		String[] phoneNumArray = phoneNumber.split("-");
		for (String string : phoneNumArray) {
			System.out.println(string);
		}

		System.out.println("- replace() -");
		String str3 = "자바는 객체지향 언어입니다. 우리는 자바를 공부합니다.";
		System.out.println(str3.replace('자', '멀'));
		System.out.println(str3.replace("자바", "파이썬"));

		System.out.println("- toUpperCase(), toLowerCase -");
		System.out.println("jAvA".toUpperCase());
		System.out.println("jAvA".toLowerCase());

		System.out.println("- equals() -");
		System.out.println("java".equals("JAVA")); // false
		System.out.println("java".equalsIgnoreCase("JAVA")); // true (대소문자 구분 X)

		System.out.println("- startsWith() -");
		String name = "김수한";
		if (name.startsWith("김")) {
			System.out.println("김씨");
		}

		System.out.println("- endsWith() -");
		if (name.endsWith("한")) {
			System.out.println("OO한");
		}
		
		System.out.println("- trim() (== strip()) -");
		String id2 = "   guard     ";
		System.out.println(id2.trim());
		System.out.println(id2.strip());
		String chat = "          ";
		if (chat.trim().length() == 0) {
			System.out.println("전송 X");
		}
		System.out.println(chat.length());
		
		System.out.println("------------------------");
		
		/*
		 * [Quiz]
		 * String fileName = "a.txt";
		 * "a_copy.txt"로 바꾸기
		 */

		String[] names = { "정경호", "김미숙", "최경녀", "김은희", "신명숙" };
		for (String irum : names) {
			if (irum.startsWith("김")) {
				System.out.println(irum);
			}
		}

		System.out.println("------------------------");

		/*
		 * [Quiz]
		 * 김씨를 찾아서 새로운 배열에 담아보세요
		 */
		int count = 0;
		for (int i = 0; i < names.length; i++) {
			if (names[i].startsWith("김")) {
				count++;
			}
		}

		String[] newNames = new String[count];

		for (int i = 0, j = 0; i < names.length; i++) {
			if (names[i].startsWith("김")) {
				newNames[j] = names[i];
				j++;
			}
		}
		/*
		for (int i = 0; i < names.length; i++) {
			if (names[i].startsWith("김")) {
				for (int j = 0; j < newNames.length; j++) {
					newNames[j] = names[i];
				}
			}
		}
		*/

		for (String kimName : newNames) {
			System.out.println(kimName);
		}

		System.out.println("------------------------");

		String[] fileNameArray = { "rabbit.jpg", "man.gif", "tiger.txt", "Test.java", "address.doc" };
		for (String fileName : fileNameArray) {
			if (fileName.endsWith(".jpg") || (fileName.endsWith(".gif"))) {
				System.out.println("이미지 파일: " + fileName);
			}
		}
		
		
	}

}
