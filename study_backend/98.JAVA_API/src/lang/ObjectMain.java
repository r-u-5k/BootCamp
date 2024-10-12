package lang;

public class ObjectMain {

	public static void main(String[] args) {
		/*
		 << Object >>
		  	Object 클래스는 클래스 계층 루트입니다.
		  	모든 클래스는 슈퍼 클래스로서 Object를 가집니다. 
		  	배열을 포함한 모든 객체는 이 클래스의 메서드를 포함합니다.
		 
		 	Class Object is the root of the class hierarchy.
		 	Every class has Object as a superclass. 
		 	All objects, including arrays, implement the methods of this class.
		 */
		Object o1 = new Object();
		Object o2 = new Object();
		Object o3 = o1;
		
		String str1 = o1.toString();
		System.out.println(str1);
		String str2 = o2.toString();
		System.out.println(str2);
		
		/*
		 public boolean equals(Object obj);
			- Indicates whether some other object is "equal to" this one.
		    - 주소가 동일한지 비교
			 Parameters:
				obj - the reference object with which to compare.	
			 
			 Returns:
				true if this object is the same as the obj argument; false otherwise.
		 */
		if (o1.equals(o2)) { // if (o1 == o2)
			System.out.println("o1과 o2의 주소값이 동일함");
		} else {
			System.out.println("o1과 o2의 주소값이 다름");
		}
		
		if (o1.equals(o3)) {
			System.out.println("o1과 o3의 주소값이 동일함");
		} else {
			System.out.println("o1과 o3의 주소값이 다름");
		}
		
		
	}

}
