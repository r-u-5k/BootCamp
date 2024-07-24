package generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

public class CollectionIterationMain {

	public static void main(String[] args) {
		Account acc1 = new Account(1111, "BING", 33000, 0.3);
		Account acc2 = new Account(2222, "KING", 12000, 1.2);
		Account acc3 = new Account(3333, "KING", 89000, 5.6);
		Account acc4 = new Account(4444, "HING", 45000, 4.8);
		Account acc5 = new Account(5555, "PING", 99000, 2.9);
		ArrayList<Account> accountList = new ArrayList<Account>();
		accountList.add(acc1);
		accountList.add(acc2);
		accountList.add(acc3);
		accountList.add(acc4);
		accountList.add(acc5);
		System.out.println("%%%%%%%%%%%%%%%% << List iteration >> %%%%%%%%%%%%%%%");
		Iterator<Account> accountIterator = accountList.iterator();
//		accountIterator.next();
//		accountIterator.next();
//		accountIterator.next();
//		accountIterator.next();
//		accountIterator.next();
//		accountIterator.next(); -> 6번째: NoSuchElementException 발생
		Account.headerPrint();
		while (accountIterator.hasNext()) {
			Account tempAccount = accountIterator.next();
			tempAccount.print();
		}

		Car car1 = new Car("1111", 1);
		Car car2 = new Car("2222", 2);
		Car car3 = new Car("3333", 3);
		Car car4 = new Car("4444", 4);
		Car car5 = new Car("5555", 5);
		HashSet<Car> carSet = new HashSet<Car>();
		carSet.add(car1);
		carSet.add(car2);
		carSet.add(car3);
		carSet.add(car4);
		carSet.add(car5);
		Iterator<Car> carIterator = carSet.iterator();
		Car.headerPrint();
		while (carIterator.hasNext()) {
			Car tempCar = carIterator.next();
			tempCar.print();
		}
		System.out.println("%%%%%%%%%%%%%%%% << Set iteration >> %%%%%%%%%%%%%%%");

		HashMap<String, Car> carMap = new HashMap<String, Car>();
		carMap.put("1111", new Car("1111", 12));
		carMap.put("2222", new Car("2222", 13));
		carMap.put("3333", new Car("3333", 15));
		carMap.put("4444", new Car("4444", 16));
		carMap.put("5555", new Car("5555", 17));

		System.out.println("%%%%%%%%%%%%%%%% << Map(Set) iteration >> %%%%%%%%%%%%%%%");
		System.out.println("--------- Entry set ----------");
		carMap.entrySet().iterator();
		Iterator<Entry<String, Car>> entryIterator = carMap.entrySet().iterator();
		while (entryIterator.hasNext()) {
			Entry<String, Car> tempEntry = entryIterator.next();
			String tempKey = tempEntry.getKey();
			System.out.println(tempKey);
			Car tempCar = tempEntry.getValue();
			System.out.println(tempCar);
		}
		
		System.out.println("--------- key set ----------");
		Iterator<String> keyIterator = carMap.keySet().iterator();
		while (keyIterator.hasNext()) {
			String tempKey = keyIterator.next();
			System.out.println(tempKey);
			Car tempCar = carMap.get(tempKey);
			tempCar.print();
		}
		
	}

}
