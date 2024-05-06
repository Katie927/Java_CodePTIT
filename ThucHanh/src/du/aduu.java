package du;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class aduu {
	public static boolean check(int n) {
		String s = Integer.toString(n);
		if(s.length() <2) {
			return false;
		}
		for(int i=0 ; i<s.length()-1 ; i++) {
			if(s.charAt(i) > s.charAt(i+1)) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectInputStream oin1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
		ArrayList<Integer> arr1 = (ArrayList<Integer>) oin1.readObject();
		oin1.close();
		
		ObjectInputStream oin2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
		ArrayList<Integer> arr2 = (ArrayList<Integer>) oin2.readObject();
		oin2.close();    
		
		int [] a1 = new int[100005];
		int [] a2 = new int[100005];
		
		for(Integer x :arr1) {
			if(check(x)) {
				a1[x] ++;
			}
		}
		for(Integer x :arr2) {
			if(check(x)) {
				a2[x] ++;
			}
		}
		for(int i=10 ; i<=9999 ; i++) {
			if(a1[i] >= 1 && a2[i] >=1) {
				System.out.println(i +" "+a1[i] +" "+a2[i]);
			}
		}
	} 
}

// 3.141926535897932384636422