package concutobu;

import java.util.Scanner;

public class J02103 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int k = 1; k <= t; k++) {
            int n = sc.nextInt(), m = sc.nextInt();
            int a[][] = new int[n + 1][m + 1];
            int b[][] = new int[m + 1][n + 1];
            for (int i = 1; i <= n; i++)
                for (int j = 1; j <= m; j++)
                    b[j][i] = a[i][j] = sc.nextInt();
            System.out.printf("Test %d:\n", k);
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    int x = 0;
                    for (int z = 1; z <= m; z++)
                        x += a[i][z] * b[z][j];
                    System.out.printf("%d ", x);
                }
                System.out.println();
            }
        }
	}
}
