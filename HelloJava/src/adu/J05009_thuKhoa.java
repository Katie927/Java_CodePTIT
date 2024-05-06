package adu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class thiSinh implements Comparable<thiSinh>{
	static int stt = 1;
	String id;
	String name;
	String birth;
	double p1;
	double p2;
	double p3;
	
	thiSinh(Scanner sc){
		this.id = String.format("%d", stt++);
		this.name = sc.nextLine();
		this.birth = sc.nextLine();
		this.p1 = sc.nextDouble();
		this.p2 = sc.nextDouble();
		this.p3 = sc.nextDouble();
		sc.nextLine();
	}
	
	double Point() {
		return this.p1 + this.p2 + this.p3;
	}
	
	@Override
	public int compareTo(thiSinh t) {
		if(this.Point() < t.Point()) {
			return 1;
		}
		else if(this.Point() > t.Point()) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
	@Override
	public String toString() {
		return id+" "+name+" "+birth+" "+String.format("%.1f", Point());
	}
	
}

public class J05009_thuKhoa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		ArrayList<thiSinh> arr = new ArrayList<>();
		for(int i=0 ; i<n ; i++) {
			thiSinh x = new thiSinh(sc);
			arr.add(x);
		}
		Collections.sort(arr);
		double max = 0;
		for(thiSinh i : arr) {
			if(i.Point() >= max) {
				max = i.Point();
				System.out.println(i);
			}
			else {
				break;
			}
		}
	}
}
/*
3
Nguyen Van A
12/12/1994
3.5
7.0
5.5
Nguyen Van B
1/9/1994
7.5
9.5
9.5
Nguyen Van C
6/7/1994
8.5
9.5
8.5
 */