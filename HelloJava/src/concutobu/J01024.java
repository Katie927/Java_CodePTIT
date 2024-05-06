package concutobu;

import java.util.Scanner;

public class J01024 {
	public static int check(String str) {
		for(int i=0 ; i<str.length() ; i++) {
			char c = str.charAt(i);
			if(c != '0' && c != '1' && c != '2') {
				return 0;
			}
		}
		return 1;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int test = in.nextInt();
		while(test --> 0) {
			String str = in.next();
			if(check(str) == 0) {
				System.out.println("NO");
			}
			else {
			System.out.println("YES");
			}
		}
		in.close();
	}
}
