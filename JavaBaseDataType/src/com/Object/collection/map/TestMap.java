package com.Object.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class TestMap {
	/**
	 * 键值对
	 * Map是一个键值对接口，子类实现推荐两个：HashMap, Hashtable
	 * 
	 * 区别：
	 * HashMap：线程不安全，效率高
	 * Hashtable：线程安全，效率低
	 * 
	 * */
	
	public static void main(String[] args) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		
		// 增加
		map.put("key", "value");
		map.put("username", "daisuke");
		map.put("age", 10);
		map.put("sex", true);
		
		// 删除
		map.remove("sex");
		
		// 修改
		map.put("age", 100);
		
		// 查询
		int age = (int) map.get("age");
		System.out.println("age:"+age);
		
		// 遍历
		Set<String> keySet = map.keySet();
		Iterator<String> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			String key = (String) iterator.next();
			Object valueObject = map.get(key);
			System.out.println("key:"+key+ "--"+"value:"+valueObject);
		}
		
	}
}
