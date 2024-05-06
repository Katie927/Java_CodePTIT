package adu;

import java.util.Scanner;

class GiaoVien{
	Scanner sc = new Scanner(System.in);
	String Code;
	String name;
	int rank;
	int Luong;
	int phuCap;
	int thuNhap;
	
	GiaoVien(){
		this.Code = sc.nextLine();
		this.name = sc.nextLine();
		this.Luong = sc.nextInt();
		rank = this.getRank();
		phuCap = this.getPhuCap();
		thuNhap = this.Luong*this.rank + this.phuCap;
	}
	
	int getRank() { 
		return (Code.charAt(2)-'0') *10 + Code.charAt(3) - '0';
	}
	public int getPhuCap() {
		if(this.Code.charAt(1) == 'T') {
			return  2000000;
		}
		else if(this.Code.charAt(1) == 'P') {
			return  900000;
		}
		else {
			return  500000;
		}
	}
	
	public String toString() {
		return Code+" "+name+" "+rank+" "+phuCap+" "+thuNhap;
	}
}

public class J04015 {
	public static void main(String[] args) {
		GiaoVien n = new GiaoVien();
		System.out.println(n);
	}
}
