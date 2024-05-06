package concutobu;

import java.util.ArrayList;
import java.util.Scanner;

class Pair<T, U>{
	private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }
    public T getFirst() {
        return first;
    }
    public U getSecond() {
        return second;
    }
    
    @Override
    public String toString() {
    	return "("+first+","+second+")";
    }
}

public class dsCanh_PAIR {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Pair<Integer, Integer>> arr = new ArrayList<Pair<Integer, Integer>>();
		for(int i=0 ; i<n ; i++) {
			for(int j=0 ; j<n ; j++) {
				int x = sc.nextInt();
				if(j>i && x == 1) {
					Pair<Integer, Integer> p = new Pair<Integer, Integer>(i+1, j+1);
					arr.add(p);
				}
			}
		}
		for(Pair<Integer, Integer> i : arr) {
			System.out.println(i);
		}
	}
}
//6
//0 1 1 0 1 0
//1 0 1 0 1 0
//1 1 0 1 0 0
//0 0 1 0 1 1
//1 1 0 1 0 1
//0 0 0 1 1 0