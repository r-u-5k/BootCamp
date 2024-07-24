
public class ControlMainThreadSleepMain {

	public static void main(String[] args) throws Exception {
		System.out.println("1. main thread start");
		/*
		 * Thread를 1000ms동안 중지시킴 (Running 상태 --> Block 상태)
		 * 1000ms 후 Thread는 깨어나서 Runnable 상태가 됨
		 */
		System.out.println("1000ms동안 Thread를 sleep시킴");
		Thread.sleep(1000);
		System.out.println("1000ms 후에 스레드가 깨어나서 실행됨");

		System.out.println("10000ms동안 Thread를 sleep시킴");
		Thread.sleep(10000);
		System.out.println("10000ms 후에 스레드가 깨어나서 실행됨");
		
		System.out.println("2. main thread end return");
		
		return;
	}

}
