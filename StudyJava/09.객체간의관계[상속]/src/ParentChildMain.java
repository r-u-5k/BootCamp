
public class ParentChildMain {

	public static void main(String[] args) {
		System.out.println("- Child -");
		Child c1 = new Child();
		System.out.println("c1 주소: " + c1);
		c1.member1 = 1;
		c1.member2 = 2;
		c1.member3 = 3;
		c1.method1();
		c1.method2();
		c1.method3();
		
		/*
		System.out.println("- Parent -");
		Parent p1 = new Parent();
		p1.member1 = 1;
		p1.member2 = 2;
		p1.method1();
		p1.method2();
		*/
	}
}
