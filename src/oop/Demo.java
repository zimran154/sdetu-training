package oop;

class Person{
	String name;
	String email;
	String phone;
	
	void walk(){
		System.out.println(name + " is walking.");
	
	}
	
	void eat(){
		System.out.println(email);
		
	}
	
	void sleep(){
		System.out.println(name +" is sleeping");
		
	}
	
}

public class Demo {
	
	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name = "joe";
		person1.email = "joe@testmail.com";
		person1.phone = "2344324321";
		
		person1.walk();
		person1.eat();
		person1.sleep();
		
		Person person2 = new Person();
		person2.name = "Sarah";
		person2.email = "Sarah@testmail.com";
		person2.phone = "3212345432";
		
		person2.walk();
		person2.eat();
		person2.sleep();
		
		
		/*
		//Person-
		
		//Attributes, variables, adjectives, descriptors
		String name = "Joe";
		String email = "joe@testmail.com";
		String phone = "2342342545";
		
		//Action, activity, behavior
		//System.out.println(name + " is walking.");
		walking(name);
		System.out.println(name + " is eating.");
		
		//What is we wanted to do this for another person?
		String name2 = "Sarah";
		String email2 = "Sarah@testmail.com";
		String phone2 = "1233211234";		
		
		//Action, activity, behavior
		//System.out.println(name2 + " is walking.");
		walking(name2);
		System.out.println(name2 + " is eating");
	}
	//Enhance by adding functions to minimize code
	static void walking(String name) {
		System.out.println(name + " is walking");
		*/
		
	}

}
