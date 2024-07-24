
public class MemberFieldInitializationMain {

	public static void main(String[] args) {
		System.out.println("1-1. 인스턴스 멤버 필드는 객체 생성 시 기본값으로 자동 초기화됨");
		MemberFieldInitialization memberFieldInitialization1 = new MemberFieldInitialization();
		System.out.println(memberFieldInitialization1.member1); // 0
		System.out.println(memberFieldInitialization1.member2); // 0.0
		System.out.println(memberFieldInitialization1.member3); // 0, '\0000' ('0'은 아님)
		System.out.println(memberFieldInitialization1.member4); // false
		System.out.println(memberFieldInitialization1.member5); // null
		System.out.println(memberFieldInitialization1.member6); // null
		
		System.out.println("1-2. 인스턴스 멤버 필드는 선언 시 설정한 초기값으로 자동 초기화됨");
		System.out.println(memberFieldInitialization1.member11); // 999
		System.out.println(memberFieldInitialization1.member22); // 3.1
		System.out.println(memberFieldInitialization1.member33); // 힣
		System.out.println(memberFieldInitialization1.member44); // true
		System.out.println(memberFieldInitialization1.member55); // 화요일
		System.out.println(memberFieldInitialization1.member66); // Order.java에 toString 메서드를 만들어놔서 값들이 찍힘
	
		System.out.println("1-3. 생성자 초기화");
		MemberFieldInitialization memberFieldInitialization2 = new MemberFieldInitialization(0, 0, '\u0000', false, null, null, 0, 0, '\u0000', false, null, null);
		System.out.println(memberFieldInitialization2.member3);
	
	}

}
