
public class ObjectChildOverridingMain {

	public static void main(String[] args) {
		ObjectChild oc = new ObjectChild();
		String str1 = oc.toString(); // 재정의됨
		System.out.println(str1);
	}

}
