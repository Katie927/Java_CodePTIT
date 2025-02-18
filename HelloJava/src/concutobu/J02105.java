package concutobu;

import java.util.Scanner;
import java.util.Vector;

public class J02105 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        Vector<Vector<Integer>> v = new Vector<>();
        for (int i = 1; i <= n; i++) {
            Vector<Integer> a = new Vector<>();
            for (int j = 1; j <= n; j++) {
                int x = sc.nextInt();
                if (x == 1)
                    a.add(j);
            }
            v.add(a);
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("List(%d) = ", i + 1);
            for (int j = 0; j < v.get(i).size(); j++) {
                System.out.print(v.get(i).get(j) + " ");
            }
            System.out.println();
        }
	}
}
