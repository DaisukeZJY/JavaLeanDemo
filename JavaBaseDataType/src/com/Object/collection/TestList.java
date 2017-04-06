package com.Object.collection;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

public interface TestList extends Collection<Object>{
	// 根据索引取得元素
	public abstract Object get(int i);
	
	// 在指定位置（索引）处插入新的元素
	public abstract Object set(int i, Object obj);
	
	// 在list的尾部插入新的元素
	public abstract Object add(int i, Object obj);
	
	// 删除指定位置（索引）处的元素
	public abstract Object remove(int i);
	
	// 取得指定对象的最开始的索引位置
	public abstract int indexOf(Object obj);
	
	// 取得指定对象的最后的索引位置
	public abstract int lastIndexOf(Object obj);
	
	// list提供的新的遍历方法
	public abstract ListIterator<?> listIterator();
	
	// 从指定位置i处开始迭代，最初next()方法返回的将是位置i处的元素
	public abstract ListIterator<?> listIterator(int i);
	
	// 取得从位置i到j的所有元素（包含i但不包括j位置的元素）， 返回一个新的集合对象

	public abstract List<?> subList(int i , int j);
	
	
	/**
	 * List的实现类中，推荐：ArrayList Vector LinkedList
	 * 由于他们的接口相同，所以操作方式相同
	 * */
	
}
