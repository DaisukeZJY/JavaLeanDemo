package com.Object;

import com.Object.extend.Parent;

public class TestSuper extends Parent{
	
	public TestSuper(String name) {
		super.name = name;
	}
	
	public String getName() {
		return super.name;
	}
	
	public static void main(String[] args) {
		// 访问父类的成员变量或者方法，或者构造器
		TestSuper testSuper = new TestSuper("daisuke");
		System.out.println(testSuper.getName());
		
	}
}
