
public class IfNested {

	public static void main(String[] args) {
		/*
		 * 학점 계산 -> A(90~100), B(80~89), C(70~79), D(60~69), F(0~59)
		 */
		int kor = 78;
		System.out.println("-------nested if---------");
		char hakjum='F';
		if(kor>=90 && kor<=100) {
			hakjum='A';
		}else {
			/**** B,C,D,F *****/
			if(kor>=80 && kor< 90) {
				hakjum='B';
			}else {
				/**** C,D,F *****/
				if(kor>=70 && kor< 80) {
					hakjum='C';
				}else {
					/*** D,F ***/
					if(kor>=60 && kor< 70) {
						hakjum='D';
					}else {
						hakjum='F';
					}
				}
			}
			
		}
		System.out.printf("1.학점은 %c 입니다\n",hakjum);
		
		int kor1 = 85;
		char grade = 'F';
		System.out.println("- else if -");
		
		if (kor1 >= 90 && kor1 <= 100) {
			grade = 'A';
		} else if (kor1 >= 80) {
			grade = 'B';
		} else if (kor1 >= 70) {
			grade = 'C';
		} else if (kor1 >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.printf("2. 학점은 %c입니다.\n", grade);
		
	}

}
