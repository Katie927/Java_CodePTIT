package concutobu;

import java.util.Scanner;
import java.math.BigInteger;

public class J03039 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
        while (t-- > 0) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            BigInteger c = a.divide(b);
            BigInteger d = b.divide(a);
            if (a.compareTo(b.multiply(c)) == 0 || b.compareTo(a.multiply(d)) == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
	}
}
