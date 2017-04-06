package com.Object.collection;

import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {
	
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		// 增加元素
		hashSet.add("daisuke");
		hashSet.add("daisuke1");
		hashSet.add("daisuke2");
		hashSet.add("daisuke3");
		System.out.println(hashSet.toString());
		
		// 删除元素
		hashSet.remove("daisuke");
		
		// 修改元素。没有修改方法。可用先删除，再插入
		hashSet.remove("daisuke");
		hashSet.add("daisuke1");
		System.out.println(hashSet.toString());
		
		// 查询元素
		// Set没有查询元素的房，建议从Set的第一个元素一直遍历到要查询的那个元素。
		
		// 遍历
		Iterator<String> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
	}
}
