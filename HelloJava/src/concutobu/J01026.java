package concutobu;

import java.util.Scanner;

public class J01026 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int test = in.nextInt();
		while(test --> 0) {
			long n = in.nextInt();
			double k = Math.sqrt(n);
			long l = (long)k;
			if(k == l)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		in.close();
	}
}
