package com.Object.thread;

public class TestDataShareParent extends Thread{
	private Integer ageInteger;

	public Integer getAgeInteger() {
		return ageInteger;
	}


	public void setAgeInteger(Integer ageInteger) {
		this.ageInteger = ageInteger;
	}
	
	public TestDataShareParent(Integer ageInteger) {
		super();
		this.ageInteger = ageInteger;
	}
}
