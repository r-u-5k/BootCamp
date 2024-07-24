
public class ReferenceTypeArrayAccountMain {

	public static void main(String[] args) {
		System.out.println("- {}를 이용한 배열 객체 생성 & 초기화 -");
		Account acc1 = new Account(1111, "LEE", 56000, 2.8);
		
		Account[] accounts = {
				acc1,
				new Account(2222, "KIM", 99000, 3.5),
				new Account(3333, "PARK", 96500, 6.9),
				new Account(4444, "LEE", 34200, 2.9),
				new Account(5555, "CHOI", 78300, 4.8),
				new Account(6666, "SIM", 61200, 9.2),
				new Account(7777, "KIM", 56000, 5.8),
				new Account(8888, "MIN", 23400, 2.2),
				new Account(9999, "JANG", 15600, 8.9)
		};
		
		System.out.println("1. 은행 총 계좌 수: " + accounts.length);
		System.out.println("2. 은행 계좌 전체 출력");
		accounts[0].headerPrint();
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}
		System.out.println("3. 은행 계좌 총 잔고");
		int totBalance = 0;
		
		for (int i = 0; i < accounts.length; i++) {
			totBalance += accounts[i].getBalance();
		}
		
		System.out.println(">> " + totBalance);
		System.out.println("4.은행 계좌들 중에서 계좌번호 3333번 계좌 한 개 찾아서 출력 (계좌번호는 중복되지 않는다)");
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getNo() == 3333) {
				accounts[i].print();
				break;
			} 
		}
		
		System.out.println("5.은행 계좌들 중에서 잔고 50000원 이상인 VIP 계좌 여러 개 찾아서 출력");
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getBalance() >= 50000) {
				accounts[i].print();
			}
		}
		
		System.out.println("6.은행 계좌들 중에서 이율 5.0 이상인 계좌 여러 개 찾아서 출력");
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getIyul() >= 5.0) {
				accounts[i].print();
			}
		}
		
		System.out.println("7.은행 계좌들중에서 이름이 KIM인 계좌 여러개 찾아서 출력");
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getOwner().equals("KIM")) {
				accounts[i].print();
			}
		}
		
		System.out.println("8. 6666번 계좌 3000원 입금");
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getNo() == 6666) {
				accounts[i].print();
				accounts[i].deposit(3000);
				accounts[i].print();
			}
		}
		
		System.out.println("9. 9999번 계좌 3000원 출금");
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getNo() == 9999) {
				accounts[i].withdraw(3000);
			}
		}
		
		System.out.println("10.잔고 순으로 오름(내림)차순 정렬"); // 오름차순 -> 크면 뒤로 가, 내림차순 -> 작으면 뒤로 가
		
		System.out.println("- 정렬 전 -");
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}
		
		// 오름차순 1회 정렬 (크면 뒤로 가)
		for (int j = 0; j < accounts.length - 1; j++) { // length가 9면 index는 8까지밖에 없으므로 -1 해줘야 함.
			if (accounts[j].getBalance() > accounts[j + 1].getBalance()) {
				// 주소값 교환
				Account tempAccount = accounts[j]; // 앞에 있는 걸 임시에 저장
				accounts[j] = accounts[j + 1]; // 뒤에 걸 앞으로
				accounts[j + 1] = tempAccount; // 임시에 있는 걸 뒤로
				
			}
		}
		
		// 오름차순 전체 정렬 (총 8회 실행)
		for (int i = 0; i < accounts.length - 1; i++) {
			boolean isSwap = false;
			for (int j = 0; j < accounts.length - 1 - i; j++) {
				if (accounts[j].getBalance() > accounts[j + 1].getBalance()) {
					// 주소값 교환
					Account tempAccount = accounts[j];
					accounts[j] = accounts[j + 1];
					accounts[j + 1] = tempAccount;
					isSwap = true;
				}
			}
			if (isSwap == false) {
				break; // swap이 한 번이라도 일어나지 않으면 그 후엔 더 반복할 필요가 없으므로 break
			}
		}
		
		System.out.println("- 오름차순 정렬 후 -");
		for (int i = 0; i < accounts.length - 1; i++) {
			accounts[i].print();
		}
		
		// 내림차순 정렬 (작으면 뒤로 가)
		for (int i = 0; i < accounts.length - 1; i++) {
			for (int j = 0; j < accounts.length - 1 - i; j++) {
				if (accounts[j].getBalance() < accounts[j + 1].getBalance()) {
					Account tempAccount = accounts[j];
					accounts[j] = accounts[j + 1];
					accounts[j + 1] = tempAccount;
				}
			}
		}
		
		System.out.println("- 내림차순 정렬 후 -");
		for (int i = 0; i < accounts.length - 1; i++) {
			accounts[i].print();
		}
		
		
		System.out.println("11.5555 계좌 한 개 이율을 9.9로 변경");
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getNo() == 5555) {
				accounts[i].setIyul(9.9);
				accounts[i].print();
				break;
			}
		}
		
		
		System.out.println("12.VIP 계좌(잔고 50000원 이상) 여러 개 잔고 50원 증가");
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getBalance() >= 50000) {
				accounts[i].deposit(50);
				accounts[i].print();
			}
		}
	
	}

}
