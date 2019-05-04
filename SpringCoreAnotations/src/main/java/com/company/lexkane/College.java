package com.company.lexkane;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class College{


	
private String collegeName;

@Required
@Value("${college.Name}")
public void setCollegeName(String collegeName) {
	this.collegeName = collegeName;
}


@Autowired
private Principal principal;

@Autowired
@Qualifier("scienceTeacher")
private Teacher teacher;



public College(Principal principal) {
	this.principal=principal;
	
}

public void test() {
	principal.principalInfo();
	System.out.println("Testing principal");
}

public College() {}

public Principal getPrincipal() {
	return principal;
}


public void setPrincipal(Principal principal) {
	System.out.println("Using set principal method");
	this.principal = principal;
}

}