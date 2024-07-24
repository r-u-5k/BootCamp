package president.korea;

import president.america.Trump;

public class YS {
	
	public int member1;
	protected int member2;
	int member3;
	private int member4;
	
	public void method1() {
		System.out.println("YS.method1()");
	}
	
	protected void method2() {
		System.out.println("YS.method2()");
	}
	
	void method3() {
		System.out.println("YS.method3()");
	}
	
	private void method4() {
		System.out.println("YS.method4()");
	}
	
	public void access() {
		/* YS와 같은 패키지 클래스 멤버(필드, 메서드) 접근 */
		DJ dj = new DJ(); // 같은 패키지 내에 있으므로 import 생략
		dj.member1 = 1;
		dj.member2 = 2;
		dj.member3 = 3;
//		dj.member4 = 4; -> private이므로 접근 불가능
		dj.method1();
		dj.method2();
		dj.method3();
//		dj.method4(); -> private이므로 접근 불가능
		
		/* YS와 다른 패키지 클래스 멤버(필드, 메서드) 접근 */
		Trump trump = new Trump(); // ctrl+shift+o로 자동 import
		trump.member1 = 1;
		/*
		trump.member2 = 2;
		trump.member3 = 3;
		trump.member4 = 4;
		*/
		trump.method1();
		/*
		trump.method2();
		trump.method3();
		trump.method4();
		*/
		
		
	}
}
