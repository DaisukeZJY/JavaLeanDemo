package com.Object.thread;

public class TestDataShareSon1 extends TestDataShareParent{

	public TestDataShareSon1(Integer ageInteger) {
		super(ageInteger);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			int result = this.getAgeInteger().intValue() + 1;
			System.out.println(result);
		}
	}
	
	
}
