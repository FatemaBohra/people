/**
 * Represents a person
 * @author fatemabohra
 *
 */
public class Person {
	//instance variable
	
	/*
	 * name of person
	 */
	String name;
	
	/*
	 * age of person
	 */
	int age;
	
	/**
	 * creates a person with given name and age.
	 * @param name of person
	 * @param age of person
	 */
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	/**
	 * Compares the instances of person based on their names.
	 * If people have two same name then they are equal.
	 */
	public boolean equals(Object something) {
		
		//cast given object to person
		Person otherPerson = (Person) something;
		
		//returns true if the name of 2 people are same.
		return this.name.equals(otherPerson.name);
	}

}
