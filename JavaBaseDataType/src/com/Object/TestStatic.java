package com.Object;

public class TestStatic {
	/**
	 * static
	 * 1、静态
	 * 2、可以修饰：成员变量、方法
	 * 
	 * static修饰的变量：
	 * 1、变量不在与类的实例（对象绑定），与类型绑定
	 * 2、某个类的所有实例共享同一个变量的实例
	 * 调用方式：Test.name = "daisuke";
	 * 
	 * static修饰的方法
	 * 1、方法不在与类的实例绑定，而与类型绑定
	 * 
	 * */
	
	public static void eat() {
		System.out.println("static eat...");
	}
	

	/**
	 * static
	 * 修饰变量：做全局变量
	 * 修饰方法：方便方法的调用
	 * 
	 * 注意：static修饰的静态方法不能调用非静态变量
	 * */
	public String name = "dausuke";
	public static void run() {
		// static修饰的静态方法不能调用非静态变量
//		System.out.println(this.name);
	}
	
	
	public static void main(String[] args) {
//		TestStaticAndFinal testStaticAndFinal = new TestStaticAndFinal();
		TestStatic.eat();
	}
	
	
	
	
}
