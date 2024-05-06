package concutobu;

import java.util.Scanner;

public class J02007_DemLanXh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for(int i=1 ; i<=test ; i++) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			int[] dem = new int[100001];
			for(int j=0 ; j<n ; j++) {
				arr[j] = sc.nextInt();
				dem[arr[j]] += 1;
			}
			System.out.printf("Test %d:\n", i);
			for(int j=0 ; j<n ; j++) {
				if(dem[arr[j]] != 0) {
					System.out.printf("%d xuat hien %d lan\n", arr[j], dem[arr[j]]);
					dem[arr[j]] = 0;
				}
			}
		}
	}
}
