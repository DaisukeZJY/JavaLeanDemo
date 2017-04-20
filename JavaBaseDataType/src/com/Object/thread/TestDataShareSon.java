package com.Object.thread;
// 父子线程间的数据传递
public class TestDataShareSon extends Thread{
	private String userName; // 用来保存共享的用户名

	public TestDataShareSon(String userName) {
		super();
		this.userName = userName;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(userName);
	}
	
}
