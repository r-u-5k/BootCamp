import javax.swing.JOptionPane;

public class RuntimeExceptionCatchMain2 {

	public static void main(String[] args) {

		System.out.println("stmt1");
		String str = null;

		if ((int) (Math.random() * 2) == 0) {
			str = "정상실행";
		}
		try {
			/*
			 * 예외 발생 예상 코드
			 */
			int length = str.length();
			/*
			1. 예외상황발생하면  NullPointerException객체생성한후 
			예외발생 코드를 가지고있는 메쏘드를(메인메쏘드) 호출한곳으로 던진다.(throw)
			2. 던져진 예외객체는 catch block에 선언된 변수의 타입을검사해서 타입에일치하는 
			변수에 대입된다.   
			3. 현재실행흐름은 예외가발생한곳에서 catch block으로 실행흐름이이동한다.
			*/
			System.out.println("code length: " + length);

		} catch (NullPointerException e) {
			System.out.println("- catch start [NullPointerException] -");
			System.out.println("NullPointerException: " + e.getMessage());
			str = "catch에서 처리함";
			int length = str.length();
			System.out.println("catch length: " + length);
			System.out.println(" - catch end [NullPointerException] -");
		}

		System.out.println("stmt2");
		
		try {
			int[] intArray = new int[3];
			intArray[3] = 9999;
			/*
		 	1. 예외상황발생하면  ArrayIndexOutOfBoundsException객체생성한후 
		    예외발생 코드를 가지고있는 메쏘드를(메인메쏘드) 호출한곳으로 던진다.(throw)
		 	2. 던져진 예외객체는 catch block에 선언된 변수의 타입을검사해서 타입에일치하는 
		    변수에 대입된다.   
		 	3. 현재실행흐름은 예외가발생한곳에서 catch block으로 실행흐름이이동한다.
			*/
			System.out.println("stmt3");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("- catch start [ArrayIndexOutOfBoundsException] -");
			System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
			JOptionPane.showMessageDialog(null, "호갱님 ㅈㅅ 프로그램 종료함");
			System.exit(0); // Terminates the currently running JVM
			System.out.println(" - catch end [ArrayIndexOutOfBoundsException] -");
		}
		
		
		System.out.println("stmt4");

	}

}