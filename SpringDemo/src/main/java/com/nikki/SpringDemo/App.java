package com.nikki.SpringDemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
    	
    	ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
    	
    	Employee emp = (Employee)factory.getBean("employee");
    	
    	emp.work();
    	
    	System.out.println(emp.getName());
    }
}
