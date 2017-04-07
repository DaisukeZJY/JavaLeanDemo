package com.Object.Exception;


// 自定义异常类，继承异常
public class TestCustomExeption extends RuntimeException{

	private static final long serialVersionUID = 1L;
	/**
	 * 自定义异常
	 * 
	 * 比如：登录时“密码错误异常”，怎么办？自定义异常类
	 * 
	 * */
	
	// 密码错误异常
	public TestCustomExeption(String msg) {
		super(msg);
	}
	public TestCustomExeption() {
		this("密码错误");
	}
	
	
}
