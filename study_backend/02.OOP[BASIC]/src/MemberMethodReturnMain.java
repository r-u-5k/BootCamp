
public class MemberMethodReturnMain {

	public static void main(String[] args) {
		MemberMethodReturn memberMethodReturn = new MemberMethodReturn();
		int returnData1 = memberMethodReturn.method1();
		System.out.println("main block -> " + returnData1);
		
		boolean returnData2 = memberMethodReturn.method2();
		System.out.println("main block -> " + returnData2);
		
		if (memberMethodReturn.method2()) {
			System.out.println("결혼했습니다");
		} else {
			System.out.println("결혼안했습니다");
		}
		System.out.println("main block -> add() 반환 데이터: " + 
							memberMethodReturn.add(1, 2));
		
		String name = "장유진";
		String returnMessage1 = memberMethodReturn.hello(name);
		System.out.println("main block -> returnMessage1: " + returnMessage1);
		System.out.println("main block -> returnMessage2: " + 
							memberMethodReturn.hello("김경호"));
		
		System.out.println("********* getter 메서드 호출 *********");
		System.out.println("returnMemberField1: " + memberMethodReturn.getMemberField1());
		System.out.println("returnMemberField2: " + memberMethodReturn.getMemberField2());
		System.out.println("returnMemberField3: " + memberMethodReturn.getMemberField3());
		
		System.out.println("********* setter 메서드 호출 *********");
		memberMethodReturn.setMemberField1(100);
		memberMethodReturn.setMemberField2(200);
		memberMethodReturn.setMemberField3(300);
		
		System.out.println("********* getter 메서드 호출 *********");
		System.out.println("returnMemberField1: " + memberMethodReturn.getMemberField1());
		System.out.println("returnMemberField2: " + memberMethodReturn.getMemberField2());
		System.out.println("returnMemberField3: " + memberMethodReturn.getMemberField3());

	}
	

}
