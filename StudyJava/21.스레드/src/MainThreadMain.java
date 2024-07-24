
public class MainThreadMain {

	public static void main(String[] args) {
		System.out.println("main thread start");
		/*
		 * 현재 코드를 실행하는 메인 스레드의 스레드 객체 참조 얻기
		 */
		Thread mainThread = Thread.currentThread();
		System.out.println(mainThread);
		System.out.println("main thread name: " + mainThread.getName());
		MainThreadCalled mainThreadCalled = new MainThreadCalled();
		mainThreadCalled.main_thread_called_method1();
		mainThreadCalled.main_thread_called_method2();
		System.out.println("main thread end return");
	}

}
