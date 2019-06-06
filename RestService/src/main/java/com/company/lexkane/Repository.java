package com.company.lexkane;

import java.util.Hashtable;
import java.util.Map;

public class Repository {

	static Map<String, Person> persons= new Hashtable<>();
	
	static {
		persons.put("Alexander",new Person("Alexander",35));
		persons.put("Victor",new Person("Victor",35));
		persons.put("Markus",new Person("Markus",35));
	}
	public Person personByName(String name) {
		return persons.get(name);
	}
	public Person addPerson(Person p) {
		persons.put(p.getName(), p);
		return p;
	}
	
}
