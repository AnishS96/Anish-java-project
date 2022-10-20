package aa;

import java.util.Scanner;

interface A {
	abstract void Residential();

	abstract void commerical();
}

class abc {
	void Resrural(int unit, int amount) {
		if (unit >= 0 && unit <= 100) {
			amount = unit * 0;
			System.out.println("amount for o-100 unit = " + amount);
		} else if (unit > 100 && unit <= 200) {
			amount = (unit - 100) * 2;
			System.out.println("amount for more than 100 unit is Rs." + amount);
		} else if (unit > 200 && unit <= 300) {
			amount = 100 * (int) 1.20 + (unit - 200) * 3;
			System.out.println("amount for more than 200 unit is Rs." + amount);
		} else if (unit > 300 && unit <= 400) {
			amount = 100 * (int) 1.20 + 100 * 2 + (unit - 300) * 4;
			System.out.println("amount for more than 300 unit is Rs." + amount);
		} else if (unit > 400 && unit <= 600) {
			amount = 100 * (int) 1.20 + 100 * 2 + 100 * 3 + (unit - 400) * 5;
			System.out.println("amount for more than 400 unit is Rs." + amount);
		}
	}

	void Resuraban(int unit, int amount) {
		if (unit >= 0 && unit <= 100) {
			amount = unit * 0;
			System.out.println("amount for o-100 unit = " + amount);
		} else if (unit > 100 && unit <= 200) {
			amount = (unit - 100) * 3;
			System.out.println("amount for more than 100 unit is Rs." + amount);
		} else if (unit > 200 && unit <= 300) {
			amount = 100 * (int) 1.20 + (unit - 200) * 4;
			System.out.println("amount for more than 200 unit is Rs." + amount);
		} else if (unit > 300 && unit <= 400) {
			amount = 100 * (int) 1.20 + 100 * 4 + (unit - 300) * 6;
			System.out.println("amount for more than 300 unit is Rs." + amount);
		} else if (unit > 400 && unit <= 600) {
			amount = 100 * (int) 1.20 + 100 * 4 + 100 * 6 + (unit - 400) * 7;
			System.out.println("amount for more than 400 unit is Rs." + amount);
		}
	}

	void Resmetro(int unit, int amount) {
		if (unit >= 0 && unit <= 100) {
			amount = unit * 0;
			System.out.println("amount for o-100 unit = " + amount);
		} else if (unit > 100 && unit <= 200) {
			amount = (unit - 100) * 4;
			System.out.println("amount for more than 100 unit is Rs." + amount);
		} else if (unit > 200 && unit <= 300) {
			amount = 100 * (int) 1.20 + (unit - 200) * 5;
			System.out.println("amount for more than 200 unit is Rs." + amount);
		} else if (unit > 300 && unit <= 400) {
			amount = 100 * (int) 1.20 + 100 * 4 + (unit - 300) * 7;
			System.out.println("amount for more than 300 unit is Rs." + amount);
		} else if (unit > 400 && unit <= 600) {
			amount = 100 * (int) 1.20 + 100 * 2 + 100 * 3 + (unit - 400) * 9;
			System.out.println("amount for more than 400 unit is Rs." + amount);
		}
	}

	void Respanchayat(int unit, int amount) {
		if (unit >= 0 && unit <= 100) {
			amount = unit * 0;
			System.out.println("amount for o-100 unit = " + amount);
		} else if (unit > 100 && unit <= 200) {
			amount = (unit - 100) * 1;
			System.out.println("amount for more than 100 unit is Rs." + amount);
		} else if (unit > 200 && unit <= 300) {
			amount = 100 * (int) 1.20 + (unit - 200) * 2;
			System.out.println("amount for more than 200 unit is Rs." + amount);
		} else if (unit > 300 && unit <= 400) {
			amount = 100 * (int) 1.20 + 100 * 2 + (unit - 300) * 3;
			System.out.println("amount for more than 300 unit is Rs." + amount);
		} else if (unit > 400 && unit <= 600) {
			amount = 100 * (int) 1.20 + 100 * 2 + 100 * 3 + (unit - 400) * 4;
			System.out.println("amount for more than 400 unit is Rs." + amount);
		}
	}

	void comrural(int unit, int amount) {
		if (unit >= 0 && unit <= 100) {
			amount = unit * 0;
			System.out.println("amount for o-100 unit = " + amount);
		} else if (unit > 100 && unit <= 200) {
			amount = (unit - 100) * 7;
			System.out.println("amount for more than 100 unit is Rs." + amount);
		} else if (unit > 200 && unit <= 300) {
			amount = 100 * (int) 1.20 + (unit - 200) * 9;
			System.out.println("amount for more than 200 unit is Rs." + amount);
		}

		else if (unit > 300 && unit <= 400) {
			amount = 100 * (int) 1.20 + 100 * 2 + (unit - 300) * 10;
			System.out.println("amount for more than 300 unit is Rs." + amount);
		} else if (unit > 400 && unit <= 600) {
			amount = 100 * (int) 1.20 + 100 * 2 + 100 * 3 + (unit - 400) * 12;
			System.out.println("amount for more than 400 unit is Rs." + amount);
		}
	}

