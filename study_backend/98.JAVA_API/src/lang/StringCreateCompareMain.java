package lang;

public class StringCreateCompareMain {

	public static void main(String[] args) {
		/*
		 * String 객체의 생성
		 *   1. 생성자 호출 (명시적)
		 *   2. ""으로 생성 (암시적)
		 */
		String name1 = new String("KIM");
		String name2 = new String("KIM");
		String name3 = "KIM"; // 상수풀에 "KIM"이 있는지 찾고, 없으면 새로 만듦
		String name4 = "KIM"; // 상수풀에 "KIM"이 있는지 찾았는데 이미 있으므로 name3의 주소를 가짐
		
		/* System.out.println("- String 객체의 주소 비교 -"); <<웬만하면 안 하는 걸 추천>>
		if (name1 != name2) { // name1과 name2의 주소는 다름 (명시적으로 생성했기 때문)
			System.out.println("name1과 name2의 주소는 다르다");
		}
		
		if (name2 != name3) { // name2와 name3의 주소는 다름 (name2는 명시적으로, name3는 암시적으로 생성했기 때문)
			System.out.println("name2과 name3의 주소는 다르다");
		}
		
		if (name3 == name4) { // name3과 name4의 주소는 같음
			System.out.println("name3과 name4의 주소는 같다");
		}
		*/
		
		System.out.println("- String 객체의 값 비교 -"); // String 클래스에서 재정의된 equals 메서드 사용
		/*
		 public boolean equals(Object obj);
			- Indicates whether some other object is "equal to" this one.
		    - 주소가 동일한지 비교
			 Parameters:
				obj - the reference object with which to compare.	
			 
			 Returns:
				true if this object is the same as the obj argument; false otherwise.
		 */
		/*
		public boolean equals(Object anObject)
		Overrides: equals in class Object
		*/
		if (name1.equals(name2)) {
			System.out.println("name1 객체의 (멤버필드)문자열과 name2 객체의 문자열이 동일하다");
		}
		
		if (name1.equals(name3)) {
			System.out.println("name1 객체의 (멤버필드)문자열과 name3 객체의 문자열이 동일하다");
		}
		
		if (name1.equals(name4)) {
			System.out.println("name1 객체의 (멤버필드)문자열과 name4 객체의 문자열이 동일하다");
		}
		
		if (name1.equals("KIM")) {
			System.out.println("name1 객체의 문자열과 \"KIM\" 객체의 문자열이 동일하다");
		}
		
		if ("KIM".equals(name4)) {
			System.out.println("\"KIM\" 객체의 문자열과 name1 객체의 문자열이 동일하다");
		}
		
		/*
		 * public int compareTo(String anotherString)
		 * Compares two strings lexicographically. (문자열을 사전(유니코드) 순으로 비교)
		 * 결과가 음수면 왼쪽의 유니코드가 오른쪽의 유니코드보다 작음, 양수면 왼쪽이 오른쪽보다 큼, 0이면 동일
		 * ex) "김" - "홍" < 0, "홍" - "김" > 0, "김".equals("김") == "김".compareTo("김") == 0
		 */
		int unicodeGap = "aaa".compareTo("aab");
		System.out.println(unicodeGap); // -1
		unicodeGap = "aab".compareTo("aaa");
		System.out.println(unicodeGap); // 1
		
		String irum1 = "홍경호";
		String irum2 = "강경호";
		
		if (irum1.compareTo(irum2) > 0) {
			System.out.println("(오름차순인 경우) irum1과 irum2를 교환하면 됨");
		}
	}

}
