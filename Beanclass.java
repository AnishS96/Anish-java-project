package aa;

import java.io.Serializable;

public class Beanclass implements Serializable {
	private int id;
	private String name;
	private int Salary;
	public Beanclass() {
		
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setSalary(int Salary) {
		this.Salary=Salary;
	}
	public int getSalary() {
		return Salary;
	}
	public static void main(String[] args) {
		Beanclass vp=new Beanclass();
		vp.setId(5678);
		vp.setName("apple,zoho");
		vp.setSalary(15000);
		System.out.println("id is"+vp.getId());
		System.out.println("salary is"+vp.getSalary());
		System.out.println("Name is"+" "+vp.getName());
		
	}
	

}
