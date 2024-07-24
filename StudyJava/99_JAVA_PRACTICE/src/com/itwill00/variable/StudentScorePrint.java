package com.itwill00.variable;

public class StudentScorePrint {

	public static void main(String[] args) {
		// 변수 선언
		int num1, kor1, eng1, math1, sum1, rank1;
		int num2, kor2, eng2, math2, sum2, rank2;
		String name1, name2;
		double avg1, avg2;
		char grade1, grade2;
		
		// 기본 데이터 입력
		num1 = 9928;
		name1 = "장유진";
		kor1 = 98;
		eng1 = 85;
		math1 = 89;
		rank1 = 0;
		
		num2 = 563;
		name2 = "장서진";
		kor2 = 79;
		eng2 = 85;
		math2 = 68;
		rank2 = 0;
		
		// 유효성 체크
		if (kor1 < 0 || kor1 > 100 || eng1 < 0 || eng1 > 100 || math1 < 0 || math1 > 100 ||
			kor2 < 0 || kor2 > 100 || eng2 < 0 || eng2 > 100 || math2 < 0 || math2 > 100) {
			System.out.println("유효하지 않은 점수가 포함되어 있습니다.");
			return;
		}
		
		// 데이터 계산
		sum1 = kor1 + eng1 + math1;
		avg1 = sum1 / 3.0;
		
		sum2 = kor2 + eng2 + math2;
		avg2 = sum2 / 3.0;
		
		if (avg1 >= 90) {
			grade1 = 'A';
		} else if (avg1 >= 80) {
			grade1 = 'B';
		} else if (avg1 >= 70) {
			grade1 = 'C';
		} else if (avg1 >= 60) {
			grade1 = 'D';
		} else {
			grade1 = 'F';
		}
		
		if (avg2 >= 90) {
			grade2 = 'A';
		} else if (avg2 >= 80) {
			grade2 = 'B';
		} else if (avg2 >= 70) {
			grade2 = 'C';
		} else if (avg2 >= 60) {
			grade2 = 'D';
		} else {
			grade2 = 'F';
		}
		
		// 출력
		System.out.println("--------------- 학생 성적 출력 ---------------");
		System.out.println("학번  이름  국어 영어 수학 총점 평균 평점 석차");
		System.out.println("----------------------------------------------");
		System.out.printf("%4d %s  %d   %d   %d  %d  %.1f   %c    %d\n", 
				num1, name1, kor1, eng1, math1, sum1, avg1, grade1, rank1);
		System.out.printf("%4d %s  %d   %d   %d  %d  %.1f   %c    %d\n", 
				num2, name2, kor2, eng2, math2, sum2, avg2, grade2, rank2);
		System.out.println("----------------------------------------------");

	}

}
