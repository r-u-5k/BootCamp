
public class ReferenceTypeArrayMain {

	public static void main(String[] args) {
		
		Account[] accountArray = new Account[5];
		
		Account account1 = new Account(1, "KIM", 30000, 3.0);
		accountArray[0] = account1;
		accountArray[1] = new Account(2, "LEE", 5600, 3.8);
		accountArray[2] = new Account(3, "MIN", 7800, 7.8);
		accountArray[3] = new Account(4, "JANG", 8900, 8.3);
		accountArray[4] = new Account(5, "OH", 9900, 4.6);
		
		System.out.println("- for loop -");
		accountArray[0].headerPrint();
		for (int i = 0; i < accountArray.length; i++) {
			Account account = accountArray[i];
			account.print();
		}
		
		System.out.println("- enhanced for loop -");
		accountArray[0].headerPrint();
		for (Account account : accountArray) {
			account.print();
		}
		
	}

}
