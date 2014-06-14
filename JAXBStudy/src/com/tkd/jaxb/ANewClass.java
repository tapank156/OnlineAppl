package com.tkd.jaxb;

/*Just a comment */

public class ANewClass {
	private String name;
	private int salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public ANewClass(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "ANewClass [name=" + name + ", salary=" + salary + "]";
	}	
}
