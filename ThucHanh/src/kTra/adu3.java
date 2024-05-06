package kTra;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class MonHoc{
	private String subId;
	private String name;
	
	public MonHoc() {
		super();
	}
	public MonHoc(String subId, String name) {
		super();
		this.subId = subId;
		this.name = name;
	}
	public String getSubId() {
		return subId;
	}
	public void setSubId(String subId) {
		this.subId = subId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}

class lopHP implements Comparable<lopHP>{
	int autoId = 1;
	private String id;
	private String subId;
	private int ngay;
	private int kip;
	private String tenGv;
	private String PhongHoc;
	
	
	public lopHP() {
		super();
	}
	public lopHP(String id, String subId, int ngay, int kip, String tenGv, String phongHoc) {
		super();
		this.id = "HP" + String.format("%03d", autoId++);
		this.subId = subId;
		this.ngay = ngay;
		this.kip = kip;
		this.tenGv = tenGv;
		PhongHoc = phongHoc;
	}
	
	
	
//	@Override
//	public String toString() {
//		return this.id+" "+this.
//	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSubId() {
		return subId;
	}
	public void setSubId(String subId) {
		this.subId = subId;
	}
	public int getNgay() {
		return ngay;
	}
	public void setNgay(int ngay) {
		this.ngay = ngay;
	}
	public int getKip() {
		return kip;
	}
	public void setKip(int kip) {
		this.kip = kip;
	}
	public String getTenGv() {
		return tenGv;
	}
	public void setTenGv(String tenGv) {
		this.tenGv = tenGv;
	}
	public String getPhongHoc() {
		return PhongHoc;
	}
	public void setPhongHoc(String phongHoc) {
		PhongHoc = phongHoc;
	}
	@Override
	public int compareTo(lopHP t) {
		String s1 = Integer.toString(this.ngay)+Integer.toString(this.kip);
		String s2 = Integer.toString(t.ngay)+Integer.toString(t.kip);
		return s1.compareTo(s2);
	}
	
}

public class adu3 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("MONHOC.in"));
		int soMon = Integer.parseInt(sc.nextLine());
		List<MonHoc> hocs = new ArrayList<MonHoc>();
		for(int i=0 ; i<soMon ; i++) {
			MonHoc n = new MonHoc(sc.nextLine(), sc.nextLine());
			hocs.add(n);
		}
		
		Scanner sc2 = new Scanner(new File("LICHGD.in"));
		int soLop = Integer.parseInt(sc2.nextLine());
		List<lopHP> hps = new ArrayList<lopHP>();
		for(int i=0 ; i<soLop ; i++) {
			
			String subId = sc2.nextLine();
			int ngay = Integer.parseInt(sc2.nextLine());
			int kip = Integer.parseInt(sc2.nextLine());
			String tenGv = sc2.nextLine();
			String phong = sc2.nextLine();
			
			lopHP m = new lopHP(null, subId, ngay, kip, tenGv, phong);
			
		}
		String yeuCau = sc2.nextLine();
		Collections.sort(hps);
		
		
		System.out.println("LICH GIANG DAY GIANG VIEN " + yeuCau); 
		for(lopHP i:hps) {
			if(i.getTenGv().equals(yeuCau)) {
				System.out.print(i.getId()+" ");
				for(MonHoc j :hocs) {
					if(i.getId().equals(j.getSubId())) {
						System.out.print(j.getName()+" ");
					}
				}
				System.out.println(i.getNgay()+" "+i.getKip()+" "+i.getPhongHoc());
			}
		}
		
	}
}
