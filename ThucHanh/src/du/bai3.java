package du;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

class Matrix{
	private int n, m, t;
	private int[][] mt, c;
	public Matrix(int n, int m, int t, int[][] mt) {
		super();
		this.n = n;
		this.m = m;
		this.t = t;
		this.mt = mt;
		c = new int[m][n];
		for(int i=0 ; i<n ; i++) {
			for(int j=0 ; j<m ; j++) {
				c[j][i] = mt[i][j];
			}
		}
		Arrays.sort(c[t-1]);
	}
	
	void display() {
		for(int i=0 ; i<n ; i++) {
			for(int j=0 ; j<m ; j++) {
				System.out.print(c[j][i] + " ");
			}
			System.out.println("");
		}
	}
	
}

public class bai3 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("MATRIX.in"));
		int test = sc.nextInt();
		while(test --> 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int t = sc.nextInt();
			int mt[][] = new int[n][m];
			for(int i=0 ; i<n ; i++) {
				for(int j=0 ; j<m ; j++) {
					mt[i][j] = sc.nextInt();
				}
			}
			Matrix k = new Matrix(n, m, t, mt);
			k.display();
		}
	}
}
