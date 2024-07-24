package lang;
/*
- Wrapper 클래스
자바데이타형은 기본데이타형과 레퍼런스 데이타 형으로 구분됩니다.
기본데이타형으로는 int,boolean,double 등이 제공됩니다.
이런기본 데이타형을 객체로 사용할수있는 방법으로 
Wrapper 클래스가 제공됩니다.
Wrapper 클래스는 각종유용한 기능들을 메서드로 제공받을수있다는
장점이있습니다.
Integer,Boolean,Double,Character,Float,Long,Byte,Short
*/
public class WrapperClassMain {

	public static void main(String[] args) {
		System.out.println("- Boxing, Unboxing -");
		/*
		 * Boxing [기본형 -> Wrapper 객체]
		 */
		Character wc1 = new Character('김');
		Integer wi1 = new Integer(1234);
		Double wd1 = new Double(1.1);
		Boolean wb1 = new Boolean(true);
		
		/*
		 * Unboxing [Wrapper 객체 -> 기본형]
		 */
		char c1 = wc1.charValue();
		int i1 = wi1.intValue();
		double d1 = wd1.doubleValue();
		boolean b1 = wb1.booleanValue();
		
		System.out.println("- AutoBoxing, AutoUnboxing -");
		/*
		 * Auto Boxing [기본형 -> Wrapper 객체]
		 */
		Character wc2 = '김';
		Integer wi2 = 1234;
		Double wd2 = 1.1;
		Boolean wb2 = true;
		
		/*
		 * Auto Unboxing [Wrapper 객체 -> 기본형]
		 */
		char c2 = wc2;
		int i2 = wi2;
		double d2 = wd2;
		boolean b2 = wb2;
		
		System.out.println("*** AUTO BOXING ***");
		int a = 89;
		int b = 45;
		int c = 78;
		int d = 90;
		int e = 99;
		Integer ia = new Integer(a);
		Integer ib = new Integer(b);
		Integer ic = new Integer(c);
		Integer id = new Integer(d);
		Integer ie = new Integer(e);
		
		System.out.println("*** AUTO CASTING (자동형변환) ***");
		Object oa = ia;
		Object ob = ib;
		Object oc = ic;
		Object od = id;
		Object oe = ie;
		
		System.out.println("*** AUTO BOXING, AUTO CASTING ***");
		Object ooa = 89;
		Object oob = 45;
		Object ooc = 78;
		Object ood = 90;
		Object ooe = 99;
		
		System.out.println("*** Object[] ***");
		Object[] scoreArray = new Object[5];
		scoreArray[0] = 89;
		scoreArray[1] = 45;
		scoreArray[2] = 78;
		scoreArray[3] = 90;
		scoreArray[4] = 99;
		
		for (int i = 0; i < scoreArray.length; i++) {
			/*
			Integer tempScoreInteger = (Integer) scoreArray[i];
			int tempScore = tempScoreInteger.intValue();
			*/
			int tempScore = (Integer) scoreArray[i];
			System.out.print(tempScore + " ");
		}
		System.out.println();
		
		/*
		 * Wrapper 객체의 equals 메서드
		 */
		System.out.println("*** equals ***");
		Integer wi11 = new Integer(123);
		Integer wi22 = new Integer(123);
		System.out.println("주소 비교(==): " + (wi11 == wi22));
		System.out.println("equals(재정의 -> 기본형 멤버 필드 값 비교): " + wi11.equals(wi22));
		
		
		
		
	}

}
