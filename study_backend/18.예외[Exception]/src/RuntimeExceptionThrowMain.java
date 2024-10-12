public class RuntimeExceptionThrowMain {
	/*
	* 모든메쏘드는 throws RuntimeException구문이생략되어있다
	*/
	public static void main(String[] args) {
		System.out.println("stmt1");
		/*
		예외발생예상코드
		*/
		String str = null;
		if ((int) (Math.random() * 2) == 0) { // 0 아니면 1
			str = "예외";
		}
		int length = str.length();
		System.out.println("length: " + length);
		/*
		1. 예외상황발생하면  NullPointerException 객체생성한후 
			예외발생 코드를 가지고있는 메쏘드를(메인메쏘드) 호출한곳으로 던진다.(throw)
		2. 현재실행흐름은 실행을멈추고 
			예외발생 코드를 가지고있는 메쏘드를(메인메쏘드) 호출한곳으로 이동
		*/
		
		System.out.println("stmt2");
		
		/*
		1. 예외상황발생하면  ArrayIndexOutOfBoundsException 객체생성한후 
			예외발생 코드를 가지고있는 메쏘드를(메인메쏘드) 호출한곳으로 던진다.(throw)
		2. 현재실행흐름은 실행을멈추고 
			예외발생 코드를 가지고있는 메쏘드를(메인메쏘드) 호출한곳으로 이동
		*/
		int[] intArray = new int[3];
		intArray[(int) (Math.random() * 5)] = 9999;
		
		System.out.println("stmt3");
		return;
	}
}