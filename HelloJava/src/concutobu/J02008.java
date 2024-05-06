package concutobu;

import java.math.BigInteger;
import java.util.Scanner;

public class J02008 {
	public static long _GCD(long a, long b) {
		BigInteger m = BigInteger.valueOf(a);
		BigInteger n = BigInteger.valueOf(b);
		BigInteger gcd = m.gcd(n);
		return gcd.longValue();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test --> 0) {
			long n = sc.nextLong();
			long s = 1;
			for(int i=1 ; i<=n ; i++) {
				s = i*s/_GCD(i,s);
			}
			System.out.println(s);
		}
	}
}
