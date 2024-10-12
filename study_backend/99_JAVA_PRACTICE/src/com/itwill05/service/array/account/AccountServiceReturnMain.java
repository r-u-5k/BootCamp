package com.itwill05.service.array.account;

public class AccountServiceReturnMain {
	
	public static void main(String[] args) {
		AccountServiceReturn accountServiceReturn = new AccountServiceReturn();
		
		System.out.println("0. AccountServiceReturn객체야 은행계좌 객체인자로 줄게 추가해줘");
		accountServiceReturn.addAccount(1112, "JAN", 10000, 1.0);
		accountServiceReturn.addAccount(new Account(1113, "HON", 89890, 8.9));
		
		System.out.println("1. AccountServiceReturn객체야 은행계좌 총 계좌 수를 반환해줘");
		int totAccountNumber = accountServiceReturn.getTotAccountNumber();
		System.out.println(">> 은행 총 계좌 수: " + totAccountNumber);
		
		System.out.println("2. AccountServiceReturn객체야 은행계좌들 전체 출력해줘");
		accountServiceReturn.print();
		
		System.out.println("3. AccountServiceReturn객체야 은행계좌들 총잔고를 반환해줘");
		int totBalance = accountServiceReturn.getAccountTotBalance();
		System.out.println(">> 은행총계좌잔고:" + totBalance);
		
		System.out.println("4. AccountServiceReturn객체야 계좌번호를 인자로 넣어줄게 계좌 한 개 참조변수를 반환해줘");
		Account findAccount = accountServiceReturn.findByNo(1111);
		findAccount.print();
		findAccount = accountServiceReturn.findByNo(2222);
		findAccount.print();
		
		System.out.println("5. AccountServiceReturn객체야 계좌잔고를 인자로 줄게 잔고 이상인 계좌 객체 배열 참조변수 반환해줘");
		Account[] findAccount1 = accountServiceReturn.findByBalance(80000);
		for (Account account : findAccount1) {
			account.print();
		}
		
		System.out.println("6. AccountServiceReturn객체야 계좌이율(5.0)을 인자로 줄게 이율 이상인 계좌 객체 배열 참조변수 반환해줘");
		Account[] findAccount2 = accountServiceReturn.findByIyul(5.0);
		for (Account account : findAccount2) {
			account.print();
		}
		
		System.out.println("7. AccountServiceReturn객체야 계좌주이름(AIM)을 인자로 줄게 계좌 객체 배열 참조변수 반환해줘");
		Account[] accounts = accountServiceReturn.findByName("AIM");
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}
		
		System.out.println("8. AccountServiceReturn객체야 계좌번호(6666번)와 입금할 돈(4000원)줄게 입금해줘");
		Account ipGumAccount = accountServiceReturn.ipGum(6666, 4000);
		ipGumAccount.print();
		
		System.out.println("9. AccountServiceReturn객체야 계좌번호(1111번)와 출금할 돈(500원)줄게 출금해줘");
		Account chulGumAccount = accountServiceReturn.chulGum(1111, 500);
		chulGumAccount.print();
		
		/*
		정렬기준(standard) --> 1:번호,2:이름,3:잔고,4:이율 
	    정렬방법(order)    --> 1:오름차순,2:내림차순
		 */
		System.out.println("10. AccountServiceReturn객체야 계좌를 잔고 순으로 오름차순 정렬해줘");
		accountServiceReturn.sort(3, 1);
		accountServiceReturn.print();
		
		System.out.println("11. AccountServiceReturn객체야 계좌를 잔고 순으로 내림차순 정렬해줘");
		accountServiceReturn.sort(3, 2);
		accountServiceReturn.print();
		
		System.out.println("12. AccountServiceReturn야 계좌 객체 줄게 이름, 잔고, 이율 수정(update)해줘");
		Account findAccount3 = accountServiceReturn.findByNo(7777);
		accountServiceReturn.updateAccount(findAccount3);
		accountServiceReturn.print();
		
		System.out.println("13. AccountServiceReturn야 계좌 데이터 줄게 이름, 잔고, 이율 수정(update)해줘");
		Account findAccount4 = accountServiceReturn.findByNo(1113);
		findAccount4.setAccountData(findAccount4.getNo(), "CAN", 50000, 5.5);
		accountServiceReturn.print();
		
		System.out.println("14. AccountServiceReturn객체야 계좌번호 줄게 계좌 삭제한 후 삭제한 계좌 객체 반환해줘[OPTION]");
		accountServiceReturn.deleteByNo(1112);
		accountServiceReturn.print();
	}
}