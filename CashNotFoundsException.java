package aa;
import java.util.Scanner;

import aa.Exception_Handling;
public class CashNotFoundsException extends Exception{
          void cashNot() throws CashNotFoundsException {
        	 
        	  Scanner sc=new Scanner(System.in);
        	  System.out.println("enter the Amount : ");
        	  int cash1=sc.nextInt();
      		int cash=50000;
        	  if(cash1<=cash) {
        		int  bal=cash1-cash;
        		  System.out.println("amount debited and your remaining is :"+bal);
        	  }
        	  else if(cash1>cash){
        		  throw new  CashNotFoundsException();
        		
        		  
        	  }
          }
}
