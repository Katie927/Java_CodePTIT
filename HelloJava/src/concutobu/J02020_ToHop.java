package concutobu;

import java.util.Scanner;

public class J02020_ToHop {
	static int n, k, dem = 0;
	static int[] arr = new int[17];
	static int[] arr0 = new int[17];
	
	public static void in(int x[]) {
		for(int i=1 ; i<=k ; i++) {
			System.out.print(arr0[x[i]]);
		}
		System.out.print(" ");
	}
	
	public static void SinhToHop(int i) {
		for(int j=i ; j<=n-k+i ; j++) {
			if(j > arr[i-1]) {
				arr[i] = j;
				if(i == k) {
					in(arr);
					dem ++;
				}
				else {
					SinhToHop(i+1);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();
		for(int i=1 ; i<=n ; i++) {
			arr0[i] = i;
		}
		SinhToHop(1);
		System.out.printf("\nTong cong co %d to hop", dem);
	}
}
