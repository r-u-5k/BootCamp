
public class ReferenceVariableMain {

	public static void main(String[] args) {
		System.out.println("- Reference variable assign(대입, 할당) -");
		Account account1 = new Account(1325, "김미진", 56000, 3.5);
		Account account2 = account1;
		Account account3 = new Account(9090, "김민섭", 89000, 5.9);
		
		System.out.println(account1);
		System.out.println(account2);
		System.out.println(account3);
		
		account1.print();
		account2.print();
		
		account1.setOwner("김마진");
		
		account1.print();
		account2.print();
		
		
		
		System.out.println("- Reference variable compare(==, !=) -");
		
		if (account1 == account2) { // 주소값이 동일한지 아닌지 비교 가능
			System.out.println(account1 + " == " + account2 + " -> 주소값이 동일하다");
		}
		
		if (account1 != account3) {
			System.out.println(account1 + " != " + account3 + " -> 주소값이 동일하지 않다");
		}
		
//		if (account1 > account3) -> 주소값의 크고 작음은 비교할 수 없음
		
		
		
		System.out.println("- Reference Variable swap[주소값 교환] -");
		Account a1 = new Account(1000, "일천님", 30000, 3.0);
		Account a2 = new Account(2000, "이천님", 80000, 8.8);
		
		System.out.println("- swap 전 -");
		
		a1.print();
		a2.print();
		
		System.out.println(a1);
		System.out.println(a2);
		
		Account tempAccount = a1;
		a1 = a2;
		a2 = tempAccount;
		
		System.out.println("- swap 후 -");
		a1.print();
		a2.print();
		
		System.out.println(a1);
		System.out.println(a2);
		
		
		
		System.out.println("- Reference Variable null value -");
		
		/*
		 * null: 객체 주소 리터럴 (상수의 성격을 가짐)
		 *   - 객체 주소의 초기화 용도로 사용
		 *   - null주소를 사용해서 멤버에 접근 시도 시에는 
		 *   NullPointerException 예외가 발생하고 프로그램이 종료됨.
		 */
		Account account = null; // 널값으로 초기화
		if (account == null) {
			account = new Account(9000, "구공이", 999000, 9.9);
		}
		
		account.print();
	}

}
