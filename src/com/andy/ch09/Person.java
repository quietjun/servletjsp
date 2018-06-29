package com.andy.ch09;

public class Person {
	private String name;
	private int age;

	public Person() {}
	public String instanceMethod() {
		return "instance method 호출 됨.";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	

}
