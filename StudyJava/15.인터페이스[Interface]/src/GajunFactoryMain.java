
public class GajunFactoryMain {

	public static void main(String[] args) {
		
		System.out.println("- 가전제품 공장 -");
		
		GajunTV tv1 = new GajunTV();
		GajunTV tv2 = new GajunTV();
		GajunTV tv3 = new GajunTV();
		GajunAudio audio1 = new GajunAudio();
		GajunAudio audio2 = new GajunAudio();
		GajunSmartPhone phone1 = new GajunSmartPhone();
		GajunSmartPhone phone2 = new GajunSmartPhone();
		GajunSmartPhone phone3 = new GajunSmartPhone();

		GajunOnOff[] gajunArray = new GajunOnOff[8];
		gajunArray[0] = tv1;
		gajunArray[1] = tv2;
		gajunArray[2] = tv3;
		gajunArray[3] = audio1;
		gajunArray[4] = audio2;
		gajunArray[5] = phone1;
		gajunArray[6] = phone2;
		gajunArray[7] = phone3;
		
		/*
		 * 난 절대로 자식 클래스 타입을 사용 안 할래요 
		 * 난 부모 타입[GajumOnOff, GajunVolume] 만 사용할래요 
		 * 그래야 가전제품 검사 프로그램을 한 번 만들어서
		 * 변경 없이 계속 사용할 수 있으니까요~~~
		 */
		/*
		System.out.println("- 가전제품 검사소 -");
		GajunOnOff[] recvGajunArray = gajunArray;
		for (int i = 0; i < recvGajunArray.length; i++) {
			recvGajunArray[i].on();
			GajunVolume tempGajun = (GajunVolume) recvGajunArray[i];
			tempGajun.up();
			tempGajun.down();
			recvGajunArray[i].off();
		}
		
		System.out.println("- 검사 끝 (출고)-");
		*/
		System.out.println("- 가전제품 검사소 -");
		GajunOnOff[] recvGajunArray = gajunArray;
		GajunGumsa gajunGumsa = new GajunGumsa();
		gajunGumsa.setGajuns(recvGajunArray);
	}

}
