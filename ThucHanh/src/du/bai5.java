package du;

import java.util.Scanner;
import java.util.Stack;

public class bai5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test --> 0) {
			int n = sc.nextInt();
			String arr[] = new String[n];
			for(int i=0 ; i<n ; i++) {
				arr[i] = sc.next();
			}
			Stack<Long> st = new Stack<Long>();
			for(int i= arr.length-1 ; i>=0 ; i--) {
				if(arr[i].equals("+")) {
					Long a = st.peek();
					st.pop();
					Long b = st.peek();
					st.pop();
					st.push(a+b);
				}
				else if(arr[i].equals("-")) {
					Long a = st.peek();
					st.pop();
					Long b = st.peek();
					st.pop();
					st.push(a-b);
				}
				else if(arr[i].equals("*")) {
					Long a = st.peek();
					st.pop();
					Long b = st.peek();
					st.pop();
					st.push(a*b);
				}
				else if(arr[i].equals("/")) {
					Long a = st.peek();
					st.pop();
					Long b = st.peek();
					st.pop();
					st.push(a/b);
				}
				else {
					st.push(Long.valueOf(arr[i]));
				}
			}
			System.out.println(st.peek());
		}
	}
}
