package prince.korea;

import president.korea.YS;

public class YSChild extends YS {
	
	public void access2() {
		this.member1 = 1;
		this.member2 = 2; // YS를 상속받았는데 protected이므로 접근 가능
		/*
		this.member3 = 3;
		this.member4 = 4;
		*/
		this.method1();
		this.method2(); // protected이므로 접근 가능
		/*
		this.method3();
		this.method4();
		*/
		
	}
	
	
}
