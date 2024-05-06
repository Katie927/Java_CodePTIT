package concutobu;

import java.util.Scanner;

public class J02012_InsertionSort {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		for(int i=0 ; i<n ; i++) {
			arr[i] = in.nextInt();
		} 
		for(int i=0 ; i<n ; i++) {
			for(int j=0 ; j<=i ; j++) {
				for(int k=i ; k>j ; k--) {
					if(arr[k] < arr[k-1]) {
						int tmp = arr[k];
						arr[k] = arr[k-1];
						arr[k-1] = tmp;
					}
				}
			}
			System.out.printf("Buoc %d: ", i);
			for(int j=0 ; j<=i ; j++) {
				System.out.print(arr[j] + " ");
			}
			System.out.println();
		}
	}
}
