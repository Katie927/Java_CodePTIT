package adu_File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

//class Student{
//	static int autoId = 1;
//	private String id;
//	private String name;
//	private double p1;
//	private double p2;
//	private double p3;
//	
//	double average() {
//		return (p1*0.25 + p2*0.35 + p3*0.4);
//	}
//	
//	String classification() {
//		if(average() >= 8) {
//			return "GIOI";
//		}
//		if(average() >= 6.5) {
//			return "KHA";
//		}
//		if(average() >= 5) {
//			return "TRUNG BINH";
//		}
//		else {
//			return "KEM";
//		}
//	}
//	
//	private String fixedName(String name) {
//		name = name.trim();
//		String words[] = name.split("\\s+");
//		String s = "";
//		for(int i=0 ; i<words.length ; i++) {
//			s += Character.toUpperCase(words[i].charAt(0));
//			s += words[i].substring(1).toLowerCase() + " ";	
//		}
//		return s;
//	}
//	
//	@Override
//	public String toString() {
//		return id +" "+fixedName(name)+String.format("%.2f", average()) +" "+ classification();
//	}
//	
//	public Student() {
//		super();
//	}
//	public Student(String name, double p1, double p2, double p3) {
//		super();
//		this.id = String.format("SV%02d", autoId++);
//		this.name = name;
//		this.p1 = p1;
//		this.p2 = p2;
//		this.p3 = p3;
//	}
//}

public class J07033_Student {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("BANGDIEM.in"));
		int n = Integer.parseInt(sc.nextLine());
		ArrayList<Student> arr = new ArrayList<Student>();
		while(n --> 0) {
			String name = sc.nextLine();
			double p1 = Double.parseDouble(sc.nextLine());
			double p2 = Double.parseDouble(sc.nextLine());
			double p3 = Double.parseDouble(sc.nextLine());
			Student stu = new Student(name, p1, p2, p3);
			arr.add(stu);
		}
		Collections.sort(arr, new Comparator<Student>() {
			@Override
			public int compare(Student a, Student b) {
				return Double.compare(b.average(), a.average());
			}
		});
		for(Student i:arr) {
			System.out.println(i);
		}
	}
}
