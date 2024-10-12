import java.io.FileNotFoundException;
import java.io.IOException;

public class _First {
	private _Second second;
	public _First() {
		second = new _Second();
	}
	public void method1() throws NullPointerException, 
	FileNotFoundException, IOException { // main에게 알려줌
		System.out.println("\t First.method1() 실행");
		second.method2();
		System.out.println("\t First.method1() 반환");
	}
	
}
