package generic;

import java.util.HashSet;

public class HashSetStringWrapperMain {

	public static void main(String[] args) {
		System.out.println("*** String ***");
		HashSet<String> nameSet = new HashSet<String>(); // 같은 이름은 안 들어감 -> 이런 경우엔 쓰면 안 됨
		System.out.println("set size: " + nameSet.size());
		System.out.println("- 1. add -");
		nameSet.add("KIM");
		nameSet.add("JIM");
		nameSet.add("GIM");
		nameSet.add("SIM");
		System.out.println("set size: " + nameSet.size());
		System.out.println(nameSet);
		boolean isAdd = nameSet.add("KIM");
		System.out.println("추가여부: " + isAdd);
		System.out.println("set size: " + nameSet.size());
		System.out.println(nameSet);

		System.out.println("*** Wrapper(Integer) ***");
		HashSet<Integer> lottoSet = new HashSet<Integer>();
		
		while (lottoSet.size() < 6) {
			isAdd = lottoSet.add((int) (Math.random() * 45 + 1));
		}
		System.out.println(lottoSet);
		
	}

}
