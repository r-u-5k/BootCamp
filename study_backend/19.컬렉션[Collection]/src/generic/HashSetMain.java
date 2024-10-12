package generic;

import java.util.HashSet;

public class HashSetMain {

	public static void main(String[] args) {
		Car car1 = new Car("1111", 1);
		Car car2 = new Car("2222", 1);
		Car car3 = new Car("3333", 1);
		Car car4 = new Car("4444", 1);
		Car car5 = new Car("5555", 1);
		
		HashSet<Car> carSet = new HashSet<>();
		System.out.println("set size: " + carSet.size());
		
		System.out.println("- 1. add -");
		carSet.add(car1);
		carSet.add(car2);
		carSet.add(car3);
		carSet.add(car4);
		carSet.add(car5);
		System.out.println("set size: " + carSet.size());
		System.out.println(carSet);
		
		System.out.println("- 2. add[중복] - ");
		/*
		 * Element의 hashCode 메서드와 equals 메서드를 호출해서 중복을 체크함
		 */
		System.out.println("equals -> " + car3.equals(new Car("3333", 11)));
		/*
		 * Set 객체는 hashCode값이 동일하면 equals 메서드를 호출하여 동일성 여부 판단
		 */
		boolean isAdd = carSet.add(new Car("3333", 11));
		System.out.println("추가여부: " + isAdd);
		System.out.println("set size: " + carSet.size());
		System.out.println(carSet);
		
		System.out.println("- 3. remove(element) -");
		boolean isRemove = carSet.remove(new Car("3333", 12));
		System.out.println("삭제여부: " + isRemove);
		System.out.println("set size: " + carSet.size());
		System.out.println(carSet);
		
		System.out.println("- 전체출력 -");
		for (Car car : carSet) {
			car.print();
		}
		
		
	}

}
