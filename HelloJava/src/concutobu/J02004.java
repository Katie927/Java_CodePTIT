package concutobu;

import java.util.Scanner;

public class J02004 {
	public static String ans(long[] arr, int n) {
		for(int i=0 ; i<n/2 ; i++) {
			if(arr[i] != arr[n-i-1])
				return "NO";
		}
		return "YES";
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int test = in.nextInt();
		while(test --> 0) {
			int n = in.nextInt();
			long[] arr = new long[n];
			for(int i=0 ; i<n ; i++) {
				arr[i] = in.nextLong();
			}
			System.out.println(ans(arr, n));
		}
		in.close();
	}
}
