package aa;

public class pinmismatchException extends Exception {
	public static void pinMatch(int pin,int a[]) throws pinmismatchException {
		for(int i=0;i<a.length;i++) {
		
		 if(pin==a[i]) {
			System.out.println("Pin matched!.......");
			break;
		}
		 else if(i==a.length-1) {
			 throw new  pinmismatchException();
		 }
	}
		}
	
}
