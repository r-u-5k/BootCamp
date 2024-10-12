
class ControlStopThread1 extends Thread {
	@Override
	public void run() {
		try {
			for (int i = 1; i <= 100; i++) {
				System.out.println("Downloading...[" + i + "%]");
				Thread.sleep(100);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " thread가 jvm으로 return --> thread end");
		return;
	}
}

class ControlStopThread2 extends Thread {
	private boolean isPlay = true;

	public ControlStopThread2() {
		isPlay = true;
	}

	@Override
	public void run() {
		while (isPlay) {
			try {
				System.out.println("---------------------");
				System.out.println("1. game move");
				Thread.sleep((int) (Math.random() * 1000) + 1);
				System.out.println("2. game fight");
				Thread.sleep((int) (Math.random() * 1000) + 1);
				System.out.println("3. game get score");
				Thread.sleep((int) (Math.random() * 1000) + 1);
				System.out.println("4. game power up");
				Thread.sleep((int) (Math.random() * 1000) + 1);
				System.out.println("5. game score update");
				Thread.sleep((int) (Math.random() * 1000) + 1);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public boolean isPlay() {
		return isPlay;
	}

	public void setPlay(boolean isPlay) {
		this.isPlay = isPlay;
	}
}

public class ControlStopThreadMain {

	public static void main(String[] args) throws Exception {
		System.out.println("main");
		ControlStopThread1 cst1 = new ControlStopThread1();
		cst1.setName("Download");
		cst1.start();
		System.out.println("main thread 3초 대기");
		Thread.sleep(3000);
//		cst1.stop();
		
		ControlStopThread2 cst2 = new ControlStopThread2();
		cst2.start();
		Thread.sleep(4500);
//		cst2.stop();
		cst2.setPlay(false);

		System.out.println("main thread jvm return end");
	}

}
