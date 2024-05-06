package du;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class SinhVien implements Comparable<SinhVien>{
	String maSV, ten, lop, mail, sdt;
	public SinhVien(Scanner sc) {
		this.maSV = sc.nextLine();
		this.ten = sc.nextLine();
		this.lop = sc.nextLine();
		this.mail = sc.nextLine();
		this.sdt = sc.nextLine();
		sdt = "0" +sdt;
	}
	
	@Override
	public String toString() {
		return maSV + " "+ten+" "+lop+" "+mail+" "+sdt;
	}
	@Override
	public int compareTo(SinhVien t) {
		if(this.lop.equals(t.lop)) {
			return this.maSV.compareTo(t.maSV);
		}
		else {
			return this.lop.compareTo(t.lop);
		}
	}
}

public class clgt {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("DANHSACH.in"));
		ArrayList<SinhVien> arr = new ArrayList<SinhVien>();
		int dem = 0;
		while(sc.hasNextLine()) {
			SinhVien a = new SinhVien(sc);
			arr.add(a);
		}
		Collections.sort(arr);
		for(SinhVien i:arr) {
			System.out.println(i);
		}
	}
}
