package aa;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=0;
int a=10;
int b=15;
	//if(a==b || a>(num=--b)) {
		//System.out.println("ji");
//	}
    System.out.println(a+=b);
    System.out.println(a);
    System.out.println(a+b);
    int i=(a>b)?a:b;
    System.out.println(i);
    System.out.println((a>b)||(b>a));
	System.out.println(a<<b);
	System.out.println(a>>b);
	System.out.println(a&b);
	System.out.println(a|b);
	System.out.println((a>b)&&(a<b));
	//System.out.println(Integer.toBinaryString(10));
	}
}

