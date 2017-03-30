package com.Object.interfaces;

public class ChildImplements implements PrentInterface{
	// 现实接口的所有方法
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("ChildImplements eat");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("ChildImplements run");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("ChildImplements sleep");
	}
	
	public static void main(String[] args) {
		ChildImplements childImplements = new ChildImplements();
		childImplements.eat();
	}

}
