package concutobu;

import java.util.Scanner;

public class J01009 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long[] sum = new long[21];
		sum[1] = 1;
		for(int i=2 ; i<21 ; i++) {
			sum[i] = i*sum[i-1];
		}
		int n = in.nextInt();
		long ans = 0;
		for(int i=1 ; i<=n ; i++) {
			ans += sum[i];
		}
		System.out.println(ans);
	}
}
