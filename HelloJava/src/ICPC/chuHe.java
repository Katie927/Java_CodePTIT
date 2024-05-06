package ICPC;

import java.util.Scanner;

public class chuHe {
	private String name;
	private String Code;
	private String stt;
	private int Price;
	private int soLuong;
	private int giamGia;
	private int thanhTien;
	
	public chuHe() {
		Scanner sc = new Scanner(System.in);
		this.name = sc.nextLine();
		this.Code = sc.next();
		stt = Code.substring(1, 4);
		this.Price = sc.nextInt();
		this.soLuong = sc.nextInt();
		if(Code.charAt(4) == '1') {
			this.giamGia = this.Price*this.soLuong/10 *5;
		}
		else {
			this.giamGia = this.Price*this.soLuong/10 *3;
		}
		thanhTien = this.Price*this.soLuong - this.giamGia;
	}
	
	public String toString() {
		return name+" "+Code+" "+stt+" "+giamGia+" "+thanhTien;
	}
	
}


