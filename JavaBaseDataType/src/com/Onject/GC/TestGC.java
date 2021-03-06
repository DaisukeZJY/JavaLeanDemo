package com.Onject.GC;

public class TestGC {
	/**
	 * 任何一个变量指向实例都要占用内存，为了保证内存不会被撑爆：垃圾回收：GC
	 * 
	 * Carbage Collection:垃圾回收器
	 * 1、没有用的对象（没有®应用变量指向的对象）会被GC自动回收
	 * 2、什么时候回收？时间不确定，由JVM计算和控制
	 * 
	 * 常用方法：
	 * System.gc()方法
	 * 1、能建议JVM进行垃圾回收
	 * 2、但是不能强制垃圾回收
	 * 
	 * Finalize()方法
	 * 1、Object类有一个finalize方法，这个方法会在对象呗回收时自动被调用
	 * 2、任何对象都集成Object,所以。。
	 * */
	protected void finalize() throws Throwable{
		System.out.println("要被销毁了...");
	}
	
	public static void main(String[] args) throws Exception{
		for (int i = 0; i < 10; i++) {
			TestGC gc = new TestGC();
			System.gc();
		}	
	}
}
