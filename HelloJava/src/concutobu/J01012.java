package concutobu;

import java.util.Scanner;

public class J01012 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int test = in.nextInt();
		while(test --> 0) {
			long n = in.nextInt();
			long ans = 0;
			ans = 0;
			for(int i=1 ; i*i <= n ; i++) {
				if(n % i == 0) {	
					if(i%2 == 0)
						ans++;
					if((n/i) % 2 == 0)
						ans++;
					if(i*i == n && i%2 == 0) 
						ans--;
				}
			}
			System.out.println(ans);
		}
		in.close();
	}
}
