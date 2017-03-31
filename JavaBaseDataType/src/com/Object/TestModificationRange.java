package com.Object;

public class TestModificationRange {
	
	public String name;
	public void eat(){
		
	}
	
	/**
	 * public
	 * 1、可以修饰：类、成员变量、方法
	 * 2、能被所有类访问
	 * 3、访问范围最广
	 * */
	
	String name1;
	void eat1(){
		
	}
	/**
	 * default
	 * 1、可以修饰：类、成员变量、方法
	 * 2、当类或变量或方法没有任何修饰符时，默认是default
	 * 3、只有同一包内的类访问
	 * */
	
	protected String name2;
	protected void eat2(){
		
	}
	/**
	 * protected
	 * 1、可以修饰：成员变量、方法
	 * 2、只有子类（通过super）和同一包的类可以访问
	 * */
	
	private String name3;
	/**
	 * private
	 * 1、可以修饰：成员变量
	 * 2、只能本类访问(提供：get、set方法访问)
	 * */
	public String getName3() {
		return name3;
	}
	public void setName3(String name3) {
		this.name3 = name3;
	}
}
