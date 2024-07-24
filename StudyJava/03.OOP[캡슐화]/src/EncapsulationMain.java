
public class EncapsulationMain {

	public static void main(String[] args) {
		Encapsulation encapsulation = new Encapsulation();
		
		/*
		 * encapsulation 객체의 멤버 필드에 데이터 대입
		 * << The field Encapsulation.memberField1 is not visible >>
		 */
		/*
		 * encapsulation.memberField1 = 123;
		 * encapsulation.memberField2 = true;
		 * encapsulation.memberField3 = '김';
		 * encapsulation.memberField4 = 1.3142;
		 */
		encapsulation.setMemberField1(123);
		encapsulation.setMemberField2(true);
		encapsulation.setMemberField3('김');
		encapsulation.setMemberField4(1.3142);
		
		/*
		 * encapsulation 객체의 멤버 필드 내용 출력
		 */
		
		encapsulation.getMemberField1();
		encapsulation.isMemberField2(); // boolean의 경우 get 대신 is가 붙음
		encapsulation.getMemberField3();
		encapsulation.getMemberField4();
	}

}
