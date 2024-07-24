import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String a = br.readLine();
        String[] arr1 = a.split(" ");
        int S = Integer.parseInt(arr1[0]);
        int M = Integer.parseInt(arr1[1]);
        int L = Integer.parseInt(arr1[2]);
        int XL = Integer.parseInt(arr1[3]);
        int XXL = Integer.parseInt(arr1[4]);
        int XXXL = Integer.parseInt(arr1[5]);

        String b = br.readLine();
        String[] arr2 = b.split(" ");
        int T = Integer.parseInt(arr2[0]);
        int P = Integer.parseInt(arr2[1]);

        int tshirt = (int) Math.ceil((double) S / T) + (int) Math.ceil((double) M / T) + (int) Math.ceil((double) L / T) + (int) Math.ceil((double) XL / T) + (int) Math.ceil((double) XXL / T) + (int) Math.ceil((double) XXXL / T);
        int penSet = (int) (Math.floor(n / P));
        int penOne = n - penSet * P;

        System.out.println(tshirt);
        System.out.println(penSet + " " + penOne);
    }

}
