package com.andy.ch11.json;

import com.google.gson.Gson;

public class GSONTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GSONTest gt = new GSONTest();
		gt.objToJSon();
		gt.arrayToJSon();
	}
	private void arrayToJSon(){
		int [] ints = {1,3,5,6,8,9,3,0,4,80};
		Gson gson = new Gson();
		String intStr = gson.toJson(ints);
		System.out.println(intStr);
		int [] reverse = gson.fromJson(intStr, int [].class);
		System.out.println(reverse.length);
	}
	
	private void objToJSon(){
		Member member = new Member(10, "andy");
		Gson gson = new Gson();
		String memberStr = gson.toJson(member);
		System.out.println(memberStr);
		
		Member reverse = gson.fromJson(memberStr, Member.class);
		System.out.println(reverse);
	}
	
	class Member{
		private int age;
		private String name;
		public Member(){}
		public Member(int age, String name) {
			super();
			this.age = age;
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		@Override
		public String toString() {
			return "Member [age=" + age + ", name=" + name + "]";
		}
		
	}
}
