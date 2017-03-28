package com.Object.extend;

public class Child extends Parent{
	public static void main(String[] args) {
		Child child = new Child();
		System.out.println("子类也吃东西"+ child.name);
		child.eat();
		// 子类也吃东西父类属性名称
		// 父类吃东西
		
		// =======继承=====
		/*
		 * 可以看出子类并没有声明属性或者放啊，却可以调用，因为继承了父类，拥有父类的属性和方法
		 * 
		 * 好处：让开发者轻松定义基本的类模块
		 * 		避免重复代码
		 * 		增强系统的可维护性
		 * */
		
		
		
	}
}
