
class OuterClassOverridingInnerClass {
	private int outer_member_field;

	public void outer_member_method() {
		System.out.println("OuterClassOverridingInnerClass.outer_member_method()");
	}

	/*
	 * OuterClass에서 재정의된 InnerClass 객체 사용
	 */
	public void outer_inner_class_use() {
		/* member inner class [CASE 1] */
		ObjectChild oc1 = new ObjectChild();
		System.out.println("oc1.toString(): " + oc1.toString());
		ParentFirstConcreteClass childParentFirstConcreteClass1 = new ChildParentFirstConcreteClass();
		childParentFirstConcreteClass1.method();
		ParentSecondAbstractClass childParentSecondAbstractClass1 = new ChildParentSecondAbstractClass();
		childParentSecondAbstractClass1.method();
		ChildParentThirdInterface childParentThirdInterface1 = new ChildParentThirdInterface();
		childParentThirdInterface1.method();
		
		System.out.println("----------------------------");
		/* anonymous local inner class [CASE 2] */
		/*
		 * 특정 클래스(인터페이스)의 메서드를 재정의해야 할 때
		 *   - 1. local 위치에 이름이 없는 클래스 정의
		 *   - 2. 이름이 없는 클래스의 객체 생성
		 */
		Object oc2 = new Object() {
			@Override
			public String toString() {
				return "Object를 상속받는 이름 없는 클래스의 toString()의 재정의";
			}
		};
		System.out.println("oc2.toString(): " + oc2.toString());
		
		ParentFirstConcreteClass childParentFirstConcreteClass2 = new ParentFirstConcreteClass() {
			@Override
			public void method() {
				System.out.println("ParentFirstConcreteClass를 상속받는 이름 없는 로컬 내부 클래스에서 재정의한 메서드");
			}
		};
		childParentFirstConcreteClass2.method();
		
		ParentSecondAbstractClass childParentSecondAbstractClass2 = new ParentSecondAbstractClass() {
			@Override
			public void method() {
				System.out.println("ParentSecondAbstractClass를 상속받는 이름 없는 로컬 내부 클래스에서 재정의한 메서드");
			}
//			public void test() {
//				System.out.println("test");
//			}
		};
		childParentSecondAbstractClass2.method();
//		childParentSecondAbstractClass2.test();
		
		ParentThirdInterface childParentThirdInterface2 = new ParentThirdInterface() {
			@Override
			public void method() {
				System.out.println("ParentThirdInterface를 상속(구현)받는 이름 없는 로컬 내부 클래스에서 재정의한 메서드");
			}
		};
		childParentThirdInterface2.method();
		
	}

	/* 
	 * member inner class
	 *   - 특정 클래스의 상속 후에 메서드를 재정의한 클래스
	 */
	public class ObjectChild extends Object {
		@Override
		public String toString() {
			return "Object를 상속받는 ObjectChild에서 재정의한 toString()";
		}
	}

	public class ChildParentFirstConcreteClass extends ParentFirstConcreteClass {
		@Override
		public void method() {
			System.out.println("ParentFirstConcreteClass를 상속받는 ChildParentFirstConcreteClass에서 재정의한 메서드");
		}
	}
	
	public class ChildParentSecondAbstractClass extends ParentSecondAbstractClass {
		@Override
		public void method() {
			System.out.println("ParentSecondAbstractClass를 상속받는 ChildParentSecondAbstractClass에서 재정의한 메서드");
		}
	}
	
	public class ChildParentThirdInterface implements ParentThirdInterface {
		@Override
		public void method() {
			System.out.println("ParentThirdInterface를 상속(구현)받는 ChildParentThirdInterface에서 재정의한 메서드");
		}
	}
	
}

	public class OuterClassOverridingInnerClassMain {

		public static void main(String[] args) {
			OuterClassOverridingInnerClass outerClassOverridingInnerClass = new OuterClassOverridingInnerClass();
			outerClassOverridingInnerClass.outer_inner_class_use();

		}

	
	}
