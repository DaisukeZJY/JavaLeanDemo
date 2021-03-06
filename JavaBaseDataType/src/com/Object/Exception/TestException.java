package com.Object.Exception;

public class TestException {
	/**
	 * 
	 * 在Java中，每一个异常都是一个类，而所有的异常都有一个共同的父类
	 * java.lang.Exception
	 * 
	 * 异常抛出的层次：
	 * 如果Main方法调用A方法，A方法调用B方法：
	 * 1、如果B方法发生了异常，而又没有捕捉，就会抛给A方法
	 * 2、如果A方法也没有捕捉这个异常，就会抛给Main方法
	 * 3、如果Main方法中也没有捕捉这个异常，就会抛给JVM
	 * 4、如果JVM接收到这个异常，变会立即终止这个抛异常的程序
	 * 
	 * 方法抛出异常：
	 * 1、如果某个方法要求调用者一定要捕捉异常，那么就使用：方法抛出异常
	 * 
	 * 主动抛出异常：
	 * 前面都是系统自动抛出的，如果我们要主动抛出异常呢？：用代码主动抛出异常
	 * 
	 * java预定义的异常有很多，我们推荐：
	 * Exeption, NullPointerExeption, RuntimeExeption
	 * 
	 * 
	 * */
	
	// 方法抛出异常
	public void run() throws Exception{
		System.out.println("run");
	}
	
	// 主动抛出异常
	public void eat() throws Exception{
		Exception exception = new Exception("主动抛出的异常");
		throw exception;
	}
	
	// 抛出RuntimeExeption异常
	public void getruntimeExeption() throws RuntimeException{
		RuntimeException runtimeException = new RuntimeException("RuntimeExeption异常");
		throw runtimeException;
	}
	
	// 自定义异常类
	public void customExeption() throws Exception{
		TestCustomExeption customEx = new TestCustomExeption("你输入的密码错误");
		throw customEx;
	}
	
	
	// 捕捉异常
	public static void main(String[] args) {
//		try {
//			int i = 0;
//			int j = 5 / i;
//			System.out.println("程序没有抛出异常");
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//			// java.lang.ArithmeticException: / by zero
//		} finally {
//			// finally 无论怎样都会执行的
//			System.out.println("程序执行完毕");
//		}
		
		// 多异常处理
//		try {
////			int i = 0;
////			int j = 5 / i;
////			System.out.println("程序没有抛出异常");
//			
//			String string = null;
//			System.out.println(string.hashCode());
//			
//		} catch (ArithmeticException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		} catch (RuntimeException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		} finally {
//			System.out.println("程序执行完毕");
//		}
		
//		try {
//			TestException exception = new TestException();
////			exception.run();
////			exception.eat();
//			exception.getruntimeExeption();
//		}  catch (RuntimeException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		} catch (Exception e) { 
//			e.printStackTrace();
//		}finally {
//			// TODO: handle finally clause
//			System.out.println("程序执行完毕");
//		}
		
		
		// 自定义异常类
		try {
			TestException exception = new TestException();
			exception.customExeption();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			// TODO: handle finally clause
			System.out.println("程序执行完毕");
		}
		
		
	}
}
