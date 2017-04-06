package com.Object.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeSetPerson implements Comparable<Object>{
	
	public int age;
	
	/**
	 * 如果放到TreeSet中的元素不是String,而是我们自己写的person类，那么TreeSet
	 * 是根据什么原则来对多个person类进行排序的呢？
	 * */


	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		TestTreeSetPerson person = (TestTreeSetPerson)o;
		if (this.age > person.age) {
			return 1;
		} else if (this.age < person.age) {
			return -1;
		} else {
			return 0;
		}
	}
	
	/**
	 * 实现方式有两种：
	 * 1、让身体实现Comparable接口，并且实现这个接口提供的compareTo排序方法
	 * 2、额外写一个排序类，该类实现Comparator接口，并且在compare中实现排序
	 * 
	 * 然后TreeSet就能自动调用这个方法为我们排序了
	 * */
	
	/**
	 * 区别：
	 * Comparable：是有实体对象实现该接口，属于内部排序，也就是该对象本来具有的特性
	 * 
	 * Comparator：是需要另外写一个排序类实现该接口，数据外部排序，需要将该排序对象传入集合
	 * */
	
	public static void main(String[] args) {
		TestTreeSetPerson p1 = new TestTreeSetPerson();
		p1.age = 1;
		System.out.println(p1.toString());
		
		TestTreeSetPerson p2 = new TestTreeSetPerson();
		p2.age = 6;
		System.out.println(p2.toString());
		
		TestTreeSetPerson p3 = new TestTreeSetPerson();
		p3.age = 2;
		System.out.println(p3.toString());
		
		TreeSet<Object> sTreeSet = new TreeSet<Object>();
		sTreeSet.add(p1);
		sTreeSet.add(p2);
		sTreeSet.add(p3);
		
		Iterator<Object> iterator = sTreeSet.iterator();
		while (iterator.hasNext()) {
			TestTreeSetPerson person = (TestTreeSetPerson) iterator.next();
			System.out.println(person.age);
			System.out.println(person.toString());
		}
		
	}
	
	
}
