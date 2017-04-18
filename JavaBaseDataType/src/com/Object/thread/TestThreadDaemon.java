package com.Object.thread;

public class TestThreadDaemon extends Thread{
	// 设置守护线程
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("我还活着");
		}
	}
	
	public static void main(String[] args) {
		TestThreadDan dan = new TestThreadDan();
		TestThreadDaemon daemon = new TestThreadDaemon();
		// 设置当前线程为守护线程
		daemon.setDaemon(true); 
		
		daemon.start();
		dan.start();
		
		// 如果没有设置daemon.setDaemon(true); 一直在执行System.out.println("我还活着");
		
	}
	
}
