
public class OuterClass {
	/* OuterClass에서 InnerClass 클래스 객체를 멤버 필드로 사용 */
	private InnerClass ic = new InnerClass();
	/*
	 * 인스턴스 멤버 필드
	 */
	public int outer_member_field = 8888;
	/*
	 * 인스턴스 멤버 메서드
	 */
	public void outer_member_method() {
		System.out.println("OuterClass.outer_member_method()");
	}
	
	/* OuterClass에서 InnerClass 클래스 객체를 생성 & 사용 */
	public void outer_inner_class_use() {
//		OuterClass.InnerClass ic = new InnerClass();
		InnerClass ic = new InnerClass();
		ic.inner_member_field = 8709;
		ic.inner_member_method();
	}
	
	/*
	 * 인스턴스 멤버 클래스
	 *   - 작성 이유: 내부 클래스에서 외부 클래스의 멤버 변수(메서드) 접근을 손쉽게 하기 위함
	 */
	public class InnerClass {
		public int inner_member_field = 3333;
		public void inner_member_method() {
			System.out.println("InnerClass.inner_member_method()");
		}
		/* 내부 클래스에서 외부 클래스의 멤버 변수 (메서드) 접근 */
		public void inner_outer_member_access() {
			/*
			System.out.println(OuterClass.this.outer_member_field);
			OuterClass.this.outer_member_method();
			*/
			System.out.println(outer_member_field);
			outer_member_method();
		}
		
	}
	
}
