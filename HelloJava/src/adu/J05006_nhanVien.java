package adu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class NhanVien  implements Comparable<NhanVien> {
	static int stt = 1;
	public String name;
	public String sex;
	public String birth;
	public String address;
	public String taxCode;
	public String date;
	public String staffCode;
	
	public NhanVien(Scanner sc) {
		this.staffCode = String.format("%05d", stt++);
		this.name = sc.nextLine();
		this.sex = sc.nextLine();
		this.birth = sc.nextLine();
		this.address = sc.nextLine();
		this.taxCode = sc.nextLine();
		this.date = sc.nextLine();
	}
	
	@Override
	public int compareTo(NhanVien t) {
		String[] days1 = this.birth.split("/");
		String[] days2 = t.birth.split("/");
		String s1 = days1[2] + "/" + days1[1] + "/" + days1[0];
		String s2 = days2[2] + "/" + days2[1] + "/" + days2[0];
		return s1.compareTo(s2);
	}
	
	@Override
	public String toString() {
		return staffCode+" "+name+" "+sex+" "+birth+" "+address+" "+taxCode+" "+date;
	}
}


public class J05006_nhanVien {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		ArrayList<NhanVien> arr = new ArrayList<>(n);
		for(int i=0 ; i<n ; i++) {
			NhanVien x = new NhanVien(sc);
			arr.add(x);
		}
		Collections.sort(arr);
		for(NhanVien i : arr) {
			System.out.println(i);
		}
	}
}
/*
3
Nguyen Van A
Nam
22/10/1982
Mo Lao-Ha Dong-Ha Noi
8333012345
31/12/2013
Ly Thi B
Nu
15/10/1988
Mo Lao-Ha Dong-Ha Noi
8333012346
22/08/2011
Hoang Thi C
Nu
04/02/1981
Mo Lao-Ha Dong-Ha Noi
8333012347
22/08/2011
*/