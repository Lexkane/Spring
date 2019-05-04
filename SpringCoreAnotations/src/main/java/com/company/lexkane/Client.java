
package com.company.lexkane;
import org.springframework.context.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;;


public class Client{
	
public static void main(String [] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(CollegeConfig.class);
		((AnnotationConfigApplicationContext) context).register(CollegeConfig.class);
		College college= context.getBean("college",College.class);
		System.out.println("The college object created by spring is :" +college);
		college.test();
		((AnnotationConfigApplicationContext) context).close();
	}
}