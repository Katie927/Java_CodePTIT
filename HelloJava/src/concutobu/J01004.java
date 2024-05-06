package concutobu;

import java.util.Scanner;

public class J01004 {
	public static void main(String[] args) {
//		int[] _Prime = new int[1000000007];
		Scanner in = new Scanner(System.in);
		int test = in.nextInt();
		while(test --> 0) {
			long n = in.nextLong();
			double k = Math.sqrt(n);
			int check  = 0;
			for(int i=2 ; i<k ; i++) {
				if(n%i == 0) {
					check = 1;
					break;
				}
			}
			if(check == 0)	System.out.println("YES");
			else			System.out.println("NO");
		}
	}
}
