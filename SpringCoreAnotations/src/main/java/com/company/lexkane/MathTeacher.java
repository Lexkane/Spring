package com.company.lexkane;

import org.springframework.stereotype.*;
import org.springframework.context.annotation.Primary;


@Component
@Primary
public class MathTeacher implements Teacher {

	@Override
	public void teach() {
		System.out.println("I am Math Teacher");

	}

}
