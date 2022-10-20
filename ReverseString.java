package aa;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		String s="welcome home";
		char[]x=s.toCharArray();
		String w="";
		for(int i=0;i<x.length;i++) {
			if(x[i]!=' ') {
				w=w+x[i];
				
			}
			else {
				for (int j=w.length(); j>0; j--) {
					System.out.print(w.charAt(j-1));
					
					
				}
				System.out.println(" ");
				w="";
			}
			for(int k=w.length();k>0;k--) {
				System.out.print(w.charAt(k-1));
				break;
				
			}
		}
	}
	}

