package concutobu;

import java.util.Scanner;

public class J03008 {
	public static int check(String s) {
		for(int i=0 ; i<s.length()/2 ; i++) {
			if(s.charAt(i)!='2' && s.charAt(i)!='3' && s.charAt(i)!='5' && s.charAt(i)!='7') {
				return 0;
			}
			if (s.charAt(i) != s.charAt(s.length()-1-i)) {
				return 0;
			}
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
