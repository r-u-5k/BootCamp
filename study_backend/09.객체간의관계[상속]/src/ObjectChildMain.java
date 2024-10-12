
public class ObjectChildMain {

	public static void main(String[] args) {
		ObjectChild oc1 = new ObjectChild();
		int hashCode = oc1.hashCode(); // 객체의 주소값
		System.out.println(hashCode); // 10진
		System.out.println(Integer.toHexString(hashCode)); // 16진
		String str1 = oc1.toString(); // 객체의 대표 문자열 출력 (주소값)
		System.out.println(str1); // System.out.println(oc1); 과 동일
		
	}

}
