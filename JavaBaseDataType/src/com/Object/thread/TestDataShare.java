package com.Object.thread;

public class TestDataShare {

	public static void main(String[] args) {
		Integer integer = new Integer(10);
		TestDataShareSon1 son1 = new TestDataShareSon1(integer);
		son1.start();
		
		TestDataShareSon2 son2 = new TestDataShareSon2(integer);
		son2.start();
		
	}
}
