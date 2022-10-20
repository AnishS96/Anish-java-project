package aa;

public class Palindrome {
	public static void main(String[] args) {
		int s=1213;
		int rev=0;
		while(s!=0) {
			int n=s%10;
			rev=(rev*10)+n;
			s=s/10;
		}
		
		if(s==rev) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}
}
