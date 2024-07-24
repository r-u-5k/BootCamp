package com.itwill05.service.array.academy;

public class AcademyMemberServiceMain {

	public static void main(String[] args) {
		AcademyMemberService academyMemberService = new AcademyMemberService();
		System.out.println("1.AcademyMember 전체출력");
		academyMemberService.print();
		
		System.out.println("2-1.번호 1 번 AcademyMember 객체 참조변수반환해줘");
		AcademyMember ac1 = academyMemberService.findByNo(1);
		ac1.print();
		
		System.out.println("2-2.이름 KIM 인 AcademyMember 배열객체 참조변수반환해줘");
		AcademyMember[] findKim = academyMemberService.findByName("KIM");
		for (AcademyMember academyMember : findKim) {
			academyMember.print();
		}
		
		System.out.println("3.AcademyMember 중에서 AcademyStudent객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]");
		AcademyMember[] findStudents = academyMemberService.findAcademyMember(1);
		for (AcademyMember academyMember : findStudents) {
			academyMember.print();
		}
		System.out.println("3.AcademyMember 중에서 AcademyStaff객체들  모두반환해줘 [ AcademyMember[] 객체주소반환 ]");
		AcademyMember[] findStaffs = academyMemberService.findAcademyMember(3);
		for (AcademyMember academyMember : findStaffs) {
			academyMember.print();
		}
		System.out.println("3.AcademyMember 중에서 AcademyGangsa객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]");
		AcademyMember[] findGangsas = academyMemberService.findAcademyMember(2);
		for (AcademyMember academyMember : findGangsas) {
			academyMember.print();
		}
		
		System.out.println("4.AcademyMember 중에서 자바반인  AcademyStudent객체들 배열참조변수반환해줘");
		AcademyMember[] findStudentsJAVA = academyMemberService.findStudentsByBan("자바");
		for (AcademyMember academyMember : findStudentsJAVA) {
			academyMember.print();
		}
		
		System.out.println("4.AcademyMember 중에서 영업부서인 AcademyStaff  객체들 배열참조변수반환해줘");
		AcademyMember[] findStaffsSales = academyMemberService.findStaffsByDepart("영업");
		for (AcademyMember academyMember : findStaffsSales) {
			academyMember.print();
		}
		
		System.out.println("4.AcademyMember 중에서 DB과목인 AcademyGangsa 객체들 배열참조변수반환해줘");
		AcademyMember[] findGangsasDB = academyMemberService.findGangsasBySubject("DB");
		for (AcademyMember academyMember : findGangsasDB) {
			academyMember.print();
		}
	}

}