package com.Object;

public class TestNeiBuLei {
	/**
	 * 内部类：将一个类申明到另一个类的肚子里
	 * 1、外面的类叫外部类
	 * 2、里面的类叫内部类
	 * 
	 * 为何需要内部类：某些类，只能在某个类的肚子里使用，不能在外部使用，
	 * 而且也不希望外部知道什么能访问他，那么就把这个类定义为某个类的内部类
	 * 
	 * 非静态内部类
	 * 1、可以访问外部类的成员变量和方法
	 * 3、可以访问外部类的甚至private的变量和方法
	 * 
	 * */
	private String usernameString = "dasike";
	
	public void printIner() {
		// 使用内部类
		Inner inner = new Inner();
		inner.doInner();
	}
	
	// 声明内部类
	public class Inner {
		// 内部类的方法
		public void doInner() {
			// 访问外部类的成员属性
			System.out.println(TestNeiBuLei.this.usernameString);
		}
	}
	
	/**
	 * 静态内部类
	 * 1、可以访问外部类的静态成员变量和方法
	 * 3、可以访问外部类的甚至private的静态变量和方法
	 * */
	private static int age = 10;
	
	public static class StaticInner {
		public void doInner() {
			System.out.println(TestNeiBuLei.age);
		}
	}
	
	public void printStaticIner() {
		// 使用内部类
		StaticInner inner = new StaticInner();
		inner.doInner();
	}
	
	public static void main(String[] args) {
		TestNeiBuLei lei = new TestNeiBuLei();
		lei.printIner();
		lei.printStaticIner();
	}
	
}
