/*
쓰레드(thread)(실행흐름): 
   - 프로그램코드를 실행시키는 힘 
   - 메인쓰레드,GUI(AWT) 쓰레드,사용자정의 쓰레드
   - 언제 만드냐--> 두가지일을 동시에 해야할때..
 
 
- 쓰레드객체 만드는 방법(형식)
     

	type A:
	1. Thread 클래스를 상속받는다.
	2. Thread class의 run method를 overriding 한다.
		동사원형:public void run()
	3. Thread 객체를 생성한다.
	4. Thread 객체를통해서 Thread를 시작시킨다.
	
    type B:
	1. Runnable interface를 implements 한다.
	2. Runnable interface를 implements 한객체를
	   Thread 클래스의 생성자에 넣어서 Thread 객체를 생성한다
    3. Thread 를 시작시킨다.

   형식>>
    1. Thread 클래스를 상속받아서 만든다..
      ex> public class ThreadExtend extends Thread{
          		// run 메쏘드를 재정의 해야한다.
          		 public void run(){
          		 	//사용자가만든 쓰레드 가 실행할코드
          		 }
          } 
    2. Runnable interface를 implements 해서만든다
      ex>  public class ThreadImpl implements Runnable{
           		public void run(){
          		}
           }
*/
class CreateCustomThread extends Thread {
	@Override
	public void run() {
		while (true) {
			System.out.println("가. " + Thread.currentThread().getName() + " 스레드 실행");
			System.out.println("나. " + Thread.currentThread().getName() + " 스레드 반환");
		}
	}
}

public class CreateCustomThreadMain {

	public static void main(String[] args) {
		System.out.println("1. main thread start");
		CreateCustomThread cct = new CreateCustomThread();
		cct.setName("사용자 정의 스레드");
		System.out.println("2. main thread CreateCustomThread객체.start() 메서드 호출 전");
		cct.start();
		System.out.println("3. main thread CreateCustomThread객체.start() 메서드 호출 후");
		boolean isPlay = true;
		while (isPlay) {
			System.out.println("4. main thread");
		}
		
//		System.out.println("4. main thread end return");
		
	}

}
