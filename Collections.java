package aa;
import java.util.Scanner;
import java.util.Vector;
public class Collections {
	static Vector<String> v=new Vector<String>();
	static Vector<Integer> v1=new Vector<Integer>();
	static void buyProduct( String s, int n) {
		if(v.contains(s)) {
			int count =v.indexOf(s);
			int quant=(int) v1.get(count)+n;
			int set =(int) v1.set(count, quant);
			System.out.println(v.elementAt(count));
			System.out.println(v1.elementAt(count));
		}
		else {
			System.out.println("your product is not found");
		}
	}
	static void sellProduct(Vector<String> v, Vector<Integer> v1, String s, int n) {
		if(v.contains(s)) {
			int count =v.indexOf(s);
			int quant=(int) v1.get(count)-n;
			int set =(int) v1.set(count, quant);
			System.out.println(v.elementAt(count));
			System.out.println(v1.elementAt(count));
		}
		else {
			System.out.println("your product is not found");
		}
	}
	public static void main(String[] args) {
		
		v.add(""
				+ ""
				+ "watch");
		v.add("shirt");
		v.add("pen");
		v.add("genes");
		v.add("biscuit");
		v.add("coffee");
		v.add("tea");
		v.add("vegetables");
		v.add("fruits");
		v.add("smartphones");
		
		v1.add(10);
		v1.add(15);
		v1.add(10);
		v1.add(16);
		v1.add(12);
		v1.add(13);
		v1.add(14);
		v1.add(9);
		v1.add(10);
		v1.add(20);
		System.out.println("do you want sell your product or buy other product.... ");
		Scanner sc=new Scanner(System.in);
		System.out.println(".........press 1 for buy or press 2 for sell.......");
		int hr=sc.nextInt();
		switch(hr) {
		case 1:
			System.out.println("products"+" "+v);
			System.out.println("Quantity"+"  "+v1);
			System.out.println("enter the product you like...");
			String s=sc.next();
			System.out.println("how much you want it ?...");
			int n=sc.nextInt();
			buyProduct(s,n);
			break;
		case 2:
			System.out.println("products"+" "+v);
			System.out.println("Quantity"+"  "+v1);
			System.out.println("enter the product you like...");
			String sr=sc.next();
			System.out.println("how much you want it ?...");
			int a=sc.nextInt();
			sellProduct(v,v1,sr,a);
			break;
		}
		}
	
}

