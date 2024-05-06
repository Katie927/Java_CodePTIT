package du;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class adu {
	public static boolean check(String s) {
		int ok = 0;
		for(int i=0 ; i<s.length() ; i++) {
			if(s.charAt(i) >='0' && s.charAt(i) <= '9') {
				ok = 1;
			}
			if(s.charAt(i) == '.' || s.charAt(i) == ',' || s.charAt(i) == '?' 
					  || s.charAt(i) == '!' || s.charAt(i) == ':') {
				return false;
			}
		}
		if(ok == 1) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("VANBAN.in"));
		TreeSet<String> words = new TreeSet<String>();
		while(sc.hasNextLine()) {
			String[] s = sc.nextLine().split("\\s");
			for(String i : s) {
				if(check(i)) {
					words.add(i);
				}
			}
		}
		for(String i:words) {
			System.out.println(i);
		}
	}
}
