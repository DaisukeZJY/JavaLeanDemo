package com.Object;

public class TestThis {
	
	String name;
	
	public void Test1(String name) {
		this.name = name;
	}
	
	public void Test2() {
		this.name = "daisuke";
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		// 设置当前TestThis属性name的值
		this.name = name;
	}
	
	
	public static void main(String[] args) {
		
		// =======this=====
		// 访问当前类的成员变量或者成员方法，或者构造器
		TestThis testThis = new TestThis();
		testThis.setName("daisuke11");
		System.out.println(testThis.name);
		testThis.Test2();
		System.out.println(testThis.name);
		
	}
}
