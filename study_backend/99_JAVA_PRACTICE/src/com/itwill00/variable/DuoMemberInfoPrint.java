package com.itwill00.variable;
	
public class DuoMemberInfoPrint{
		public static void main(String[] args) {
			
			int memberNum;
			String name;
			String personalNum;
			char gender;
			int marriageNum;
			boolean smoking;
			double height;
			String grade;
			String apperance;
			
			memberNum = 202011024;
			name = "장유진";
			personalNum = "000824-3000000";
			gender = '남';
			marriageNum = 0;
			smoking = false;
			height = 181.6;
			grade = "B+";
			apperance = "하";
			
			
			System.out.println("*************************");
			
			System.out.println("회원번호 : " + memberNum);
			System.out.println("이    름 : " + name);
			System.out.println("주민번호 : " + personalNum);
			System.out.println("성    별 : " + gender);
			System.out.println("결혼횟수 : " + marriageNum);
			System.out.println("흡연여부 : " + smoking);
			System.out.println("키       : " + height);
			System.out.println("학    점 : " + grade);
			System.out.println("용    모 : " + apperance);
			
			System.out.println("*************************");
		
		}
	}