	void comuraban(int unit, int amount) {
		if (unit >= 0 || unit <= 100) {
			amount = unit * 0;
			System.out.println("amount for o-100 unit = " + amount);
		} else if (unit > 100 && unit <= 200) {
			amount = (unit - 100) * 7;
			System.out.println("amount for more than 100 unit is Rs." + amount);
		} else if (unit > 200 && unit <= 300) {
			amount = 100 * (int) 1.20 + (unit - 200) * 9;
			System.out.println("amount for more than 200 unit is Rs." + amount);
		}

		else if (unit > 300 && unit <= 400) {
			amount = 100 * (int) 1.20 + 100 * 2 + (unit - 300) * 10;
			System.out.println("amount for more than 300 unit is Rs." + amount);
		} else if (unit > 400 && unit <= 600) {
			amount = 100 * (int) 1.20 + 100 * 2 + 100 * 3 + (unit - 400) * 13;
			System.out.println("amount for more than 400 unit is Rs." + amount);
		}

	}

	void commetro(int unit, int amount) {
		if (unit >= 0 && unit <= 100) {
			amount = unit * 0;
			System.out.println("amount for o-100 unit = " + amount);
		} else if (unit > 100 && unit <= 200) {
			amount = (unit - 100) * 10;
			System.out.println("amount for more than 100 unit is Rs." + amount);
		} else if (unit > 200 && unit <= 300) {
			amount = 100 * (int) 1.20 + (unit - 200) * 11;
			System.out.println("amount for more than 200 unit is Rs." + amount);
		}

		else if (unit > 300 && unit <= 400) {
			amount = 100 * (int) 1.20 + 100 * 2 + (unit - 300) * 13;
			System.out.println("amount for more than 300 unit is Rs." + amount);
		} else if (unit > 400 && unit <= 600) {
			amount = 100 * 1 + 100 * 2 + 100 * 3 + (unit - 400) * 15;
			System.out.println("amount for more than 400 unit is Rs." + amount);
		}
	}

	void companchayat(int unit, int amount) {
		if (unit >= 0 && unit <= 100) {
			amount = unit * 0;
			System.out.println("amount for o-100 unit = " + amount);
		} else if (unit > 100 && unit <= 200) {
			amount = (unit - 100) * 1;
			System.out.println("amount for more than 100 unit is Rs." + amount);
		} else if (unit > 200 && unit <= 300) {
			amount = 100 * (int) 1.20 + (unit - 200) * 2;
			System.out.println("amount for more than 200 unit is Rs." + amount);
		}

		else if (unit > 300 && unit <= 400) {
			amount = 100 * (int) 1.20 + 100 * 2 + (unit - 300) * 3;
			System.out.println("amount for more than 300 unit is Rs." + amount);
		} else if (unit > 400 && unit <= 600) {
			amount = 100 * (int) 1.20 + 100 * 2 + 100 * 3 + (unit - 400) * 4;
			System.out.println("amount for more than 400 unit is Rs." + amount);
		}
	}

}

public class Ebbill extends abc implements A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Residential or commercial");
		String b = sc.nextLine();

		Ebbill cb = new Ebbill();
		if (b.equals("Residential")) {
			cb.Residential();
		} else if (b.equals("commercial")) {
			cb.commerical();
		}

	}

	public void Residential() {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("rural | urban | metro | panchayat");

		Ebbill z = new Ebbill();
		String a = sc1.nextLine();
		System.out.println("enter the unit ");
		int unit = sc1.nextInt();
		int amount = 0;
		if (a.equals("rural")) {
			z.Resrural(unit, amount);
		} else if (a.equals("urban")) {
			z.Resuraban(unit, amount);
		} else if (a.equals("metro")) {
			z.Resmetro(unit, amount);
		} else if (a.equals("panchayat")) {
			z.Respanchayat(unit, amount);
		}
	}

	public void commerical() {
		Scanner sc2 = new Scanner(System.in);
		abc z1 = new abc();
		System.out.println("rural | urban | metro | panchayat");
		String x = sc2.nextLine();
		System.out.println("enter the unit ");
		int unit = sc2.nextInt();
		int amount = 0;
		if (x.equals("rural")) {
			z1.comrural(unit, amount);
		} else if (x.equals("urban")) {
			z1.comuraban(unit, amount);
		} else if (x.equals("metro")) {
			z1.commetro(unit, amount);
		} else if (x.equals("panchayat")) {
			z1.companchayat(unit, amount);
		}

	}

}
