package nongeneric;

public class MyArrayListMain {

	public static void main(String[] args) {
			Account acc1 = new Account(1111, "KIM", 56000, 0.9);
			Account acc2 = new Account(2222, "LEE", 58900, 0.5);
			Account acc3 = new Account(3333, "PARK", 78000, 0.4);
			Account acc4 = new Account(4444, "CHOI", 34000, 0.3);
			Account acc5 = new Account(5555, "SIM", 66000, 0.7);
			Account acc6 = new Account(6666, "HONG", 99000, 1.4);
			Account acc7 = new Account(7777, "KIM", 87600, 0.6);
			Account acc8 = new Account(8888, "SOO", 12300, 2.3);
			Account acc9 = new Account(9999, "MIN", 41200, 4.1);
			
			MyArrayList accountArrayList = new MyArrayList();
			System.out.println("size: " + accountArrayList.size());
			accountArrayList.add(acc1);
			accountArrayList.add(acc2);
			accountArrayList.add(acc3);
			accountArrayList.add(acc4);
			accountArrayList.add(acc5);
			accountArrayList.add(acc6);
			accountArrayList.add(acc7);
			accountArrayList.add(acc8);
			accountArrayList.add(acc9);
			System.out.println("size: " + accountArrayList.size());
			
			Account getAccount = (Account) accountArrayList.get(0);
			System.out.println(getAccount);
			for (int i = 0; i < accountArrayList.size(); i++) {
				Account tempAccount = (Account) accountArrayList.get(i);
				tempAccount.print();
			}
			
	}

}
