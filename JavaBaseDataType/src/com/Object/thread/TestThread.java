package com.Object.thread;

public class TestThread {
	/**
	 * 
	 * */
	
	public static void printDan() {
		for (int i = 1; i < 100; i += 2) {
			System.out.println(i);
		}
	}
	
	public static void printShuang() {
		for (int i = 0; i < 100; i += 2) {
			System.out.println(i);
		}
	}
	
	
	public static void main(String[] args) {
		
		// 按照顺序执行
//		TestThread.printShuang();
//		TestThread.printDan();
		
		// 如何要同时执行printShuang、printDan两个方法，就必须用两个线程来同时执行他们
//		TestThreadDan dan = new TestThreadDan();
//		TestThreadShuang shuang = new TestThreadShuang();
//		
//		dan.start();
//		shuang.start();
		
		TestRunnableDan runnableDan = new TestRunnableDan();
		// 将线程绑定一个任务
		Thread danThread = new Thread(runnableDan); 
		
		TestRunnableShuang runnableShuang = new TestRunnableShuang();
		Thread shuangtThread = new Thread(runnableShuang);
		
		danThread.start();
		shuangtThread.start();
		
	}
	
}
