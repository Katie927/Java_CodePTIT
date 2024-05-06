//package adu_File;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Scanner;
//
//class Subject implements Comparable<Subject>{
//	String subId;
//	String subName;
//	String exam;
//	
//	Subject(Scanner sc){
//		this.subId = sc.nextLine();
//		this.subName = sc.nextLine();
//		this.exam = sc.nextLine();
//	}
//	
//	@Override
//	public String toString() {
//		return subId+" "+subName+" "+exam;
//	}
//	
//	@Override
//	public int compareTo(Subject t) {
//		return this.subId.compareTo(t.subId);
//	}
//}
//
//public class J07058 {
//	public static void main(String[] args) throws FileNotFoundException {
//		Scanner sc = new Scanner(new File("MONHOC.in"));
//		int n = Integer.parseInt(sc.nextLine());
//		Subject[] subs = new Subject[2];
//		ArrayList<Subject> arr = new ArrayList<Subject>();
//		for(int i=0 ; i<n ; i++) {
//			Subject x = new Subject(sc);
//			arr.add(x);
//		}
//		Collections.sort(arr);
//		for(Subject i : arr) {
//			System.out.println(i);
//		}
//		
//	}
//}
