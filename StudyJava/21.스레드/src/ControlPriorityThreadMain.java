
class ControlPriorityThread extends Thread {
	public void run() {
		int sum = 0;
		Thread t = Thread.currentThread();
		System.out.println(t.getName() + " 쓰레드[priority " + t.getPriority() + "]시작");
		for (int i = 0; i <= 1000000000; i++) {
			sum += i;
		}
		System.out.println(t.getName() + " 쓰레드[priority " + t.getPriority() + "]완료-"+sum);
	}
}

public class ControlPriorityThreadMain {
	public static void main(String[] args) {
		for (int k = 0; k < 10; k++) {
			for (int i = Thread.MIN_PRIORITY; i <= Thread.MAX_PRIORITY; i++) {
				ControlPriorityThread pt = new ControlPriorityThread();
				pt.setPriority(i);
				pt.start();
			}
		}
	}
}