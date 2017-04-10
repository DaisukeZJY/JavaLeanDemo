package com.Object.JDK6;

import java.util.HashMap;
import java.util.Set;

public class TestJDK6 {
	
	/**
	 * 可变参数
	 * 注意：
	 * 1、可变参数只能最后一个参数
	 * 2、并且同一个方法只能有一个可变参数
	 * */ 
	public static void run(int age, String ... paramList) {
		String[] list = paramList;
//		for (int i = 0; i < list.length; i++) {
//			String string = list[i];
//			System.out.println(string);
//		}
		
		// for-each
		for (String string : list) {
			System.err.println(string);
		}
	}
	
	public static void age(int ...ageList) {
		if (ageList.length == 0) {
			System.out.println("没有传入参数");
		} else {
			for (int i = 0; i < ageList.length; i++) {
				int j = ageList[i];
				System.out.println(String.valueOf(j));
			}
			
			
		}
	}
	
	// 枚举
	public enum Sex{
		man,
		girl,
		other
	}
	
	public static void youSex(Sex sex) {
		System.out.println(sex);
	}
	
	
	
	public static void main(String[] args) {
		TestJDK6.run(100, "daisuke", "alex", "aaaa");
//		TestJDK6.age(2,3,4,5);
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("1", "daisuke");
		map.put("2", "alex");
		map.put("3", "rose");
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			System.out.println("key:"+key);
			System.out.println("value:"+map.get(key));
		}
		
		
		TestJDK6.youSex(Sex.girl);
		
	}
}
