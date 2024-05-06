package adu_File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

//class Student{
//	public static int autoId = 1;
//	
//	private String stuId;
//	private String name;
//	private double s1;
//	private double s2;
//	private double s3;
//	private int rank;
//
//	public int getRank() {
//		return rank;
//	}
//	public void setRank(int rank) {
//		this.rank = rank;
//	}
//
//	public static String formatName(String name) {
//        String[] s = name.trim().toLowerCase().split("\\s+");
//        String res = "";
//        for (String i : s) {
//            res += i.substring(0, 1).toUpperCase() + i.substring(1) + " ";
//        }
//        return res.trim();
//    }
//	
//	private String id() {
//		return String.format("SV%02d", autoId++);
//	}
//	
//	public double average() {
//		return (s1*3 +s2*3 +s3*2)/8;
//	}
//	
//	@Override
//	public String toString() {
//		return stuId+" "+formatName(name)+" "+String.format("%.2f", average())+" "+rank;
//	}
//	
//	public Student() {
//		super();
//	}
//	public Student(String name, double s1, double s2, double s3) {
//		super();
//		this.name = name;
//		this.s1 = s1;
//		this.s2 = s2;
//		this.s3 = s3;
//		this.stuId = id();
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public double getS1() {
//		return s1;
//	}
//	public void setS1(double s1) {
//		this.s1 = s1;
//	}
//	public double getS2() {
//		return s2;
//	}
//	public void setS2(double s2) {
//		this.s2 = s2;
//	}
//	public double getS3() {
//		return s3;
//	}
//	public void setS3(double s3) {
//		this.s3 = s3;
//	}
//	public String getStuId() {
//		return stuId;
//	}
//	public void setStuId(String stuId) {
//		this.stuId = stuId;
//	}
//
//}

public class J07054 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("BANGDIEM.in"));
		
		int n = Integer.parseInt(sc.nextLine());
		ArrayList<Student> arr = new ArrayList<Student>();
		while(n --> 0) {
			String name = sc.nextLine();
			double s1 = Double.parseDouble(sc.nextLine());
			double s2 = Double.parseDouble(sc.nextLine());
			double s3 = Double.parseDouble(sc.nextLine());
			Student stu = new Student(name, s1, s2, s3);
			arr.add(stu);
		}
		Collections.sort(arr, new Comparator<Student>() {
			@Override
			public int compare(Student a, Student b) {
				if(Double.compare(a.average(), b.average()) == 0) {
					return a.getStuId().compareTo(b.getStuId());
				}
				return Double.compare(b.average(), a.average());
			}
		});
		
//		int tmp = 0;
		arr.get(0).setRank(1);
		for(int i=1 ; i<arr.size() ; i++) {
			if(arr.get(i).average() == arr.get(i-1).average()) {
				arr.get(i).setRank(arr.get(i-1).getRank());
			}
			else {
				arr.get(i).setRank(i+1);
			}
		}
		for(Student i:arr) {
			System.out.println(i);
		}
	}
}
