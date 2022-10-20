package aa;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class ATM {

	static int amomunt = 9000;

	static void FastWithdrawal() {
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("enter the pin");
		int pin = sc1.nextInt();
		if (pin == 789) {

			System.out.println("choice of amount 1.2000 2.3000 3.4000 4.5000 5.6000 ");
			int ac = sc1.nextInt();

			switch (ac) {
			case 1:
				int b = 2000;
				if (b == 2000) {
					amomunt = amomunt - 2000;
					System.out.println("remaining amount=Rs." + amomunt);
					break;
				} else {
					System.out.println("amount  not dispense");
				}
			case 2:
				int c = 3000;
				if (c == 3000) {
					amomunt = amomunt - 3000;
					System.out.println("amount dispense" + " remaining amount=Rs." + amomunt);
					break;
				} else {
					System.out.println("amount  not dispense");
				}
			case 3:
				int d = 4000;
				if (d == 4000) {
					amomunt = amomunt - 4000;
					System.out.println("amount dispense" + " remaining amount=Rs." + amomunt);
					break;
				} else {
					System.out.println("amount  not dispense");
				}
			case 4:
				int e = 5000;
				if (e == 5000) {
					amomunt = amomunt - 5000;
					System.out.println("amount dispense" + " remaining amount=Rs." + amomunt);
					break;
				} else {
					System.out.println("amount  not dispense");
				}
			case 5:
				int f = 6000;
				if (f == 6000) {
					amomunt = amomunt - 6000;
					System.out.println("amount dispense" + " remaining amount=Rs." + amomunt);
					break;
				} else {
					System.out.println("amount  not dispense");

				}
			}
		} else {
			System.out.println("wrong pin");
		}
	}
}

	class withdraw extends ATM {

		static void Withdrawal() {
			Scanner sc1 = new Scanner(System.in);
			System.out.println("enter the pin");
			int pin = sc1.nextInt();
			int balance = 10000;

			if (pin == 789) {
				System.out.println("enter the amount : ");
				int ac = sc1.nextInt();
				int g = ac % 100;
				if (ac > 100 && ac < 10000 && g == 00) {
					balance = balance - ac;
					System.out.println("remaining balance : Rs. " + balance);
				}

				else {
					System.out.println("amount exceeds limit");
				}
			} else {
				System.out.println("wrong pin");
			}
		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Welcome to Our ATM service");
			System.out.print("options - 1.FastWithdrawal  2.NormalWithdrawal ");
			int s = sc.nextInt();

			switch (s) {
			case 1:
				FastWithdrawal();
				break;
			case 2:
				Withdrawal();
				break;

			}
		}
	}

