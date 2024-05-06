package adu;

import java.util.ArrayList;
import java.util.Scanner;

class Candidate{
	static int autoID = 1;
	private String id;
	private String name;
	private double averageScore;
	private int rank;
	
	public Candidate(String name, double averageScore) {
		super();
		this.id = String.format("HS%02d", autoID);
		this.name = name;
		this.averageScore = averageScore;
		this.rank = autoID ++;
	}
	
	
	public String getClassification() {
		if(this.averageScore >= 9) {
			return "Gioi";
		}
		else if(this.averageScore >= 7) {
			return "Kha";
		}
		else if(this.averageScore >=5) {
			return "Trung Binh";
		}
		else {
			return "Yeu";
		}
	}
	

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getAverageScore() {
		return averageScore;
	}
	public void setAverageScore(double averageScore) {
		this.averageScore = averageScore;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return this.id +" "+this.name+" "+this.averageScore+" "+this.getClassification()+" "+this.rank;
	}
}

public class J05054_Candidate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		ArrayList<Candidate> arr = new ArrayList<Candidate>();
		while(t --> 0) {
			Candidate n = new Candidate(sc.nextLine(), Double.parseDouble(sc.nextLine()));
			arr.add(n);
		}
		arr.sort((a,b) -> {
			if(a.getAverageScore() > b.getAverageScore()) {
				return -1;
			}
			else {
				return 1;
			}
		});
		arr.get(0).setRank(1);
		for(int i=1 ; i<arr.size() ; i++) {
			arr.get(i).setRank(i+1);
			if(arr.get(i).getAverageScore() == arr.get(i-1).getAverageScore()) {
				arr.get(i).setRank(arr.get(i-1).getRank());
			}
		}
		arr.sort((a,b) ->{
			return a.getId().compareTo(b.getId());
		});
		for(Candidate i:arr) {
			System.out.println(i);
		}
		sc.close();
	}
}

