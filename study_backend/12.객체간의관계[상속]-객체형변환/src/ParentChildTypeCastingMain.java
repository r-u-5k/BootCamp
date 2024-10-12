/*
 객체주소변수의 형변환(type casting)
   1. 상속관계에있는 클래스(타입) 사이에서만 가능하다.
      ex> 자식클래스타입 객체의주소를 부모클래스타입 객체의 주소로 형변환(주소변경절대안됨,타입만변경)
      ex> 부모클래스타입 객체의주소를 자식클래스타입 객체의 주소로 형변환(주소변경절대안됨,타입만변경)
        
   2. 자식클래스타입 객체의주소를 부모클래스타입 객체의 주소로 형변환
       - 자동으로 이루어진다(묵시적)
       		Child c = new Child();
       		Parent p = c; 
       		
       		Parent p=new Child();
   
   3. 부모클래스타입 객체의주소를 자식클래스타입 객체의 주소로 형변환
       - 원칙적으로는 불가능하다
       - 부모의 탈을쓴 자식객체 는 가능하다.
       	Parent p=new Parent();
       	Child cccc = p;(X)
	    public class Parent{}
	    public class Child extends Parent{}
 */
class Parent {
	public void method1() {
		System.out.println("Parent.method1()");
	}
	public void method2() {
		System.out.println("Parent.method2()");
	}
	public void method3() {
		System.out.println("Parent.method3()");
	}
	public void method4() {
		System.out.println("Parent.method4()");
	}
}

class Child extends Parent {
	@Override
	public void method4() {
		System.out.println("Child.method4() -> Parent.method4()를 재정의(오버라이딩)함");
	}
	public void method5() {
		System.out.println("Child.method5()");
	}
}

public class ParentChildTypeCastingMain {

	public static void main(String[] args) {
		System.out.println("- Child -> Parent -");
		Child c1 = new Child();
		c1.method1();
		c1.method2();
		c1.method3();
		c1.method4(); // 재정의된 메서드
		c1.method5();
		Parent p1 = c1; // 주소값 변경 X, 타입만 Child에서 Parent로 변경됨
		if (p1 == c1) {
			System.out.println("p1 = " + p1 + ", c1 = " + c1 + " -> p1과 c1의 주소가 동일");
		}
		p1.method1();
		p1.method2();
		p1.method3();
		p1.method4();
//		p1.method5();
		
		System.out.println("- Parent -> Child -");
		/*
		부모클래스타입 객체의주소를 자식클래스타입 객체의 주소로 형변환
       		- 원칙적으로는 불가능하다
       		- 부모의 탈을쓴 자식객체 는 가능하다.
       	Parent p=new Parent();
       	Child cccc = p;(X)
	    public class Parent{}
	    public class Child extends Parent{}
		*/
		
//		Parent p2 = new Parent();
//		Child c2 = p2; -> Type mismatch: cannot convert from Parent to Child
//		Child c2 = (Child)p2 -> 강제 형변환 시 컴파일은 가능하나 실행 시 에러(exception) 발생
		
		// Parent = 구형, Child = 신형(업데이트 버전)
		
		
		
		Parent p3 = new Child(); // 이것도 가능
		p3.method1();
		p3.method2();
		p3.method3();
		p3.method4(); // 객체가 Child 타입이니까 Child에서 재정의된 메서드가 호출됨
//		p3.method5();
		
		Child c2 = new Child();
		Parent p2 = c2; // Child 타입을 Parent 타입으로 형변환해줬으니
		Child c3 = (Child)p2; // 그 경우에 한해서만 역으로도 형변환 가능해짐
		c3.method1();
		c3.method2();
		c3.method3();
		c3.method4();
		c3.method5();
		
		
		
		
	}

}
