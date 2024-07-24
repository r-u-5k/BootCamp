
class Overloading {
	public void method() {
		System.out.println("public void method()");
	}
	public void method(int a) {
		System.out.println("public void method(int a)");
	}
	public void method(String a) {
		System.out.println("public void method(String a)");
	}
	public void method(int a, int b) {
		System.out.println("public void method(int a, int b)");
	}
	public void method(int a, String b) {
		System.out.println("public void method(int a, String b)");
	}
	public void method(int a, int b, int c) {
		System.out.println("public void method(int a, int b, int c)");
	}
	public void method(String a, int b, int c) {
		System.out.println("public void method(String a, int b, int c)");
	}
	
}

public class OverloadingMain { // 파일 이름이랑 똑같은 클래스만 public 선언

	public static void main(String[] args) {
		Overloading overloading = new Overloading();
		overloading.method();
		overloading.method(123);
		overloading.method("김수한무");
		overloading.method(100, 200);
		overloading.method(100, "이백");
		overloading.method(1, 2, 3);
		overloading.method("일", 2, 3);
		
	}

}
