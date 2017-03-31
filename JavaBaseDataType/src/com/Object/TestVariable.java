package com.Object;

public class TestVariable {
	/**
	 * 变量的声明周期
	 * 
	 * 1、在内存中，变量与实力分别存储在不同的控件中，然后变量指向实例
	 * 2、只有同类型的变量才能指向同类型实例
	 * 	Test t = new Test();
	 * 3、父类类型的变量可以指向子类类型的实例（多态）
	 * 	Parent p = new Child();
	 * 4、子类类型的变量可以指向父类的类型实例（强转）
	 * 	Parent p = new Parent();
	 * 	Child c = (Child)p;
	 * 5、多个变量可以志强同一个实例
	 * 	Test t = new Test();
	 * 	Test t1 = t;
	 * 	Test t2 = t;
	 * 6、一个变量最多只能质量一个实例，不能同时指向多个实例
	 * 
	 * 
	 * 
	 * 变量类型
	 * 1、成员变量：直接声明在内部第一层的变量
	 * 2、局部变量：声明在某个方法内部的变量
	 * 
	 * 
	 * 局部变量：
	 * 1、只能在他声明的外边第一层{}内有效
	 * 成员变量：
	 * 1、只要所在的对象没有被销毁，成员变量（属性）就存在
	 * 
	 * 注意：
	 * 1、所有的变量都是值传递
	 * 
	 * 
	 * */
	
	// 成员变量
	public String name = "daisuke";
	
	public static void main(String[] args) {
		// 局部变量
		int age = 10;
		System.out.println(age);
	}
	
}
