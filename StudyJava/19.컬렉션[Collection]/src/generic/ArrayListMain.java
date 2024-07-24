package generic;

import java.util.ArrayList;

public class ArrayListMain {
	
	public static void main(String[] args) {
		Account acc1 = new Account(1111, "KIM", 56000, 0.9);
		Account acc2 = new Account(2222, "LEE", 58900, 0.5);
		Account acc3 = new Account(3333, "PARK", 78000, 0.4);
		Account acc4 = new Account(4444, "CHOI", 34000, 0.3);
		Account acc5 = new Account(5555, "SIM", 66000, 0.7);
		Account acc6 = new Account(6666, "KIM", 99000, 1.4);
		Account acc7 = new Account(7777, "KIM", 87600, 0.6);
		Account acc8 = new Account(8888, "KIM", 12300, 2.3);
		Account acc9 = new Account(9999, "MIN", 41200, 4.1);
		
		ArrayList<Account> accountList = new ArrayList<Account>();
		int size = accountList.size();
		System.out.println("size: " + size);
		
		System.out.println("1. add(element) [맨 마지막 index에 element 추가]");
		accountList.add(acc1);
		accountList.add(acc2);
		accountList.add(acc3);
		accountList.add(acc4);
		System.out.println("size: " + accountList.size());
		System.out.println(accountList.toString()); // Account에서 재정의됨
		accountList.add(acc5);
		accountList.add(acc6);
		accountList.add(acc7);
		accountList.add(acc8);
		accountList.add(acc9);
		System.out.println("size: " + accountList.size());
		
		System.out.println("2. add(index, element) [지정된 index에 element 추가]");
		accountList.add(1, new Account(1112, "NEW", 30000, 3.3));
		System.out.println(accountList.toString()); // Account에서 재정의됨
		System.out.println("size: " + accountList.size());

		System.out.println("3. set(index, element) [지정된 index에 element 저장]");
		accountList.set(accountList.size() - 1, new Account(9900, "LAST", 65400, 5.5));
		System.out.println(accountList.toString());
		
		System.out.println("4. get(index, element) [지정된 index의 element 참조변수 반환]");
		Account getAccount = accountList.get(accountList.size() - 1);
		System.out.println(getAccount.toString());

		System.out.println("5. remove(index) [지정된 index의 element 삭제 후 삭제한 element 참조변수 반환]");
		Account removeAccount = accountList.remove(accountList.indexOf(acc5));
		System.out.println(removeAccount);
		System.out.println("size: " + accountList.size());
		System.out.println(accountList);
		
		System.out.println("- 1. 계좌 전체 출력 -");
		Account.headerPrint();
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = accountList.get(i);
			tempAccount.print();
		}
		
		System.out.println("- 2. 계좌번호 6666번 계좌 한 개 찾기 -");
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = accountList.get(i);
			if (tempAccount.getNo() == 6666) {
				tempAccount.print();
				break;
			}
		}
		
		System.out.println("- 3. 계좌주 이름 KIM인 계좌 여러 개 찾기 -");
		for (Account tempAccount : accountList) {
			if (tempAccount.getOwner().equals("KIM")) {
				tempAccount.print();
			}
		}
		
		System.out.println("- 4. 계좌번호 6666번 계좌 한 개 삭제 -");
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = accountList.get(i);
			if (tempAccount.getNo() == 6666) {
				accountList.remove(i);
				break;
			}
		} // 계좌 전체 출력
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = accountList.get(i);
			tempAccount.print();
		}		
		System.out.println("- 5. 계좌주 이름 KIM인 계좌 여러 개 삭제 -");
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = accountList.get(i);
			if (tempAccount.getOwner().equals("KIM")) {
				accountList.remove(i);
				i--; // 리스트에서 삭제된 객체보다 인덱스가 큰 객체들의 인덱스가 하나씩 줄어들기 때문에 여러 개를 찾을 경우 인덱스를 재조정하여 for문을 돌려야 함
			}
		} // 계좌 전체 출력
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = accountList.get(i);
			tempAccount.print();
		}		
		
		
		
		
	}
}
