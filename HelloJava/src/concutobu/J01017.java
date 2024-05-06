package concutobu;

import java.util.Scanner;

public class J01017 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int test = in.nextInt();
		while(test --> 0) {
			String str = in.next();
			String ans = "YES";
			for(int i=0 ; i<str.length()-1 ; i++) {
				char c = str.charAt(i);
				char c1 = str.charAt(i+1);
				int k = Math.abs(c-c1);
				if(k != 1) {
					ans = "NO";
					break;
				}
			}
			System.out.println(ans);
		}
		in.close();
	}
}
