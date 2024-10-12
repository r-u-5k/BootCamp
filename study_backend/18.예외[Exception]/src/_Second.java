import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.Socket;

public class _Second {
	public void method2() throws NullPointerException, 
	FileNotFoundException, IOException { // 예외처리가 날 수 있다고 method1에게 알려줌
		System.out.println("\t\t Second.method2() 실행");
		/***********case1(RuntimeException)***********
		 * 1.JVM 예외상황을 감지하고 예외객체(NullPointerException)생성
		 * 2.JVM은 생성한 예외객체를 반환방향으로 던진다.(throw)
		 * 3.실행 중인 쓰레드는 실행을 멈추고 호출한 곳(반환방향)으로 이동한다. 
		 * 4.JVM은 던져진 예외객체의 메세지를 출력한 후 쓰레드 종료(shut down)
		String str = null;
		int length = str.length();
		System.out.println(length);
		*/
		
		/***********case2(RuntimeException)***********
		 * 1.내가예외객체생성
		 * 2.내가 예외객체를 던진다.
		 * 3.실행 중인 쓰레드는 실행을 멈추고 호출한 곳(반환방향)으로 이동한다. 
		 * 4.JVM은 던져진 예외객체의 메세지를 출력한 후 쓰레드 종료(shut down)
		NullPointerException exception = 
				new NullPointerException("널포인터 애로사항 발생");
		boolean b = true;
		if (b) {
			throw exception;
		}
		 */
		
		/***********case3(비RuntimeException)***********/
		/*
		FileNotFoundException fexception = new FileNotFoundException("파일이 존재하지 않음");
		boolean b = true; 
		if (b) {
			throw fexception; // -> Unhandled exception type FileNotFoundException
		}
		*/
		
		/**case4(비RuntimeException)자바라이브러리사용**/
		Socket socket = new Socket("www.naver.com", 80); // Unhandled exception type IOException
		System.out.println(socket);
		System.out.println("\t\t Second.method2() 반환");
		return;
		
		
		
	}
	
}
