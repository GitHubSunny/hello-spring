package com.sun.spring.hello;

public class GreetingServiceImp implements GreetingService {
	
	private String greeting;
	
	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public GreetingServiceImp(){
		
	}
	
	public GreetingServiceImp(String greeting){
		this.greeting=greeting;
	}

	public void sayGreeting() {
		System.out.println(this.greeting);
	}
	
	

}
