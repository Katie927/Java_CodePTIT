package adu;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class nani {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<String> a = new TreeSet<>();
		Set<String> b = new TreeSet<>();
		int n = sc.nextInt();
		while(n --> 0) {
			String s = sc.nextLine();
			String [] arr = s.trim().split("\\s+");
			for (String i : arr) {
				a.add(i.toLowerCase());
			}
		}
		int m = sc.nextInt();
		while(m --> 0) {
			String s = sc.nextLine();
			String [] arr = s.trim().split("\\s+");
			for (String i : arr) {
				b.add(i.toLowerCase());
			}
		}
		for (String i: a) {
			if(!b.contains(i)) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		for (String i: b) {
			if(!a.contains(i)) {
				System.out.print(i + " ");
			}
		}
	}
}
