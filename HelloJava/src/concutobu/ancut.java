package concutobu;

import java.util.Scanner;

public class ancut {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] check = new int[201];
		int max = 0;
		for(int i=0 ; i<n ; i++) {
			int a = sc.nextInt();
			if(a > max)
				max = a;
			check[a] = 1;
		}
		int ok = 1;
		for(int i=1 ; i<max ; i++) {
			if(check[i] == 0) {
				ok = 0;
				System.out.println(i);
			}
		}
		if(ok == 1)
			System.out.println("Excellent!");
	}
}
