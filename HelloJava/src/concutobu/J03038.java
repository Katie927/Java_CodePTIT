package concutobu;

import java.util.Scanner;

public class J03038 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
        int d = 0, a[] = new int[200];
        for (int i = 0; i < s.length(); i++)
            a[s.charAt(i)]++;
        for (int i = 0; i < 200; i++)
            if (a[i] > 0)
                d++;
        System.out.println(d);
	}
}
