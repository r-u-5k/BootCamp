
public class AccountManyMemberMain {

	public static void main(String[] args) {
		AccountManyMember accountManyMember = new AccountManyMember();
		System.out.println(accountManyMember);
		System.out.println(accountManyMember.acc0);
		System.out.println(accountManyMember.acc1);
		System.out.println(accountManyMember.acc2);
		System.out.println(accountManyMember.acc3);
		System.out.println(accountManyMember.acc4);
		
		Account account1 = new Account(1, "KIM", 3000, 2.3);
		Account account2 = new Account(2, "KIM", 7000, 3.4);
		Account account3 = new Account(3, "KIM", 6700, 1.8);
		Account account4 = new Account(4, "KIM", 2300, 9.0);
		Account account5 = new Account(5, "KIM", 9900, 10.3);
		
		accountManyMember.acc0 = account1;
		accountManyMember.acc1 = account2;
		accountManyMember.acc2 = account3;
		accountManyMember.acc3 = account4;
		accountManyMember.acc4 = account5;
		
		accountManyMember.acc0.headerPrint();
		accountManyMember.acc0.print();
		accountManyMember.acc1.print();
		accountManyMember.acc2.print();
		accountManyMember.acc3.print();
		accountManyMember.acc4.print();
		
	}

}
