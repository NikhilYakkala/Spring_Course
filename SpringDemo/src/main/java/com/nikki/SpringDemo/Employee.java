package com.nikki.SpringDemo;

public class Employee {

	private String name;
	
	private Laptop laptop;
	
	public Laptop getLaptop() {
		return laptop;
	}

	

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}



	public Employee(String name) {
		this.name = name;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		
		this.name = name;
	}



	public void work()
	{
		
		System.out.println("Employee is working....");
		
		laptop.work();
		
	}
	
	
	
}
