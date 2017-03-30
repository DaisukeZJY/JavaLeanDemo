package com.Object.abstracts;

// 抽象类
public abstract class AbstractParent {
	
	// 
	public void eat() {
		System.out.println("AbstractParent eat...");
	}
	
	// 抽象方法,不需要实现，声明即可
	public abstract void sleep() ;
	
	// 抽象方法,不需要实现，声明即可
	public abstract void run() ;
		
	// 抽象方法,不需要实现，声明即可
	public abstract void see() ;
	
	/**
	 * 特点：
	 * 1、抽象类中可以有非抽象方法
	 * 2、抽象类中可以没有抽象方法
	 * 3、抽象类不能被实例化
	 * 4、抽象类的子类：
	 * 			- 如果实现了父类的所有抽象方法，那么他可以是一个非抽象类。
	 * 			- 如果没有完全实现父类中的所有抽象方法，那么它必须是一个抽象类
	 * 
	 * 抽象的好处
	 * 1、由设计者定制类的结构
	 * 2、由开发者完成类的实现
	 * 3、分工合作，互不影响
	 * */

}
