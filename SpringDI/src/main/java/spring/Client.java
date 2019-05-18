package spring;

import org.sprinrgframework.*;

public class Client {

	
	public static void main(String []Args) {
		Employee eRef=new Employee();
		eRef.setEid(101);
		eRef.setName("John");
		eRef.setDept("R&D");
		eRef.setSalary(45000);
		eRef.setEmail("john@example.com");
		System.out.println("eRef Details"+eRef);	
	}
	
	ApplicationContext context= new ClassPathXmlApplicationContext('employeebean.xml');
	Employee emp1=(Employee)context.getBean("e1")
	Employee emp2=context.getBean("e2",Employee.class)
			
	
}
