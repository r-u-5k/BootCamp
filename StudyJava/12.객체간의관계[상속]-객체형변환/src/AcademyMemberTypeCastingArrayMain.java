
public class AcademyMemberTypeCastingArrayMain {

	public static void main(String[] args) {
		
		/* AcademyMember m = new AcademyMember(); -> 필요없는 멤버. 
		 * 추상 클래스를 통해 생성되지 않도록 할 수 있음 */
		
		AcademyMember[] members = {
				new AcademyStudent(1, "KIM", "JAVA"),
				new AcademyStudent(2, "LIM", "DESIGN"),
				new AcademyStudent(3, "MIM", "ANDROID"),
				new AcademyGangsa(4, "OIM", "JAVA"),
				new AcademyGangsa(5, "PIM", "ANDROID"),
				new AcademyStaff(6, "QIM", "ACCOUNTING"),
				new AcademyStaff(7, "RIM", "MARKETING")
		};
		
		AcademyMember[] recvMembers = members; // AcademyMember 객체가 어떻게 생겼는지 모른 채로 출력해야 할 경우
		
		System.out.println("- AcademyMember 전체 출력 -");
		
		for (AcademyMember academyMember : recvMembers) {
			academyMember.print();
		}
		
		System.out.println("- instance of -");
		/*
		 * 연산자: instanceof (~의 객체인지 확인)
		 *   - 형태: 참조변수 instanceof 클래스이름(타입)
		 *   - 연산 결과: true or false
		 *   - ex)  AcademyMember m = new AcademyStudent(1, "김", "리눅스");
		 *   		boolean isStudentObject = m instanceof AcademyStudent;
		 */
		AcademyMember m = new AcademyStudent(90, "김학생", "정보처리");
		if (m instanceof AcademyStudent) {
			AcademyStudent tempStudent = (AcademyStudent)m; // m이 AcademyStudent의 하위 객체일 때만 casting 가능
			String ban = tempStudent.ban;
			System.out.println("학생 반: " + ban);
		}
		
		System.out.println("- AcademyMember 배열에 있는 객체들 중에 "
							+ "AcademyStudent 객체 판별 후 출력 -");
		for (AcademyMember academyMember : recvMembers) {
			if (academyMember instanceof AcademyStudent) {
				academyMember.print();
			}
		}
		
		System.out.println("- AcademyMember 배열에 있는 객체들 중에 AcademyGangsa 객체 판별 후 과목 출력 -");
		
		for (AcademyMember academyMember : recvMembers) {
			if (academyMember instanceof AcademyGangsa) {
				AcademyGangsa tempGangsa = (AcademyGangsa)academyMember;
				String tempSubject = tempGangsa.getSubject();
				System.out.println("강사 과목: " + tempSubject);
			}
		}
		
		System.out.println("- AcademyMember 배열에 있는 객체들 중에 AcademyStaff 객체 판별 후 부서 출력 -");
		
		for (AcademyMember academyMember : recvMembers) {
			if (academyMember instanceof AcademyStaff) {
				AcademyStaff tempStaff = (AcademyStaff)academyMember;
				String tempDepart = tempStaff.getDepart();
				System.out.println("직원 부서: " + tempDepart);

			}
		}
		
		
	}

}
