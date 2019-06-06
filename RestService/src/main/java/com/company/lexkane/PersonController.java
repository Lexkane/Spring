package com.company.lexkane;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class PersonController {
	Repository rep = new Repository();
	
	//@RequestMapping("/person")
	@GetMapping("/person")
	public Person person(@RequestParam(value="name",defaultValue="") String name) {
		return rep.personByName(name);
	}
	
	@PostMapping("/person")
	public Person personUpdate(
		@RequestParam(value="name",required=true)
		String name, 
		@RequestParam(value="age",required=true)
		int age){
			Person p = rep.personByName(name);
			if (p!=null) {
				p.setAge(age);
				return p;
		} else {
			return rep.addPerson(new Person(name,age));
		}
	}
	
}
