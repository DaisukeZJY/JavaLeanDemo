package com.Object.collection.set;

import java.util.Iterator;
import java.util.TreeSet;
//具有元素自用排序功能
public class TestTreeSet {
	
	/**
	 * 如果放到TreeSet中的元素不是String,而是我们自己写的person类，那么TreeSet
	 * 是根据什么原则来对多个person类进行排序的呢？
	 * */
	
	
	
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>();
		set.add("3");
		set.add("2");
		set.add("3");
		set.add("6");
		set.add("4");
		set.add("1");
		
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
	}
}
