/*
		형변환--> 숫자형데이타간에만 가능
		    - 형식 :  (데이타타입)변수 or 리터럴;
		    - 자동형변환(작은데이타-->큰데이타타입변수):promotion
			     byte-->short-->int-->long-->float-->double
		    - 자동형변환안됨(큰데이타-->작은데이타타입변수):casting
			     double-->float-->long-->int-->short-->byte     
 */
public class TypeCasting {
	public static void main(String[] args) {	
		/*
		 * 자동 형변환
		 */
		int i1 = 56;
		long l1 = i1;
		double d1 = i1;
		System.out.println(i1);
		System.out.println(l1);
		System.out.println(d1);
		
		/*
		 * 자동 형변환 X (큰 데이터 -> 작은 데이터 변환 시 데이터가 잘리는 경우)
		 * -> 강제 형변환(casting) 가능
		 */
		double avgd = 85.23;
		int avgi = (int)avgd; // 85
		System.out.println(avgd);
		System.out.println(avgi);
		
		/*
		 * 정수형 <<리터럴>>(10, 34, 999, ...)이 대입되는 변수 범위 안에 포함될 경우엔 자동 형변환해줌
		 * 정수형 <<변수>>의 값은 대입되는 범위 안에 포함돼도 자동 형변환 X
		 */
		char c1 = 'A';
		char c2 = 65; // char c2 = (char)65;
//		int i2 = 65;
//		char c3 = i2; -> 리터럴이 아닌 변수이므로 불가능
		System.out.println(c1);
		System.out.println(c2);
		
		/*
		 * 연산 시의 자동 형변환
		 *   - 연산항들 중 가장 큰 타입으로 모든 항이 자동 형변환됨 (promotion)
		 */
		
		int ii = 100;
		char cc = 'A'; // 65
		long ll = 45;
		double dd = 0.1;
		double dr = ii + cc + ll + dd; // 자동으로 double 타입이 됨
		System.out.println(dr);
		
		
	}
}
