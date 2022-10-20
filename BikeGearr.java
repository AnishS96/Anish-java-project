package aa;

import java.util.Scanner;

public class BikeGearr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the gear.....");
		int n = sc.nextInt();
	if(n==1) {
			cars.gear1();
	}
	else if(n==2) {
		cars1.gear2();
	}
	else if(n==3) {
		cars2.gear3();
	}
		
		}

	}



class cars extends BikeGearr {
	
public static void gear1() {
	System.out.println("your speed is 1 to 10");
	System.out.println("do you want to apply break?  1.Yes 2.No");
		 Scanner sc = new Scanner(System.in);
		 String s = sc.next();
		if (s.equalsIgnoreCase("yes")) {
			System.out.println("speed has been reduced to zero");
		}

	}

}

class cars1 extends BikeGearr {

	static void gear2() {
		System.out.println("your speed is at 10 to 20");
		System.out.println("if you want to apply break?  press Yes");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		if (s.equalsIgnoreCase("yes")) {
			cars.gear1();
		}

	}
}

class cars2 extends BikeGearr {
	

	static void gear3() {
		System.out.println("your speed is at 20 to 30");
		System.out.println("if you want to apply break?  press Yes ");
		 Scanner sc = new Scanner(System.in);
		 String s = sc.next();
		if (s.equalsIgnoreCase("yes")) {
			cars1.gear2();
		}
	}
}
