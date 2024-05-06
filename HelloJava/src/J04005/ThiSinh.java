package J04005;

class ThiSinh {
	private String name;
	private String date;
	private float point1, point2, point3;
	
	public ThiSinh(String name, String date, float point1, float point2, float point3){
		this.name = name;
		this.date = date;
		this.point1 = point1;
		this.point2 = point2;
		this.point3 = point3;
	}
	public String getName() {
		return name;
	}
	public String getDate() {
		String [] s = this.date.split("/");
		while(s[0].length() < 2) {
			s[0] = "0" + s[0];
		}
		while(s[1].length() < 2) {
			s[1] = "0" + s[1];
		}
		return s[0] + "/" + s[1] + "/" + s[2];
	}
	public float getPoint() {
		return this.point1 + this.point2 + this.point3;
	}
}
