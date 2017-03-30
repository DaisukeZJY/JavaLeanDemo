package com.Object.duotai;

public class Driver {
	
	/**
	 * 多态
	 * 表示父类类型变量指向一个子类类型的实例
	 * 如：Parent parent = new Child();
	 * 
	 * 能调用哪些方法以父类为准。
	 * 调用时执行什么代码以子类为准
	 * 
	 * 一句话：父类有什么方法，你就有什么方法，至于具体操作看你自己
	 * 
	 * */
	
	public void install() {
		System.out.println("installing.....");
	}
	
	public static void main(String[] args) {
		Driver driver = new LenovoDriver();
		driver.install();
		
		Driver driver2 = new DellDriver();
		driver2.install();
	}
}
