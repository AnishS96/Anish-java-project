package aa;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Vending {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in); 
	System.out.println("enter the Amount = ");
	int a=sc.nextInt();
	int RA=0;
	int RA1=0;
		if(a<10) {
System.out.println("Amount is insufficient");
	}
	else if(a>31) {
System.out.println("No product availabe for this Amount.....");
	}
	
	else {
		System.out.println("product are below ");
		Map<String,Integer> m=new HashMap<String,Integer>();
		m.put("coke",10);
		m.put("pepsi",10);
		m.put("M-dew",20);
		m.put("sting",20);
		m.put("vulcan",30);
		m.put("soda",30);
		
		for(Map.Entry m1:m.entrySet()) {
			System.out.println(m1.getKey()+"=Rs."+m1.getValue());
		}
		if(a==20) {
			System.out.println("enter the Product = ");
		String s=sc.next();
			for(Map.Entry m1:m.entrySet()) {
			if(s.equalsIgnoreCase((String) m1.getKey())) {
				System.out.println(m1.getKey()+"=Rs."+m1.getValue());
				RA = a- ((Integer)m1.getValue());
				System.out.println("Remaining Amount ="+ RA);
				
		}
		}
		System.out.println("Do you want to Continue Purchase"+" "+"Yes"+" "+"or"+" "+"No");
		String s1=sc.next();
		if(RA==0) {
			System.out.println("You are low on Money");
		}
		else if(s1.equalsIgnoreCase("No")) {
			System.out.println("Thank you for the purchasing ");
		}
		else {
		System.out.println("Continue purchase");
		
		for(Map.Entry m1:m.entrySet()) {
			System.out.println(m1.getKey()+"=Rs."+m1.getValue());
		}
		System.out.println("enter the Product = ");
		String s3=sc.next();
			for(Map.Entry m1:m.entrySet()) {
			if(s3.equalsIgnoreCase((String) m1.getKey())) {
				System.out.println(m1.getKey()+"=Rs."+m1.getValue());
				RA1 = RA- ((Integer)m1.getValue());
				System.out.println("Remaining Amount ="+ RA1);
				
		}
		}
		}
}
	}
}
}
