
public class MemberMethod {
	public int member1; // public은 생략 가능

	public void method1() {
		System.out.println("\t- void method1() 실행 시작 - ");
		System.out.println("\t method1 stmt1");
		System.out.println("\t method1 stmt2");
		System.out.println("\t- void method1() 실행 끝 - ");
		/*
		 * << return >>
		   - 모든 메쏘드블록의 마지막에는 항상 실행흐름을 호출한곳으로 반환하여야 한다.
		   - 실행흐름을 반환하는 문장이 return문이다.
		   - return 문을 만나면 실행흐름이 호출한 곳으로 반환된다.
		   - return type이 void 인 경우에는 생략이 가능하다.
		   - return문이 생략된 경우에는 컴파일러가 자동으로 return문을 삽입하여 준다.
		 */
		return;
	}

	/*매개변수(parameter)가 있는 메서드 정의*/
	public void method2(int count) {
		System.out.println("\t- void method2(int count) 실행 -");
		int localVar = 111;
		System.out.println("\t method2 메서드 블록 안에서 선언된 지역 변수: " + localVar);
		for (int i = 0; i < count; i++) {
			System.out.println("\t method2(int count) 실행: 파라메타(매개변수) count값 -> " + count);
		}
		System.out.println("\t- void method(int count) 실행 종료 후 실행 흐름을 반환 -");
		return;
	}

	public void method3(String msg, int count) {
		System.out.println("\t- void method3(String msg, int count) 실행 -");
		for (int i = 0; i < count; i++) {
			System.out.println("\t\t" + msg);
		}
		System.out.println("\t- void method3(String msg, int count) 실행 종료 후 실행 흐름을 반환 -");
	}

	public void method4(String name, String msg, int count) {
		System.out.println("\t- void method4(String name, String msg, int count) 실행 -");
		for (int i = 0; i < count; i++) {
			System.out.printf("\t\t%s님 %s\n", name, msg);
		}
		System.out.println("\t- void method4(String name, String msg, int count) 실행 종료 후 실행 흐름을 반환 -");

	}
}
