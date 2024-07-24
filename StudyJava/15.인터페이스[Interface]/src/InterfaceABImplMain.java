
public class InterfaceABImplMain {

	public static void main(String[] args) {
		System.out.println(InterfaceA.CONSTANT1);
		System.out.println(InterfaceA.CONSTANT2);
		
		System.out.println("- InterfaceABImpl -");
		InterfaceABImpl abImpl = new InterfaceABImpl();
		abImpl.method1();
		abImpl.method2();
		abImpl.method3();
		abImpl.method4();
		
		System.out.println("- InterfaceA -");
		InterfaceA iA = abImpl;
		iA.method1();
		iA.method2();
//		iA.method3();
//		iA.method4();
		
		System.out.println("- InterfaceB -");
		InterfaceB iB = abImpl;
//		iB.method1();
//		iB.method2();
		iB.method3();
		iB.method4();
		
		System.out.println("- InterfaceA <--> InterfaceB -");
		InterfaceA iA2 = new InterfaceABImpl();
		iA2.method1();
		iA2.method2();
//		iA2.method3();
//		iA2.method4();
		
		InterfaceB iB2 = (InterfaceB) iA2; // 부모끼리의 casting도 가능
//		iB2.method1();
//		iB2.method2();
		iB2.method3();
		iB2.method4();
		
//		Object o = new InterfaceABImpl();
		
	}

}
