package spring;

import  java.lang.System.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	
	public static void main(String []Args) {
		Employee eRef = new Employee();
		eRef.setEid(101);
		eRef.setName("John");
		eRef.setDept("R&D");
		eRef.setSalary(45000);
		eRef.setEmail("john@example.com");
		//System.out.println("eRef Details" + eRef);

	//BeanFactory
//		 ApplicationContext context = new ClassPathXmlApplicationContext("employeebean.xml");
//	 	Employee emp1 =(Employee) context.getBean("e1");
//		Employee emp2 = context.getBean("e2", Employee.class);
//
//		System.out.println("emp1:"+ emp1);
//		System.out.println("emp2:" + emp2);

		//Appliaction Context || Spring IOC Container

		ApplicationContext context=new ClassPathXmlApplicationContext("employeebean.xml");

	 	Employee emp1 =(Employee) context.getBean("e1");
		Employee emp2 = context.getBean("e1", Employee.class);

		System.out.println("emp1:"+ emp1);
		System.out.println("emp2:" + emp2);


	}
}
