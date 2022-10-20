package aa;

import java.util.Scanner;

public class Eb_Bill {
	
	public static void req(int unit, int amount) {
		if(unit>=0 || unit<=100) {
			amount=unit*0;
			System.out.println("amount for o-100 unit = "+amount);
		}
		
	}
	class fee{
		
		public void amnt(int unit,int amount) {
			if(unit>100 && unit<=200) {
				amount =(unit-100)*2;
				System.out.println("amount for more than 100 unit is Rs."+amount);
			}
			else if(unit>200 && unit<=300) {
				amount =100*(int)1.20+(unit-100)*3;
				System.out.println("amount for more than 200 unit is Rs."+amount);
			}
			else if(unit>300 && unit<=400) {
				amount=100*(int)1.20+200*2+(unit-100)*4;
				System.out.println("amount for more than 300 unit is Rs."+amount);
			}
			else if(unit>400 && unit<=600) {
				amount=100*(int)1.20+200*2+300*3+(unit-100)*5;
				System.out.println("amount for more than 400 unit is Rs."+amount);
		}
			else {
				System.out.println("Thanks for using maximum Electricity");
			}
	}
		
		
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the unit : ");
		 int unit=sc.nextInt();
		 int amount=0;
		 Eb_Bill eb=new Eb_Bill ();
		 Eb_Bill.fee eb1=eb.new fee();
		
		 if(unit>0 && unit<=100) {
			eb.req(unit, amount); 
		 }
		 else {
				eb1.amnt(unit,amount);
			}
		 
	}
}