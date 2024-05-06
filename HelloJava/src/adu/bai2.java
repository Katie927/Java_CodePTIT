package adu;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class bai2 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("MATRIX.in"));
		int test = sc.nextInt();
		while(test --> 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt()-1;
			int [][] mat = new int[n][m];
			int arr[] = new int[n];
			for (int i=0 ; i<n ; i++) {
				for(int j=0 ; j<m ; j++) {
					mat[i][j] = sc.nextInt();
					if(j == k) {
						arr[i] = mat[i][k];
					}
				}
			}
			Arrays.sort(arr);
			for(int i=0 ; i<n ; i++) {
				mat[i][k] = arr[i];
			}
			
			for(int i=0 ; i<n ; i++) {
				for(int j=0 ; j<m ; j++) {
					System.out.print(mat[i][j] + " ");
				}
				System.out.println("");
			}
		}
	}
}
