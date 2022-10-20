package october;

import java.util.Scanner;
import java.util.Vector;

public class GroceryPurchase {

	public static void buy(Vector<String> v, Vector<Integer> v1, String s , int q) {
		Scanner sc = new Scanner(System.in);
		if(v.contains(s)) {

			int count = v.indexOf(s);
			int ind =  v1.get(count) + q;
			int qet =  v1.set(count,ind);
			System.out.println(v);
			System.out.println(v1);
		}
	}
			

	public static void sell(Vector<String> v, Vector<Integer> v1, String s, int q) {
		Scanner sc = new Scanner(System.in);
		if(v1.contains(s)) {
		int count = v.indexOf(s);
		int ind =  v1.get(count) - q;
		int qet =  v1.set(count,ind);
		System.out.println(v);
		System.out.println(v1);
		}
		else {
			System.out.println("Quantity Limit Exceeds");
			//System.out.println("Purchase Options : " + "1.Buy 2.Sell");

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Vector<String> v = new Vector();
		v.add("Watch");
		v.add("orange");
		v.add("Mobile");

		Vector<Integer> v1 = new Vector();
		v1.add(10);
		v1.add(20);
		v1.add(30);

		System.out.println("Welcome to WALMART"+"\n"+"Products are [orange - Watch - Mobile] ");
		System.out.println("Purchase Options : " + "1.Buy 2.Sell");
		int opt = sc.nextInt();
		switch (opt) {
		case 1:
			System.out.println("enter the product :");
			String s = sc.next();
			System.out.println("enter the quantity :");
			int q = sc.nextInt();
			buy(v, v1, s, q);
			break;
		case 2:
			System.out.println("enter the product :");
			String s1 = sc.next();
			System.out.println("enter the quantity :");
			int q1 = sc.nextInt();

			sell(v,v1,s1,q1);
			break;
		}

	}

}
