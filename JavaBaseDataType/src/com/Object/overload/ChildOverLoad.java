package com.Object.overload;

public class ChildOverLoad extends ParentOverLoad{
	// 重写父类方法,重写之后，父类的方法相当于无效
	public void eat() {
		System.out.println("child eat");
	}
	
	public static void main(String[] args) {
		ChildOverLoad childOverLoad = new ChildOverLoad();
		childOverLoad.eat();
		System.out.println("child 性："+childOverLoad.name);
	}
}
