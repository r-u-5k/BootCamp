package com.itwill02.constructor;

public class StudentConstructorMain {
	
	public static void main(String[] args) {
		/*
		 학생객체생성(3명)
		  - 1명은 기본생성자사용
			  학생객체기본데이타(번호, 이름, 국어, 영어, 수학) 입력메쏘드호출
		  - 2명은 인자5개 생성자사용
		 */
		Student student1 = new Student();
		student1.setStudentData(1, "장유진", 93, 88, 96);
		Student student2 = new Student(2, "장우진", 87, 75, 91);
		Student student3 = new Student(3, "장서진", 79, 85, 73);
	
		/*
		 학생총점계산 메쏘드 호출(3명)
		 학생평균계산 메쏘드 호출(3명)
		 학생평점계산 메쏘드 호출(3명)
		 */
		student1.calculateTotal();
		student2.calculateTotal();
		student3.calculateTotal();
		
		student1.calculateAvg();
		student2.calculateAvg();
		student3.calculateAvg();
		
		student1.calculateGrade();
		student2.calculateGrade();
		student3.calculateGrade();
		
		/*
		 * 학생데이타 출력메쏘드 호출(3명)
		 */
		student1.headerPrint();
		student1.print();
		student2.print();
		student3.print();
		
		/*
		 * 학생 student1 의 이름변경한후(이름변경메쏘드호출후) student1학생객체출력
		 * 학생 student1 의 총점데이타 반환받은후 메인블록에서출력
		 * 학생 student1 의 학점데이타 반환받은후 메인블록에서출력
		 */
		student1.setName("김경호");
		student1.print();
		System.out.println("student1의 총점: " + student1.getTot());
		System.out.println("student1의 평점: " + student1.getGrade());
		
		
		/***** 혼자 해본 석차 노가다 *****/
		
		if (student1.getTot() >= student2.getTot() && student1.getTot() >= student3.getTot()) { // st1 1등
			student1.setRank(1);
			if (student2.getTot() > student3.getTot()) {
				student2.setRank(2);
				student3.setRank(3);
			} else if (student2.getTot() == student3.getTot()) {
				student2.setRank(2);
				student3.setRank(2);
			} else {
				student2.setRank(3);
				student3.setRank(2);
			}
		}
		
		if (student2.getTot() >= student1.getTot() && student2.getTot() >= student3.getTot()) { // st2 1등
			student2.setRank(1);
			if (student1.getTot() > student3.getTot()) {
				student1.setRank(2);
				student3.setRank(3);
			} else if (student2.getTot() == student3.getTot()) {
				student1.setRank(2);
				student3.setRank(2);
			} else {
				student1.setRank(3);
				student3.setRank(2);
			}
		}
		
		if (student3.getTot() >= student2.getTot() && student3.getTot() >= student1.getTot()) { // st3 1등
			student3.setRank(1);
			if (student2.getTot() > student1.getTot()) {
				student2.setRank(2);
				student1.setRank(3);
			} else if (student2.getTot() == student1.getTot()) {
				student2.setRank(2);
				student1.setRank(2);
			} else {
				student2.setRank(3);
				student1.setRank(2);
			}
		}
	
	}
}