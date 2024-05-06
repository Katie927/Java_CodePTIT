package concutobu;

import java.util.Scanner;

public class J02014 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test --> 0) {
			int n = sc.nextInt();
			int arr[] = new int[n+1];
			int sum[] = new int[n+1];
			for(int i=1 ; i<=n ; i++) {
				arr[i] = sc.nextInt();
				sum[i] = sum[i-1] + arr[i];	
			}
			int ans = -1;
			for(int i=1 ; i<n ; i++) {
				if(sum[i-1] == sum[n] - sum[i]) {
					ans = i;
					break;
				}
			}
			System.out.println(ans);
		}
	}
}
