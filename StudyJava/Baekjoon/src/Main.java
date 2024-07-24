import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			String s = sc.nextLine();
			StringTokenizer st = new StringTokenizer(s, " ");
			List<String> list = new ArrayList<>();
			while (!st.hasMoreTokens()) {
				list.add(st.nextToken());
			}
			for (int j = st.nextToken().length() - 1; j >= 0 ; j--) {
				System.out.println(st.nextToken().charAt(j));
			}
			
		}

	}
}
