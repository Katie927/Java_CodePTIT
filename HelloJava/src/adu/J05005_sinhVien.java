package adu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class SinhVien implements Comparable<SinhVien>{
	public static int numID = 1;
	String id;
	String name;
	String lop;
	String birth;
	double GPA;
	
	SinhVien(Scanner sc){
		this.id = "B20DCCN" + String.format("%03d", numID++);
		this.name = sc.nextLine();
		name = this.getName();
		this.lop = sc.nextLine();
		this.birth = sc.nextLine();
		birth = this.getDate();
		this.GPA = sc.nextDouble();
		sc.nextLine();
	}
	
	public String getName() {
		String[] words = name.trim().split("\\s+");
        String res = "";
        for (String word : words) {
            res += word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase() + " ";
        }
        return res.substring(0, res.length() - 1);
	}
	
	public String getDate() {
		String [] s = this.birth.split("/");
		while(s[0].length() < 2) {
			s[0] = "0" + s[0];
		}
		while(s[1].length() < 2) {
			s[1] = "0" + s[1];
		}
		return s[0] + "/" + s[1] + "/" + s[2];
	}
	
	@Override
	public int compareTo(SinhVien t) {
		if (this.GPA < t.GPA) {
	        return 1;
	    } else if (this.GPA > t.GPA) {
	        return -1;
	    } else {
	    	return 0;
	    }
	}
	
	@Override
	public String toString() {
		return id+" "+name+" "+lop+" "+birth+" "+String.format("%.2f", GPA);
	}
}

public class J05005_sinhVien {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		ArrayList<SinhVien> arr = new ArrayList<SinhVien>();
		for(int i=0 ; i<t ; i++) {
			SinhVien x = new SinhVien(sc);
			arr.add(x);
		}
		Collections.sort(arr);
		for(SinhVien i : arr) {
			System.out.println(i);
		}
	}
}
