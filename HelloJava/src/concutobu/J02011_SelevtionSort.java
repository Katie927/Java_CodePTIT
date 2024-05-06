package concutobu;

import java.util.Scanner;

public class J02011_SelevtionSort {
	public static void Sort(int arr[], int n) {
		int k = 1;
		for(int i=0 ; i<n-1 ; i++) {
			int ind = i;
			for(int j=i+1 ; j<n ; j++) {
				if(arr[j] < arr[ind]) {
					ind = j;
				}
			}
			int tmp = arr[i];
			arr[i] = arr[ind];
			arr[ind] = tmp;
//			if(ind != i) {
				System.out.print("Buoc "+k + ":");
				for(int j=0 ; j<n ; j++) {
					System.out.print(" " + arr[j]);
				}
				System.out.println();
				k++;
//			}
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		for(int i=0 ; i<n ; i++) {
			arr[i] = in.nextInt();
		}
		Sort(arr, n);
		in.close();
	}
}
