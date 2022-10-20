package aa;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class StringSort {

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the strings : ");
	String s=sc.next();
	
	 String x[]=s.split(",");
		for(int i=0;i<x.length;i++) {
		 for(int j=i+1;j<x.length;j++) {
			 if(x[i].compareTo(x[j])>0) {
				 String temp=x[i];
				 x[i]=x[j];
				 x[j]=temp;
		}
		 	 System.out.println(Arrays.toString(x));
	 }
}
}
}