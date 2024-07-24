package com.itwill05.service.array.academy;

/*
 * AcademyMember들의 업무처리클래스
 *  Create
 *  Read
 *  Update
 *  Delete
 */
public class AcademyMemberService {

	public static final int STUDENT_TYPE = 1;
	public static final int GANGSA_TYPE = 2;
	public static final int STAFF_TYPE = 3;
	private AcademyMember[] members;

	public AcademyMemberService() {
		members = new AcademyMember[9];
		members[0] = new AcademyStudent(1, "KIM", "자바");
		members[1] = new AcademyStudent(2, "LEE", "리눅스");
		members[2] = new AcademyStudent(3, "KIM", "자바");
		members[3] = new AcademyStudent(4, "LEE", "IOT");
		members[4] = new AcademyGangsa(5, "CHOI", "프로그래밍");
		members[5] = new AcademyGangsa(6, "KIM", "DB");
		members[6] = new AcademyGangsa(7, "DIM", "OS");
		members[7] = new AcademyStaff(8, "AIM", "영업");
		members[8] = new AcademyStaff(9, "QIM", "생산");

	}

	/*
	 * 1.AcademyMember 전체출력
	 */
	public void print() {
		for (AcademyMember academyMember : members) {
			academyMember.print();
		}
	}
	

	/*
	 * 2-1.번호 1 번 AcademyMember 객체 참조변수반환해줘
	 * 
	 */
	public AcademyMember findByNo(int no) {
		for (AcademyMember academyMember : members) {
			if (academyMember.getNo() == no) {
				return academyMember;
			}
		}
		return null;
	}
	
	/*
	 * 2-2.이름 KIM 인 AcademyMember 배열객체 참조변수반환해줘
	 */
	public AcademyMember[] findByName(String name) {
		int index = 0;
		int count = 0;
		for (AcademyMember academyMember : members) {
			if (academyMember.getName().equals(name)) {
				count++;
			}
		}
		AcademyMember[] findMembers = new AcademyMember[count];
		for (AcademyMember academyMember : members) {
			if (academyMember.getName().equals(name)) {
				findMembers[index] = academyMember;
				index++;
			}
		}
		return findMembers;
	}

	/*
	 * 3.AcademyMember 중에서 AcademyStudent객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]
	 * 3.AcademyMember 중에서 AcademyStaff객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]
	 * 3.AcademyMember 중에서 AcademyGangsa객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]
	 */
	public AcademyMember[] findAcademyMember(int type) {
		AcademyMember[] findMembers = new AcademyMember[0];
		int count = 0;
		int index = 0;
		switch (type) {
		case STUDENT_TYPE:
			for (AcademyMember academyMember : members) {
				if (academyMember instanceof AcademyStudent) {
					count++;
				}
			}
			AcademyMember[] findStudents = new AcademyMember[count];
			for (AcademyMember academyMember : members) {
				if (academyMember instanceof AcademyStudent) {
					findStudents[index] = academyMember;
					index++;
				}
			}
			findMembers = findStudents;
			break;
		case GANGSA_TYPE:
			for (AcademyMember academyMember : members) {
				if (academyMember instanceof AcademyGangsa) {
					count++;
				}
			}
			AcademyMember[] findGangsas = new AcademyMember[count];
			for (AcademyMember academyMember : members) {
				if (academyMember instanceof AcademyGangsa) {
					findGangsas[index] = academyMember;
					index++;
				}
			}
			findMembers = findGangsas;
			break;
		case STAFF_TYPE:
			for (AcademyMember academyMember : members) {
				if (academyMember instanceof AcademyStaff) {
					count++;
				}
			}
			AcademyMember[] findStaffs = new AcademyMember[count];
			for (AcademyMember academyMember : members) {
				if (academyMember instanceof AcademyStaff) {
					findStaffs[index] = academyMember;
					index++;
				}
			}
			findMembers = findStaffs;
			break;
		}
		return findMembers;
	}

	/*
	 * 4.AcademyMember 중에서 자바반인   AcademyStudent 객체들 배열참조변수반환해줘 
	 * 4.AcademyMember 중에서 영업부서인 AcademyStaff   객체들 배열참조변수반환해줘 
	 * 4.AcademyMember 중에서 자바과목인 AcademyGangsa  객체들 배열참조변수반환해줘
	 */
	
	public AcademyMember[] findStudentsByBan(String ban) {
		int count = 0;
		int index = 0;
		for (AcademyMember academyMember : members) {
			if (academyMember instanceof AcademyStudent && ((AcademyStudent) academyMember).getBan().equals(ban)) {
				count++;
			}
		}
		AcademyMember[] findStudents = new AcademyMember[count];
		for (AcademyMember academyMember : members) {
			if (academyMember instanceof AcademyStudent && ((AcademyStudent) academyMember).getBan().equals(ban)) {
				findStudents[index] = academyMember;
				index++;
			}
		}
		return findStudents;
	}
	
	public AcademyMember[] findGangsasBySubject(String subject) {
		int count = 0;
		int index = 0;
		for (AcademyMember academyMember : members) {
			if (academyMember instanceof AcademyGangsa && ((AcademyGangsa) academyMember).getSubject().equals(subject)) {
				count++;
			}
		}
		AcademyMember[] findGangsas = new AcademyMember[count];
		for (AcademyMember academyMember : members) {
			if (academyMember instanceof AcademyGangsa && ((AcademyGangsa) academyMember).getSubject().equals(subject)) {
				findGangsas[index] = academyMember;
				index++;
			}
		}
		return findGangsas;
	}
	
	public AcademyMember[] findStaffsByDepart(String depart) {
		int count = 0;
		int index = 0;
		for (AcademyMember academyMember : members) {
			if (academyMember instanceof AcademyStaff && ((AcademyStaff) academyMember).getDepart().equals(depart)) {
				count++;
			}
		}
		AcademyMember[] findStaffs = new AcademyMember[count];
		for (AcademyMember academyMember : members) {
			if (academyMember instanceof AcademyStaff && ((AcademyStaff) academyMember).getDepart().equals(depart)) {
				findStaffs[index] = academyMember;
				index++;
			}
		}
		return findStaffs;
	}
	
}