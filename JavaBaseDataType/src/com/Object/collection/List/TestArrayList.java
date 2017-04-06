package com.Object.collection.List;

import java.util.ArrayList;

public class TestArrayList {
	/**
	 * ArrayList：可变长度的数组
	 * 1、向其中插入数据
	 * 2、删除数据
	 * 3、修改数据
	 * 4、查询数据
	 * */
	
	
	/**
	 * ArrayList、Vector和LinkedList的区别
	 * 
	 * 1、ArrayList、Vector实现的机制是数组
	 * 	 - 插入和删除元素时效率低
	 * 	 - 产找元素时效率高
	 * 2、LinkedList实现机制是链表
	 * 	 - 插入和删除元素时效率高
	 * 	 - 查找元素时效率低
	 * */
	
	/**
	 * ArrayList、Vector的区别
	 * ArrayList：线程不安全，效率高
	 * Vector：线程安全，效率低
	 * */
	
	
	
	public static void main(String[] args) {
		// 插入数据
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("daisuke");
		arrayList.add("alex");
		System.out.println(arrayList.toString());
		
		// 删除数据
//		arrayList.remove(0);
//		arrayList.remove("alex");
//		System.out.println(arrayList.toString());
		
		// 修改元素
		arrayList.set(1, "daisuke2");
		System.out.println(arrayList.toString());
		
		// 查询元素
		String string = arrayList.get(1);
		System.out.println(string);
		
		// 遍历
		for (int i = 0; i < arrayList.size(); i++) {
			String str = arrayList.get(i);
			System.out.println(str);
			
		}
		
		for (String str : arrayList) {
			System.out.println(str);
		}
		
		// 判断存在与否
		boolean b = arrayList.contains("alex");
		System.out.println(b);
	}
	
}
