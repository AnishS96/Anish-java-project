package aa;

import java.util.Scanner;
import aa.pinmismatchException;
import aa.CashNotFoundsException;

public class Exception_Handling extends pinmismatchException {

	public static void main(String[] args) {
		CashNotFoundsException x=new CashNotFoundsException();
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the account no");
		int accoutno=s.nextInt();
		System.out.println("Enter the pin no");
		int pin=s.nextInt();
		
		
		int  a[]= {789,897,556,124};
		try {
			pinMatch(pin,a);
			try {
				x.cashNot();
			}
			catch(CashNotFoundsException e) {
				System.out.println(e);
			}
		}
		catch(pinmismatchException e) {
System.out.println("exception occured"+" "+e);
		}
		
			
		}

}
