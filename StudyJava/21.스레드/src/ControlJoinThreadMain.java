
class ControlJoinThread extends Thread {
 	int start;
 	int end;
 	int total;
 	public ControlJoinThread(int start, int end) {
 		this.start = start;
 		this.end = end;
 	}
 	public int getTotal() {
 		return total;
 	}
 	public void setTotal(int total) {
 		this.total = total;
 	}
 	@Override
 	public void run() {
 		for (int i = start; i <= end; i++) {
 			total += i;
 		}
 	}
 }

 public class ControlJoinThreadMain extends Thread {
 	public static void main(String[] args) {
 		try {

 			ControlJoinThread thread1 = new ControlJoinThread(1, 50);
 			ControlJoinThread thread2 = new ControlJoinThread(51, 100);
 			thread1.start();
 			thread2.start();
 			/*
 			* thread1.join() 메쏘드를 호출한 메인쓰레드를 thread1 쓰레드가 종료될때까지 중지시킨다.
 			* thread2.join() 메쏘드를 호출한 메인쓰레드를 thread1 쓰레드가 종료될때까지 중지시킨다.
 			*/
 			thread1.join();
 			thread2.join();

 			int lastTotal = thread1.getTotal() + thread2.getTotal();
 			System.out.println("thread1 total = " + thread1.getTotal());
 			System.out.println("thread2 total = " + thread2.getTotal());
 			System.out.println("lastTotal = " + lastTotal);
 		} catch (Exception e) {
 			System.out.println(e);
 		}
 	}

 }