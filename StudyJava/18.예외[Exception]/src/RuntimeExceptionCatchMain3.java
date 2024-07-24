import javax.swing.JOptionPane;

public class RuntimeExceptionCatchMain3 {

	public static void main(String[] args) {
		try {
		System.out.println("stmt1");

		String str = null;
		if ((int) (Math.random() * 2) == 0) {
			str = "정상실행";
		}
		int length = str.length();
		/*
		 1. 예외상황발생하면  NullPointerException객체생성한후 
		    예외발생 코드를 가지고있는 메쏘드를(메인메쏘드) 호출한곳으로 던진다.(throw)
		 2. 던져진 예외객체는 catch block에 선언된 변수의 타입을검사해서 타입에일치하는 
		    변수에 대입된다.   
		 3. 현재실행흐름은 예외가발생한곳에서 catch block으로 실행흐름이이동한다.
		 */
		System.out.println("code length:" + length);
		System.out.println("stmt2");

		int[] intArray = new int[3];
		intArray[(int) (Math.random() * 4)] = 9999;
		/*
		 1. 예외상황발생하면  ArrayIndexOutOfBoundsException객체생성한후 
		    예외발생 코드를 가지고있는 메쏘드를(메인메쏘드) 호출한곳으로 던진다.(throw)
		 2. 던져진 예외객체는 catch block에 선언된 변수의 타입을검사해서 타입에일치하는 
		    변수에 대입된다.   
		 3. 현재실행흐름은 예외가발생한곳에서 catch block으로 실행흐름이이동한다.
		 */
		System.out.println("stmt3");
		int a = 3;
		int b = 0;
		int r = a / b;
		System.out.println("r = " + r);
		System.out.println("stmt4");
		} catch (NullPointerException e) { // 1차 거름망
			System.out.println("- catch start [NullPointerException] -");
			System.out.println("NullPointerException: " + e.getMessage());
			System.out.println(" - catch end [NullPointerException] -");
		} catch (ArrayIndexOutOfBoundsException e) { // 2차 거름망
			System.out.println("- catch start [ArrayIndexOutOfBoundsException] -");
			System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
			JOptionPane.showMessageDialog(null, "호갱님 ㅈㅅ 프로그램 종료함");
			System.exit(0); // Terminates the currently running JVM
			System.out.println(" - catch end [ArrayIndexOutOfBoundsException] -");
		} catch (Exception e) { // 혹시 모를 에러 방지용 (제일 넓은 범위)
			System.out.println("- catch start [Exception] -");
			System.out.println("Exception: " + e.getMessage());
			e.printStackTrace();
			System.out.println(" - catch end [Exception] -");
		}
	}

}