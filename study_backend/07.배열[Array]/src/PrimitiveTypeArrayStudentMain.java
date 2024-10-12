
public class PrimitiveTypeArrayStudentMain {

	public static void main(String[] args) {
		System.out.println("- 학생 10명 성적 데이터를 저장하기 위한 배열 객체 생성 & 초기화 -");
		int[] noArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		/* 
		 * String[] nameArray;
		 * nameArray = new String[] {"KIM", "LEE", "PARK", "CHOI", "SIM", "KIM", "MIN", "JANG", "LIM", "NA"};
		 */
		String[] nameArray = {"KIM", "LEE", "PARK", "CHOI", "SIM", "KIM", "MIN", "JANG", "LIM", "NA"}; 
		
		int[] korArray = {89, 67, 80, 67, 80, 98, 80, 67, 88, 80};
		int engArray[] = {99, 69, 75, 61, 66, 91, 93, 71, 89, 99};
		int[] mathArray= {83, 64, 59, 68, 30, 91, 96, 64, 81, 93};
		int[] totArray = new int[10];
		double[] avgArray = new double[10];
		char[] gradeArray = {'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F'};
		int[] rankArray = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
		
		/*
		 * 총점, 평균, 평점 계산
		 */
		for (int i = 0; i < noArray.length; i++) {
			totArray[i] = korArray[i] + engArray[i] + mathArray[i];
			avgArray[i] = totArray[i] / 3.0;
		
			if (avgArray[i] >= 90) {
				gradeArray[i] = 'A';
			} else if (avgArray[i] < 90 && avgArray[i] >= 80) {
				gradeArray[i] = 'B';
			} else if (avgArray[i] < 80 && avgArray[i] >= 70) {
				gradeArray[i] = 'C';
			} else if (avgArray[i] < 70 && avgArray[i] >= 60) {
				gradeArray[i] = 'D';
			} else
				gradeArray[i] = 'F';
		}
		
		/*
		 * 총점으로 석차 계산
		 */
		for (int i = 0; i < noArray.length; i++) {
			for (int j = 0; j < noArray.length; j++) {
				if (i == j) continue;
				if (totArray[i] < totArray[j]) {
					rankArray[i]++;
				}
			}
		}
		
		
		/*
		 * 학생 검색(번호, 국어, 영어, 수학, 학점, 석차)
		 */
		
		/*
		 * 번호 3번인 학생 1명 찾아서 1명 정보 출력(학생 번호는 중복되지 않는다.)
		 */
		System.out.println("- 번호 3번 -");
		for (int i = 0; i < noArray.length; i++) {
			if (noArray[i] == 3) {
				System.out.printf("%2d %6s %3d %4d %4d %4d %5.1f %3c %3d\n", 
						noArray[i], nameArray[i], korArray[i], engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
				break;
			}
		}
		
		 /*
		 * 국어 점수 80점인 학생들 여러 명 찾아서 여러 명 정보 출력
		 */
		System.out.println("- 국어 80점 -");
		for (int i = 0; i < noArray.length; i++) {
			if (korArray[i] == 80) {
				System.out.printf("%2d %6s %3d %4d %4d %4d %5.1f %3c %3d\n", 
						noArray[i], nameArray[i], korArray[i], engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
			}
		}
		
		 /*
		 * 영어 점수 70점 이하인 학생들 여러 명 찾아서 여러 명 정보 출력
		 */
		System.out.println("- 영어 70점 이하 -");
		for (int i = 0; i < noArray.length; i++) {
			if (engArray[i] <= 70) {
				System.out.printf("%2d %6s %3d %4d %4d %4d %5.1f %3c %3d\n", 
						noArray[i], nameArray[i], korArray[i], engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
			}
		}
		
		/*
		 * 수학 점수 70점 이상인 학생들 여러 명 찾아서 여러 명 정보 출력
		 */
		System.out.println("- 수학 70점 이상 -");
		for (int i = 0; i < noArray.length; i++) {
			if (mathArray[i] >= 70) {
				System.out.printf("%2d %6s %3d %4d %4d %4d %5.1f %3c %3d\n", 
						noArray[i], nameArray[i], korArray[i], engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
			}
		}
		
		/*
		 * 학점이 D학점 이하인 학생 모두 찾아서 여러 명 정보 출력
		 */
		System.out.println("- D학점 이하 -");
		for (int i = 0; i < noArray.length; i++) {
			if (gradeArray[i] >= 'D') {
				System.out.printf("%2d %6s %3d %4d %4d %4d %5.1f %3c %3d\n", 
						noArray[i], nameArray[i], korArray[i], engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
			}
		}
		
		/*
		 * 이름이 KIM인 학생 모두 찾아서 여러 명 정보 출력
		 *  - 문자열인 경우는 비교 시 비교 연산자(==) 사용 금지
		 *  - 문자열.equals("문자열") -> return true/false
		 */
		System.out.println("- 이름이 KIM -");
		for (int i = 0; i < noArray.length; i++) {
			if (nameArray[i].equals("KIM")) {
				System.out.printf("%2d %6s %3d %4d %4d %4d %5.1f %3c %3d\n", 
						noArray[i], nameArray[i], korArray[i], engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
			}
		}
		
		System.out.printf("-------------- 학생 성적 출력 --------------\n");
		System.out.printf("%s %s %s %s %s %s %s %s %s \n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");
		System.out.printf("--------------------------------------------\n");
		
		for (int i = 0; i < noArray.length; i++) {
			System.out.printf("%2d %6s %3d %4d %4d %4d %5.1f %3c %3d\n", 
					noArray[i], nameArray[i], korArray[i], engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
		}
		
		/*
		 * 변수 내용 교환 (swap)
		 */
		int a = 1;
		int b = 2;
		System.out.println("a = " + a + ", b = " + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("a = " + a + ", b = " + b);

		/*
		 * 정렬
		 *   1. 오름차순 (ascending)
		 *     ex) 1, 2, 3, 4, 5, ...
		 *         a, b, c, d, e, ...
		 *         가, 나, 다, 라, ...
		 *   2. 내림차순 (descending)
		 *     ex) 5, 4, 3, 2, ...
		 *         z, y, x, ...
		 *         라, 다, 나, ...
		 */
		
		/*
		 * 학생 총점 오름차순 정렬 (앞에 있는 게 크면 앞/뒤 교체)
		 * i변수 -> 9회 정렬
		 */
		
		for (int i = 0; i < noArray.length - 1; i++) {
			for (int j = 0; j < noArray.length - 1 - i; j++) { // 첫 번째 정렬에선 9회, 두 번째에선 8회, ...
				if (totArray[j] > totArray[j + 1]) {
					// swap tot
					int tempTot = totArray[j];
					totArray[j] = totArray[j + 1];
					totArray[j + 1] = tempTot;
					
					// swap no
					int tempNo = noArray[j];
					noArray[j] = noArray[j + 1];
					noArray[j + 1] = tempNo;
					
					// swap name
					String tempName = nameArray[j];
					nameArray[j] = nameArray[j + 1];
					nameArray[j + 1] = tempName;
					
					// swap kor
					int tempKor = korArray[j];
					korArray[j] = korArray[j + 1];
					korArray[j + 1] = tempKor;
					
					// swap eng
					int tempEng = engArray[j];
					engArray[j] = engArray[j + 1];
					engArray[j + 1] = tempEng;
					
					// swap math
					int tempMath = mathArray[j];
					mathArray[j] = mathArray[j + 1];
					mathArray[j + 1] = tempMath;
	
					// swap avg
					double tempAvg = avgArray[j];
					avgArray[j] = avgArray[j + 1];
					avgArray[j + 1] = tempAvg;
					
					// swap grade
					char tempGrade = gradeArray[j];
					gradeArray[j] = gradeArray[j + 1];
					gradeArray[j + 1] = tempGrade;
					
					// swap rank
					int tempRank = rankArray[j];
					rankArray[j] = rankArray[j + 1];
					rankArray[j + 1] = tempRank;
				}
			}
		}
		
		System.out.printf("-------------- 학생 성적 출력 --------------\n");
		System.out.printf("%s %s %s %s %s %s %s %s %s \n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");
		System.out.printf("--------------------------------------------\n");
		
		for (int i = 0; i < noArray.length; i++) {
			System.out.printf("%2d %6s %3d %4d %4d %4d %5.1f %3c %3d\n", 
					noArray[i], nameArray[i], korArray[i], engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
		}
		
		
	}

}
