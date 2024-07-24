
public class VariableTypes1 {

	public static void main(String[] args) {
		int i1, i2, i3, i4, i5, i6;
		i1 = 88;
		i2 = 99;
		i3 = 2147483647;
		i4 = 0b01111111111111111111111111111111;
		i5 = i1;
		i6 = i2;
		System.out.println("- int -");
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(i5);
		System.out.println(i6);
		System.out.println("-----------");
		
		long l1 = 232; 
// 		long l2 = 2147483648; -> The literal 2147483648 of type int is out of range
//		범위 오버 (-2147483648 ~ 2147483647)
		long l3 = 2147483648L;
		System.out.println(l1);
		System.out.println(l3);
		System.out.println("-----------");
		
		float f1 = 0.1F;
		System.out.println(f1);
		System.out.println("-----------");
		
		double d1, d2, d3;
		d1 = 3.141592;
		d2 = 123456789123456789123456789.0;
		d3 = 1.2345678912345678;
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println("-----------");
		
		char c1;
		c1 = 'A';
		char c2 = '가';
		char c3 = '힣';
		char c4 = '1';
		char c5 = c1;
		System.out.println("- char -");
		System.out.println((int)c1);
		System.out.println((int)c2);
		System.out.println((int)c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println("-----------");
		
		char m1, m2, m3, m4, m5, m6;
		m1 = 'A';
		m2 = 65;
		m3 = 0x0041;
		m4 = '\u0041';
		m5 = '\u000E';
		m6 = '★';
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		System.out.println(m5);
		System.out.println(m6);
		System.out.println("-----------");

		boolean bool1 = true;
		boolean bool2 = false;
		boolean bool3 = true;
		boolean bool4 = bool3;
		System.out.println("- boolean -");
		System.out.println(bool1);
		System.out.println(bool2);
		System.out.println(bool3);
		System.out.println(bool4);
		System.out.println("-----------");

		
		
		System.out.println("- 문자열형(String) -");
		
		String str1 = "오늘은";
		String str2 = "수요일";
		String str3 = "타입을 공부합니다.";
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		String str4 = str1 + " " + str2 + " " + str3 + "!";
		System.out.println(str4);
		
		String name = "장유진";
		int age = 24;
		char gender = 'M';
		double height = 181.6;
		double weight = 75.0; // 0.1은 그냥 .1로 대체 가능, 75.0은 75.로 대체 가능
		
		String myInfo = name + " " + age + " " + gender + " " + height + " " + weight;
		System.out.println("------------------------");
		System.out.println("이름 나이 성별 키 몸무게");
		System.out.println("------------------------");
		System.out.println(myInfo);
		System.out.println(name + " " + age + " " + gender + " " + height + " " + weight);

	}

}
