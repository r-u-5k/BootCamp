
public class MemberMethodReturn {
	/*
	 * 멤버필드
	 *   - 멤버필드 선언 시 값을 대입할 수 있다
	 */
	
	int memberField1 = 10; // 초기화 따로 안 해도 자동으로 초기화됨
	int memberField2 = 20;
	int memberField3 = 30;
//	System.out.println("헐"); -> 불가능
	
	/** setter method **/
	/*
	 * 멤버필드에 데이터를 대입하는 메서드
	 */
	public void setMemberField1(int memberField1) {
		this.memberField1 = memberField1;
	}
	
	
	public void setMemberField2(int memberField2) {
		this.memberField2 = memberField2;
	}


	public void setMemberField3(int memberField3) {
		this.memberField3 = memberField3;
	}


	/** getter method **/
	/*
	 * 멤버필드의 데이터를 반환하는 메서드
	 */
	public int getMemberField1() {
		return this.memberField1;
	}


	public int getMemberField2() {
		return this.memberField2;
	}


	public int getMemberField3() {
		return this.memberField3;
	}


	
	
	
	
	
	
	
	public int method1() {
		System.out.println("\tint method1() 실행");
		int result = 234 + 324234;
		System.out.println("\tint method1() 실행 종료 후 int 데이터 반환");
		
		/*
		 return <<호출한 클래스(객체)에게 반환할 값(변수, 리터럴, 연산의 결과)>>;
		    - 호출한 곳으로 실행흐름 반환
		    - 호출한 곳으로 데이터 반환
		    - 반환할 데이터가 없는 경우에는(void)    return문 생략이 가능하다.
		    - 반환할 데이터가 있는 경우에는(int,...) return문을 반드시 기술하여야 한다.
		 */
		return result;
	}
	
	public boolean method2() {
		System.out.println("\tboolean method2() 실행");
		boolean isMarried = false;
		System.out.println("\tboolean method2() 실행 종료 후 boolean 데이터 반환");
		return isMarried;
	}
	
	/*
	 * 두 개의 정수를 파라메타로 받아서 더한 결과(정수)를 반환하는 메서드
	 */
	public int add(int a, int b) {
		System.out.println("\tint add(int a, int b) 실행");
		System.out.println("\tint add(int a, int b) 실행 종료 후 int 데이터 반환");
		return a + b; // JAVA에선 반환값이 단 하나만 됨
	}

	public String hello(String name) {
		String msg = name + "님 안녕하세요";
		return msg;
	}
}
