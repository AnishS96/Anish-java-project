package aa;

public class Amstrong {
public static void main(String[] args) {
	int a=0,b,c;
	int n=153;
	c=n;
	while(n>0) {
		b=n%10;
		n=n/10;
		a=a+(b*b*b);
		
	}
	if(c==a) {
		System.out.println(c+" "+"Amstrong number");
	}
	else {
		System.out.println(c+" "+"Not Amstrong number");
	}
}
}
