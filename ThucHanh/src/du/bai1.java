package du;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test --> 0) {
			int n = sc.nextInt();
			Set<Integer> st1 = new TreeSet<Integer>();
			Set<Integer> st2 = new TreeSet<Integer>();
			for(int i=0 ; i<n ; i++) {
				int x = sc.nextInt();
				if(x %2 ==0	 ) {
					st1.add(x);
				}
				else {
					st2.add(x);
				}
			}
			ArrayList<Integer> arr2 = new ArrayList<>();
			for(int i : st2) {
				arr2.add(i);
			}
			Collections.reverse(arr2);
			for(int i : st1) {
				System.out.print(i +" ");
			}
			System.out.println("");
			for(int i=0 ; i<arr2.size() ; i++) {
				System.out.print(arr2.get(i) +" ");
			}
			System.out.println("");
		}
		sc.close();
	}
}
