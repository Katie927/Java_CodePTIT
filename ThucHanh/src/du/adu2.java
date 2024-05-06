package du;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class adu2 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("DAYSO.in"));
		int n = sc.nextInt();
		BigInteger a = sc.nextBigInteger();
		BigInteger min_a = a;
		BigInteger max_a = a;
		BigInteger sun = a;
		for(int i = 1 ; i<n ; i++) {
			BigInteger x = sc.nextBigInteger();
			min_a = min_a.min(x);
			max_a = max_a.max(x);
			sun = sun.add(x);
		}
		System.out.println(min_a);
		System.out.println(max_a);
		System.out.println(sun);
		sc.close();
	}
}
