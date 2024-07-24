package generic;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapMain {

	public static void main(String[] args) {
		HashMap<String, Car> carMap = new HashMap<String, Car>();
		System.out.println("map size: " + carMap.size());
		System.out.println(carMap);
		System.out.println("- 1. put -");
		Car car1 = new Car("1111", 12);
		carMap.put(car1.getNo(), car1);
		carMap.put("2222", new Car("2222", 13));
		carMap.put("3333", new Car("3333", 14));
		carMap.put("4444", new Car("4444", 15));
		carMap.put("5555", new Car("5555", 16));
		System.out.println("map size: " + carMap.size());
		System.out.println(carMap);
		/*
		 * 키값은 중복 허용하지 않음
		 */
		carMap.put("3333", new Car("삼삼삼삼", 20)); // 키값에 해당하는 밸류가 바뀜
		System.out.println("map size: " + carMap.size());
		System.out.println(carMap);
		
		System.out.println("- 2. get(key) -");
		Car getCar = carMap.get("3333");
		getCar.print();
		
		System.out.println("- 3. remove(key) -");
		Car removeCar = carMap.remove("3333");
		removeCar.print();
		System.out.println("map size: " + carMap.size());
		System.out.println(carMap);
		
		System.out.println("전체차량출력[entry set]");
		Car.headerPrint();
		Set<Entry<String, Car>> carEntrySet = carMap.entrySet();
		for (Entry<String, Car> entry : carEntrySet) {
			String key = entry.getKey();
			Car car = entry.getValue();
			System.out.println(key);
			car.print();
		}
		
		System.out.println("전체차량출력[key set]");
		Car.headerPrint();
		Set<String> keySet = carMap.keySet();
		for (String key : keySet) {
			Car car = carMap.get(key);
			car.print();
		}
		
		
	}
		
}