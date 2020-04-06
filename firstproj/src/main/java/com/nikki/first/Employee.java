package com.nikki.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	@Autowired
	Laptop lap;
	
	public void work()
	{
		
		lap.working();
		
	}
	

}
