package com.itwill01.field;

public class StudentMemberFieldMain {
	public static void main(String[] args) {
		/*
		 * 학생객체 2명생성
		 */
		
		Student student1;
		student1 = new Student();
		Student student2; 
		student2 = new Student();
		
		/*
		 * 학생객체의 기본데이타(번호,이름,국어,영어,수학)대입(2명)
		 */

		student1.num = 1;
		student1.name = "장유진";
		student1.kor = 96;
		student1.eng = 85;
		student1.math = 93;
		
		student2.num = 2;
		student2.name = "장서진";
		student2.kor = 78;
		student2.eng = 80;
		student2.math = 87;
		
		/*
		 * 학생의 기본데이타를사용해서 총점,평균,평점 계산후 대입(2명)
		 */
		
		student1.sum = student1.kor + student1.eng + student1.math;
		student1.avg = student1.sum / 3.0;
		
		student2.sum = student2.kor + student2.eng + student2.math;
		student2.avg = student2.sum / 3.0;
		
		if (student1.kor < 0 || student1.kor > 100 || student1.eng < 0 || student1.eng > 100 || student1.math < 0 || student1.math > 100 ||
			student2.kor < 0 || student2.kor > 100 || student2.eng < 0 || student2.eng > 100 || student2.math < 0 || student2.math > 100) {
				System.out.println("유효하지 않은 점수가 포함되어 있습니다.");
				return;
		}
		
		if (student1.avg >= 90) {
			student1.grade = 'A';
		} else if (student1.avg >= 80) {
			student1.grade = 'B';
		} else if (student1.avg >= 70) {
			student1.grade = 'C';
		} else if (student1.avg >= 60) {
			student1.grade = 'D';
		} else {
			student1.grade = 'F';
		}
		
		if (student2.avg >= 90) {
			student2.grade = 'A';
		} else if (student2.avg >= 80) {
			student2.grade = 'B';
		} else if (student2.avg >= 70) {
			student2.grade = 'C';
		} else if (student2.avg >= 60) {
			student2.grade = 'D';
		} else {
			student2.grade = 'F';
		}
		
		/*
		 * 학생 데이타를 출력 2명
		 */
		/*
		- 출력포맷
		- 평균은 소수점이하 첫째자리까지출력(반올림)
		- 석차는 구하지마세요
		--------------학생 성적출력-------------------
		학번  이름   국어 영어 수학 총점 평균 평점 석차
		-----------------------------------------------
		 1   김경호   42   56   78   334  34.8  A   3  
		 2   김경수   45   53   76   334  34.8  A   2  
		-----------------------------------------------
		*/
		System.out.printf("--------------학생 성적출력-------------------%n");
		System.out.printf("%s %3s %3s %s %s %s %s %s %s%n","학번","이름","국어", "영어","수학","총점","평균","평점","석차");
		System.out.printf("-----------------------------------------------%n");
		System.out.printf("%3d %4s %4d %4d %4d %4d %4.1f %3c %4d%n",student1.num, student1.name, student1.kor, student1.eng, student1.math, student1.sum, student1.avg, student1.grade, 0);
		System.out.printf("%3d %4s %4d %4d %4d %4d %4.1f %3c %4d%n",student2.num, student2.name, student2.kor, student2.eng, student2.math, student2.sum, student2.avg, student2.grade, 0);
	}
}