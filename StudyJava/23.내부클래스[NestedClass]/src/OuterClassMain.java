
public class OuterClassMain {
	
	public static void main(String[] args) {
		OuterClass outerClass = new OuterClass();
		System.out.println(outerClass);
		OuterClass.InnerClass innerClass = outerClass.new InnerClass();
		System.out.println(innerClass);
		innerClass.inner_member_field = 34;
		innerClass.inner_member_method();
	}
	
}
