package com.Object.interfaces;

public interface PrentInterface {
	/**
	 * 接口：
	 * 1、可以看成一个只拥有方法声明，没有方法实现的类
	 * 2、与抽象类相似
	 * 3、但是接口里的所有方法都不可以有现实
	 * 4、而接口拥有“实现类”来实现其中的各个方法
	 * */
	
	// 接口方法
	public void eat() ;
	public void run() ;
	public void sleep() ;
	
	/**
	 * 接口的特性：
	 * 1、一个类可以同时实现多个接口
	 * 2、一个皆苦也可以拥有多个现实类
	 * 3、一个类，如果没有完全实现某个接口的所有方法，那么，这个类必须是抽象类
	 * 4、皆苦不可以被实例化
	 * 
	 * 接口的命名规范：
	 * 1、开头大写I
	 * 2、后面与类的命名规范相同
	 * 3、如：IUserDao
	 * 
	 * 接口的实现类类命名规范
	 * 1、去掉开头I
	 * 2、或者去掉开头I，且在后面加上Impl
	 * 3、如：UserDao 或 UserDaoImpl
	 * */
	
	
}
