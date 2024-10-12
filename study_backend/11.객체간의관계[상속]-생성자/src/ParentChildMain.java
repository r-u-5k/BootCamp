
class Parent extends Object{
	private int member1;
	private int member2;
	
	public Parent() {
		/*
		 클래스 생성자 <<첫 번째 라인>>에서는 부모 클래스의 생성자가 반드시 호출되어야 한다.
		 부모 클래스 생성자 호출을 생략할 시에는 부모 클래스의 기본생성자가 자동으로 호출된다.
		 */
		super(); // 부모 클래스인 Object의 기본생성자 Object() 호출
		System.out.println("Object() 기본생성자 호출");
		System.out.println("Parent() 기본생성자 호출");
	}
	
	public Parent(int member1, int member2) {
		super();
		this.member1 = member1;
		this.member2 = member2;
		System.out.println("Object() 호출");
		System.out.println("Parent(int member1, int member2) 호출");
	}

	public void method1() {
		System.out.println("Parents.method1()");
	}
	public void method2() {
		System.out.println("Parents.method2()");
	}
	
	public void print() {
		System.out.print(this.member1 + "\t" + this.member2 + "\t");
	}

	public int getMember1() {
		return member1;
	}

	public void setMember1(int member1) {
		this.member1 = member1;
	}

	public int getMember2() {
		return member2;
	}

	public void setMember2(int member2) {
		this.member2 = member2;
	}
	
	
}

class Child extends Parent{
	public int member3;
	
	public Child() {
		super(); // 부모 클래스인 Parent의 기본생성자 Parent() 호출
		System.out.println("Child() 기본생성자 호출");
	}
	
	
	public Child(int member1, int member2, int member3) {
		/* Case 1 */
		super(member1, member2); // Parent 클래스의 public Parent(int member1, int member2)를 호출
//		this.member1 = member1; // -> member1이 private이므로 불가능
//		this.member2 = member2;
		
		/* Case 2 -> 가능하긴 한데 잘 하진 않음 */
		this.setMember1(member1); 
		this.setMember2(member2);
		this.member3 = member3;
		System.out.println("Child(int member1, int member2, int member3) 호출");
	}


	public void method3() {
		System.out.println("Child.method3()");
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println(this.member3);	
	}
	
}

public class ParentChildMain {

	public static void main(String[] args) {
		System.out.println("- Child() -");
		Child c1 = new Child();
		c1.print();
		
		System.out.println("- Child(int member1, int member2, int member3) -");
		Child c2 = new Child(1, 2, 3);
		c2.print();
	}

}
