package concutobu;

import java.util.Scanner;

class SoPhuc{
	int thuc;
	int ao;
	public SoPhuc(Scanner sc) {
		thuc = sc.nextInt();
		ao = sc.nextInt();
	}
	public SoPhuc(int thuc, int ao) {
		this.thuc = thuc;
		this.ao = ao;
	}
	
	SoPhuc tong(SoPhuc n) {
		int tongThuc = this.thuc + n.thuc;
		int tongAo = this.ao + n.ao;
		return new SoPhuc(tongThuc, tongAo);
	}
	SoPhuc hieu(SoPhuc n) {
		int hieuThuc = this.thuc - n.thuc;
		int hieuAo = this.ao - n.ao;
		return new SoPhuc(hieuThuc, hieuAo);
	}
	SoPhuc tich(SoPhuc n) {
		int tichThuc = (this.thuc*n.thuc - this.ao*n.ao);
		int tichAo = (this.thuc*n.ao + this.ao*n.thuc);
		return new SoPhuc(tichThuc, tichAo);
	}
	
	@Override
	public String toString() {
		return thuc + " + " + ao + "i";
	}
}

public class J04018 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test --> 0) {
			SoPhuc a = new SoPhuc(sc);
			SoPhuc b = new SoPhuc(sc);
//			System.out.println(a.tong(b));
//			System.out.println(a.hieu(b));
			SoPhuc c = (a.tong(b)).tich(a);
			SoPhuc d = (a.tong(b)).tich(a.tong(b));
			System.out.println(c+", "+d);
		}
	}
}
