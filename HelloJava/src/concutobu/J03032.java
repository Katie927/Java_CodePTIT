package concutobu;

import java.util.Vector;
import java.util.Scanner;

public class J03032 {
	public static void DevideString(String s, Vector<String> a) {
        String x = "";
        s += " ";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (x != "") {
                    a.add(x);
                    x = "";
                }
            } else {
                x += s.charAt(i);
            }
        }
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            Vector<String> a = new Vector<>();
            DevideString(s, a);
            for (int i = 0; i < a.size(); i++) {
                s = a.get(i);
                StringBuilder x = new StringBuilder(s);
                System.out.print(x.reverse().toString() + " ");
            }
            System.out.println();
        }
	}
}
