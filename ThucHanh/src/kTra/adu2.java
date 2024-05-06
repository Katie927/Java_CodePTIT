package kTra;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeSet;

public class adu2 {
	public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
		ObjectInputStream oi1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
		ObjectInputStream oi2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
		ArrayList<String> arr1 = (ArrayList<String>) oi1.readObject();
		ArrayList<Integer> arr2 = (ArrayList<Integer>) oi2.readObject();
		TreeSet<String> ts1 = new TreeSet<String>();
		TreeSet<Integer> ts2 = new TreeSet<Integer>();
		for(String i:arr1) {
			ts1.add(i);
		}
		for(Integer i:arr2) {
			ts2.add(i);
		}
		for(String i:ts1) {
			for(Integer j:ts2) {
				System.out.println(i+j);
			}
		}
	}
}
