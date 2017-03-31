package com.Object;

public class TestObejct {
	/**
	 * Object是Java的所有类的祖先
	 * 默认情况下都自动继承Object
	 * 
	 * 常用方法：
	 * toString()
	 * equals()//比较方法
	 * hashCode()// 返回对象的存储物理地址
	 * finalize()
	 * 
	 * */
	String usernameString = "daisuke";
	
	public String toString() {
		return "我是："+this.usernameString;
	}
	
	public static void main(String[] args) {
		TestObejct testObejct1 = new TestObejct();
		System.out.println(testObejct1.toString());
		
		TestObejct testObejct2 = new TestObejct();
		System.out.println(testObejct1.equals(testObejct2));
		System.out.println(testObejct1.hashCode());
		System.out.println(testObejct2.hashCode());
	}
	
	
}
