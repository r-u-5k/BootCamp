
public class AccountEncapsulationMain {

	public static void main(String[] args) {
		Account account1 = new Account();
		account1.setAccountData(1111, "KIM", 89000, 3.5);
		
		/*
		 * account1 8000원 입금
		 */
		account1.deposit(8000);
		account1.headerPrint();
		account1.print();
		
		/*
		 * account1 이율 1% 증가
		 */
		account1.setIyul(account1.getIyul() + 1.0);
		account1.print();
		
		/*
		 * account1 잔고 얻기
		 */
		int account1Balance = account1.getBalance();
		System.out.println("account1 잔고: " + account1Balance);
		
		System.out.println("-----------------------------");
		System.out.println();
		
		/*
		 * 은행 계좌 전체 생성 
		 */
		Account acc1 = new Account();
		Account acc2 = new Account();
		Account acc3 = new Account();

		/*
		 * 은행 계좌 데이터 초기화
		 */
		acc1.setAccountData(100, "KIM", 89000, 3.5);
		acc2.setAccountData(200, "JANG", 45000, 2.6);
		acc3.setAccountData(300, "LEE", 12000, 1.2);
		
		/*
		 * 모든 계좌 잔고 50원씩 증가
		 */
		acc1.deposit(50);
		acc2.deposit(50);
		acc3.deposit(50);
		
		/*
		 * 모든 계좌 출력
		 */
		acc1.headerPrint();
		acc1.print();
		acc2.print();
		acc3.print();
		
	} 

}
