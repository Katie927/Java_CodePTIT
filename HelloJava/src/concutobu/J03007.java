package concutobu;

import java.util.Scanner;

public class J03007 {
	public static int check(String s) {
		if(s.charAt(0) != '8' || s.charAt(s.length()-1) != '8') {
			return 0;
		}
		int sum = 0;
		for(int i=0 ; i<s.length() ; i++) {
			sum += s.charAt(i) - '0';
		}
		if(sum % 10 != 0) {
			return 0;
		}
		return 1;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int test = in.nextInt();
		while(test --> 0) {
			String s = in.next();
			if(check(s) == 0) {
				System.out.println("NO");
			}
			else {
				System.out.println("YES");
			}
		}
	}
}
