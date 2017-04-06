package com.Object.fengzhuangLei;

public class TestFengZhuangLei {
	public static void main(String[] args) {
		// int - >Integer
		int i = 5;
		Integer integer = new Integer(i);
		
		// Integer -> int
		Integer integer2 = new Integer(5);
		int j = integer2.intValue();
		
		
		// Long -> long
		long l = 8;
		Long long1 = new Long(l);
		
		Long long2 = new Long(10);
		long l1 = long2.longValue();
		
		// Double -> double
		double d1 = 10.2;
		Double double1 = new Double(d1);
		
		Double double2 = new Double(19.9);
		double d2 = double2.doubleValue();
		
		
	}
}
