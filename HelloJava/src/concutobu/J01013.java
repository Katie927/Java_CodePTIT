package concutobu;

import java.util.Scanner;

public class J01013 {
	static int Prime[] = new int[2000007];
	public static void is_Prime() {
		Prime[0] = 1;
		Prime[1] = 1;
		for(int i=2 ; i*i<2000007 ; i++) {
			if(Prime[i] == 0) {
				for(int j = i*i ; j<2000007 ; j+=i) {
					Prime[j] = i;
				}
			}
		}
		for(int i=2 ; i<2000007 ; i++) {
			if(Prime[i] == 0) {
				Prime[i] = i;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		is_Prime();
		int t = in.nextInt();
		long ans = 0;
		while(t --> 0) {
			int n = in.nextInt();
			while(n != 1) {
				ans += Prime[n];
				n /= Prime[n];
			}
		}
		System.out.println(ans);
		in.close();
	}
}
