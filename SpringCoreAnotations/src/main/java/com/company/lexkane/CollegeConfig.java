package com.company.lexkane;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ComponentScan(basePackages="com.company.lexkane")
@PropertySource ("college-info.properties")
public class CollegeConfig {
	
/*	
	@Bean
	public Teacher mathTeacherBean() {
		return new MathTeacher();
	}
	@Bean Principal principalBean() {
		return new Principal();
	}
	
	@Bean
	public College collegeBean() {
	College college = new College();
	college.setPrincipal(principalBean());
	return college;
	}
*/
	
}
