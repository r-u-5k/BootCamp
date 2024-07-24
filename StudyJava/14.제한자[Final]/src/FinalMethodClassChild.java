
public class FinalMethodClassChild extends FinalMethodClass {
	@Override
	public void method1() {
		System.out.println("FinalMethodClassChild에서 재정의된 FinalMethodClass.method1()");
	}
	
//	public void method2() {} -> Cannot override the final method from FinalMethodClass
	
}
