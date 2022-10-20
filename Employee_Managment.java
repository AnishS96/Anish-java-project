package aa;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import java.util.Map;
import java.util.Scanner;

public class Employee_Managment implements Comparable<Employee_Managment> {
	String employee_name;
	int employee_id;
	String DOB;
	String DOJ;
	int salary;

	Employee_Managment(String employee_name, int employee_id, String DOB, String DOJ, int salary) {
		this.employee_name = employee_name;
		this.employee_id = employee_id;
		this.DOB = DOB;
		this.DOJ = DOJ;
		this.salary = salary;
	}

	public String toString() {
		return employee_name + " " + employee_id + " " + DOB + " " + DOJ + " " + salary;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the key = ");
		int n = sc.nextInt();

		ArrayList<Employee_Managment> mp = new ArrayList<Employee_Managment>();
		mp.add(new Employee_Managment("arun", 101, "02-05-2000", "20-11-2020", 10000));
		mp.add(new Employee_Managment("arytjun", 105, "9-5-2001", "20-11-2022", 20000));
		mp.add(new Employee_Managment("arjhdftun", 103, "14-05-2002", "20-11-2021", 30000));
		mp.add(new Employee_Managment("krun", 104, "12-8-2003", "20-11-2019", 40000));
		mp.add(new Employee_Managment("brun", 102, "1-9-2004", "20-11-2018", 50000));

		for (Employee_Managment me : mp) {
			if (n > me.employee_id) {
				System.out.println(me.employee_name + "  " + me.salary + " " + me.DOB + " " + me.employee_id);

			}
		}
	}

	@Override
	public int compareTo(Employee_Managment o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
