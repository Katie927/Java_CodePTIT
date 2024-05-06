package concutobu;

import java.util.Scanner;

public class J01014 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int test = in.nextInt();
		while(test --> 0){
			long n = in.nextLong();
			for(long i=2 ; i*i<=n ; i++) {
				while(n % i == 0) {
					n /= i;
				}
			}
			System.out.println(n);
			
		}
		in.close();
	}
}