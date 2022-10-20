package aa;

class Att extends Thread{
synchronized public void run() {
	int a=5;
	int b=5;
	int c;
	System.out.println("Addition"+(c=(a+b)));
 }
}
class Subtract extends Thread{
	synchronized	public void run() {
		int a=5;
		int b=2;
		int c;
		System.out.println("subtract"+(c=(a-b)));
	}
}
class Multipl extends Thread{
	synchronized public void run() {
		int a=5;
		int b=2;
		int c;
		System.out.println("multiply"+(c=(a*b)));
	}
}
class Threading  extends Thread{
	synchronized public void run() {
		int a=5;
		int b=2;
		int c;
		System.out.println("divide"+(c=(a/b)));
	}
}



