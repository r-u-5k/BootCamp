/*
 * static (제한자,제어자,modifier)
 *   1.멤버필드(변수)나,멤버메쏘드 앞에 붙일수있다.
 * 	 2.static 제한자가 붙어있는 멤버필드(변수)나 멤버메쏘드는
 *     객체생성 없이도 사용이가능하다.
 *   3.클래스(틀)가 가지고있는 멤버변수나 멤버메쏘드이다.
 *   4.클래스로부터 생성되는 객체들이 공유하는 필드(변수),메쏘드 이다.      
 *     -->공용필드(공용메쏘드)라고도한다.
 *     
 *  -형식: 
 *  	멤버변수: public static int i;
 * 		멤버메쏘드:
 * 				- public static void print(){}
 * 				- public static int add(){}	
 * - 변수
 *  1.지역변수       : 메쏘드의 블록안에 선언된변수(매개변수)
 *  2.멤버필드(변수) : 클래스의 블록안에 선언된변수
 * 			2-1. 객체 필드(변수):인스턴스 생성되어야 사용할수있는 필드
 *          2-2. 정적 필드(변수):인스턴스 생성과 관계없이 사용가능한 필드
 *                               클래스로딩시 클래스에 생성되는 필드(변수)
 *                               
 * - 메쏘드
 *  1.멤버메쏘드
 *          1-1.객체 메쏘드:인스턴스 생성되어야 호출가능한메쏘드
 *          1-2.정적 메쏘드:인스턴스 생성과 관계없이 호출가능한 메쏘드
 *                          클래스로딩시 클래스에 생성되는 메쏘드                              
 */

class Static {
	
	public int instance_field; // 인스턴스 멤버필드(변수)
	
	public static int static_field; // 정적(static) 멤버필드(변수)
	
	public void instance_method() { // 인스턴스(객체) 멤버메서드
		System.out.println("난 인스턴스(객체) 메서드");
	}
	
	public static void static_method() { // 정적(static) 멤버메서드 -> this 사용할 수 없음. 참조할 주소가 없기 때문
		System.out.println("난 정적 메서드");
	}
	
}

public class StaticMain {
	
	public static void main(String[] args) {
		System.out.println("- static member access -");
		/*
		 * 정적 멤버 접근 - 클래스이름.정적멤버이름
		 */
		System.out.println(Static.static_field); // 0으로 자동 초기화됨
		Static.static_field = 8888;
		System.out.println(Static.static_field);
		Static.static_field = 9999;
		System.out.println(Static.static_field);
		Static.static_method();
		
		System.out.println("- instance member access -");
		Static static1 = new Static();
		System.out.println("static1 객체 주소: " + static1);
		static1.instance_field = 1111;
		static1.instance_method();

		Static static2 = new Static();
		System.out.println("static1 객체 주소: " + static2);
		static2.instance_field = 2222;
		static2.instance_method();
		
		System.out.println("- instance 참조변수를 사용해서 static member access (가능하긴 한데 안 쓰는 게 좋음) -");
//		System.out.println(static1.static_field); 이것도 가능하긴 한데
		System.out.println(Static.static_field); // 이게 올바른 방법
		
		
	}
}
