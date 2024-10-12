import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class NotRuntimeExceptionThrowMain {

	public static void main(String[] args) throws Exception
	/* throws UnknownHostException, IOException, ClassNotFoundException */ {
		System.out.println("stmt1");
		/*
		 * 예외 발생 예상 코드 (UnknownHostException: IOException의 자식)
		 */
		Socket socket = new Socket("www.daum.net", 80);
		System.out.println(socket);
		
		System.out.println("stmt2");

		/*
		 * 예외 발생 예상 코드 (ClassNotFoundException)
		 */
		Class aClass = Class.forName("AClass");
		System.out.println(aClass);
		
		System.out.println("stmt3");

		/*
		 * 예외 발생 예상 코드 (ArithmeticException: RuntimeException의 자식)
		 */
		int result = 3 / (int) (Math.random() * 2);
		System.out.println("result: " + result);
		
		System.out.println("stmt4");

	}

}
