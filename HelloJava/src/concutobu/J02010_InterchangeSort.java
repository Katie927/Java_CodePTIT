package concutobu;

import java.util.Scanner;

public class J02010_InterchangeSort {
	public static void Interchange_Sort(int arr[], int n) {
		int k = 1;
		for(int i=0 ; i<n-1 ; i++) {
			int ok = 0;
			for(int j=i+1 ; j<n ; j++) {
				if(arr[i] > arr[j]) {
					ok = 1;
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
			if(ok == 1) {
				System.out.print("Buoc "+k + ": ");
				for(int j=0 ; j<n ; j++) {
					System.out.print(arr[j] + " ");
				}
				System.out.println();
				k++;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		for(int i=0 ; i<n ; i++) {
			arr[i] = in.nextInt();
		}
		Interchange_Sort(arr, n);
		in.close();
	}
}
