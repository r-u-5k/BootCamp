
public class MainThreadCalled {

	public void main_thread_called_method1() {
		System.out.println("\t A. " + Thread.currentThread().getName() + " 스레드 실행");
		System.out.println("\t B. " + Thread.currentThread().getName() + " 스레드 반환");
		return;
	}
	
	public void main_thread_called_method2() {
		System.out.println("\t 가. " + Thread.currentThread().getName() + " 스레드 실행");
		System.out.println("\t 나. " + Thread.currentThread().getName() + " 스레드 반환");
		return;
	}

}
