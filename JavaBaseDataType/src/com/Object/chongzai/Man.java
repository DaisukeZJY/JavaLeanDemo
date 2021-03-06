package com.Object.chongzai;

public class Man {
	public void goHome(String name) {
		System.out.println(name+" go home!");
	}
	
	public void goHome(String name, String car) {
		System.out.println(name+" by "+car+" go home");
	}
	
	// 重载必须满足的条件
	/**
	 * 1、方法名称完全相同
	 * 2、方法的参数列表不同
	 * 	 -参数的数量不同
	 * 	 -相同文职的参数类型不同
	 * 	 -什么都不同
	 * 
	 * 注意：重载与方法的返回值无关
	 * */
	
	public static void main(String[] args) {
		Man man = new Man();
		man.goHome("daisuke");
		man.goHome("daisuke", "car");
	}
}
