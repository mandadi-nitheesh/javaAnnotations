package com.example.demo.anotations;

import org.springframework.beans.factory.annotation.Value;

public class Demo {

	private String name;
	private String interestedcourse;
	private String hobby;
	
	
	@Value("nitheesh")
	public void setName(String name) {
		this.name = name;
	}
	
	@Value("java")
	public void setInterestedcourse(String interestedcourse) {
		this.interestedcourse = interestedcourse;
	}
	
	@Value("cricket")
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	
	
	public void display() {
		
		System.out.println(name+" : "+interestedcourse+" : "+hobby+" ");
	}
	
	
	
	
}
