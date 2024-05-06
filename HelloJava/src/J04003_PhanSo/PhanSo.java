package J04003_PhanSo;

public class PhanSo {
	long a, b;
	PhanSo(long a, long b){
		this.a = a;
		this.b = b;
	}
	
	private long gcd(long x, long y) {
		while( y!= 0) {
			long z = x %y;
			x = y;
			y = z;
		}
		return x;
	}
	
	public String ans() {
		long g = gcd(this.a, this.b);
		return a / g + "/" + b / g;
	}
}
