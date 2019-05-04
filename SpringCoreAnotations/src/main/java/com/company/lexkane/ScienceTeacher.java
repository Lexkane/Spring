package com.company.lexkane;
import org.springframework.stereotype.*;

@Component
public class ScienceTeacher implements Teacher {

	@Override
	public void teach() {
		System.out.println("I am Science Teacher");

	}

}
