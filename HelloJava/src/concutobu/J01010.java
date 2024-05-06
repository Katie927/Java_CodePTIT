package concutobu;

import java.util.Scanner;

public class J01010 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int test = in.nextInt();
		while(test --> 0) {
			String str = in.next();
			int check = 0;
			String ans = "";
			for(int i=0 ; i<str.length() ; i++) {
				char c = str.charAt(i);
				if(c == '1') {
					ans += '1';
				}
				else if(c == '0' || c == '9' || c == '8') {
					ans += '0';
				}
				else {
					check = 1;
					break;
				}
			}
			if(check == 1)	System.out.println("INVALID");
			else {
				long sum = 0;
				for(int i=0 ; i<ans.length() ; i++) {
					char v = ans.charAt(i);
					sum = sum*10 + (v-'0');
				}
				if(sum != 0)	System.out.println(sum);
				else			System.out.println("INVALID");
			}
		}	
		in.close();
	}
}
