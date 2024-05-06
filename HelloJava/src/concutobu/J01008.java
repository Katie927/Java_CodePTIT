package concutobu;

import java.util.Scanner;

public class J01008 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int test = in.nextInt();
		for(int j=1 ; j<=test ; j++) {
			long n = in.nextLong();
			System.out.printf("Test %d: ", j);
			while(n>1) {
				for(int i=2 ; i<=n ; i++) {
					int dem = 0;
					while(n%i == 0) {
						dem++;
						n /= i;
					}
					if(dem > 0)		System.out.print(i + "(" + dem + ") ");
				}
			}
			System.out.println();
		}
	}
}
