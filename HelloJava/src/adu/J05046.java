package adu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Product{
	private String name;
	private int quantity;
	private long price;
	
	public static Map<String, Integer> mp = new HashMap<String, Integer>();
	
	
	String id() {
		String[] c = name.split(" ");
		String a1 = c[0].charAt(0)+""+c[1].charAt(0);
		if(mp.get(a1) == null) {
			mp.put(a1, 1);
		}
		else {
			int tmp = mp.get(a1);
			mp.put(a1, ++tmp);
		}
		
		return a1.toUpperCase()+""+String.format("%02d", mp.get(a1));
	}

	long totalPrice() {
		return quantity * price;
	}
	
	long discount() {
		if(quantity > 10) {
			return totalPrice() * 5 / 100;
		}
		else if(quantity >= 8) {
			return totalPrice() * 2 / 100;
		}
		else if(quantity >= 5) {
			return totalPrice() / 100;
		}
		else {
			return 0;
		}
	}
	long finalPrice() {
		return totalPrice() - discount();
	}
	
	
	
	
	@Override
	public String toString() {
		return id()+" "+name+" "+discount()+" "+finalPrice();
	}

	public Product() {
		super();
	}
	public Product(String name, int quantity, long price) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
}

public class J05046 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		ArrayList<Product> arr = new ArrayList<Product>();
		while(n --> 0) {
			String name = sc.nextLine();
			int quantity = sc.nextInt();
			long price = sc.nextLong();
			sc.nextLine();
			Product x = new Product(name, quantity, price);
			arr.add(x);
		}
		
		for(Product i: arr) {
			System.out.println(i);
		}
		
	}
}
