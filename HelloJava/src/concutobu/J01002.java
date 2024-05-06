
package concutobu;
import java.util.Scanner;

public class J01002 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int test = in.nextInt();
		while(test --> 0) {
			int a = in.nextInt();
			System.out.println(((a+1)*a)/2);
		}
	}
}
