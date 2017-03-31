package com.Object;

// 被final修饰的类，不能被继承，也就是没有子类
public final class TestFinal {

	/**
	 * final
	 * 1、修饰：类、方法、变量
	 * */
	
	// 相当于常量，第一次赋值之后，就不可以改变他的值
	public final String name = "daisuke";
	
	// 当TestFinal没有使用final修饰时，可以有子类，
	// 然后eat方法不能被子类重写或者覆盖了
	public final void eat() {
		System.out.println("eat");
	}
	
}
