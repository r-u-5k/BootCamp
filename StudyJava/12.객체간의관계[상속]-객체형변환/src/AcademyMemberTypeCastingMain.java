
public class AcademyMemberTypeCastingMain {

	public static void main(String[] args) {
		/*
		public class AcademyStudent extends AcademyMember {}
		public class AcademyGangsa extends AcademyMember {}
		public class AcademyStaff extends AcademyMember {}
		
		AcademyMember의자식타입객체(AcademyStudent,AcademyGangsa,AcademyStaff)들은
		AcademyMember 타입변수대입가능
		 */
		
		AcademyStudent st1 = new AcademyStudent(1, "KIM", "ANDROID");
		AcademyMember m1 = st1;
		AcademyMember m2 = new AcademyStudent(2, "LEE", "JAVA");
		AcademyMember m3 = new AcademyStudent(3, "JIN", "OFFICE");
		
		AcademyMember m4 = new AcademyGangsa(4, "박강사", "빅데이터");
		AcademyMember m5 = new AcademyGangsa(5, "김강사", "클라우드");
		
		AcademyMember m6 = new AcademyStaff(6, "박원장", "원장");
		AcademyMember m7 = new AcademyStaff(7, "나대리", "교무부");
		
		/* AcademyMember 타입에 정의되지 않은 메서드 호출 불가능
		String ban = m1.getBan();
		String subject = m4.getSubject();
		String depart = m6.getDepart();
		*/
		
		/*
		 * AcademyMember 타입에 정의된 메서드 중 재정의된 메서드는 호출 가능
		 *   - AcademyMember 타입에 정의된 print 메서드를 호출하면
		 *     AcademyMember의 자식 타입 객체에 재정의된 print 메서드가 호출됨
		 */
		m1.print(); // AcademyStudent 타입에서 재정의됨
		m4.print(); // AcademyGangsa 타입에서 재정의됨
		m6.print(); // AcademyStaff 타입에서 재정의됨
		System.out.println("- AcademyMember들 전체 출력 -");
		m1.print();
		m2.print();
		m3.print();
		m4.print();
		m5.print();
		m6.print();
		m7.print();
		
	}

}
