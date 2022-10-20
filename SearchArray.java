package aa;

import java.util.Scanner;

public class SearchArray {
	public static void main (String [] args) {
		Scanner sc=new Scanner(System.in);
		String a= sc.next();
		String s[]= {"apple","banana","chair"};
		for(int i=0;i<s.length; i++) {
			
			if(a.equalsIgnoreCase(s[i])) {
				System.out.println();
				System.out.println("String Element = "+" " +s[i]);
				break;
			}
		}
	}
}
