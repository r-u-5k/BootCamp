// 단항연산자
public class UnaryOperator {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		
		int ar = -a;
		int br = +b;
		System.out.println(a);
		System.out.println(ar);
		System.out.println(b);
		System.out.println(br);
		
		boolean myTurn = true;
		System.out.println(myTurn);
		myTurn = !myTurn;
		System.out.println(myTurn);
		
		int kor = 90;
		System.out.println("국어점수가 유효한지 여부: " + (kor >= 0 && kor <= 100));
		System.out.println("국어점수가 유효안한지 여부: " + !(kor >= 0 && kor <= 100));
		
		System.out.println("- [++i, --j] -");
		int i = 5;
		int j = 5;
		++i; // i = i + 1
		--j; // j = j - 1
		System.out.println(i);
		System.out.println(j);
		
		System.out.println("- [i++, j--] -");
		i = 5;
		j = 5;
		i++; // i = i + 1
		j--; // j = j - 1
		System.out.println(i);
		System.out.println(j);
		
		System.out.println("- [++i, j++] -");
		i = 5;
		j = 5;
		int ir = ++i; // i = i + 1 -> ir = i (증가한 후 출력)
		int jr = j++; // jr = j -> j = j + 1 (출력한 후 증가)
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		System.out.println("ir = " + ir);
		System.out.println("jr = " + jr);
				
	}

}
