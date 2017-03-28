package com.String;



public class TestString {
	public static void main(String[] args) {
		String str = "asdhasjkdas7t37eghbajsdb737e阿斯达技术的";
		// 拼接
		String str1 = "sadasdas";
		System.err.println(str+str1);
		
		// 比较
		System.err.println(str == str1);
		System.out.println(str.equals(str1));
		
		// 常用方法
		System.out.println("返回第N位的字符" + str.charAt(3));
		System.out.println("判断时候以某个字符开头"+str.startsWith("a"));
		System.out.println("判断是否以某个字符结尾"+str.endsWith("a"));
		System.out.println("字符第一次出现的位置"+str.indexOf("s"));
		System.out.println("字符串的长度"+str.length());
		// 切分字符串
		String[] splitList = str.split("s");
		for (String string : splitList) {
			System.out.println("切分的:"+string);
		}
		
		System.out.println("转大写"+str.toUpperCase());
		System.out.println("转小写"+str.toLowerCase());
		System.out.println("清除左右两边的空格和换行符"+str.trim());
		System.out.println("将其他数据类型转换成字符串:"+String.valueOf(false));
		System.out.println("根据下标截取字符串"+str.substring(3));
		System.out.println();
		
		
		// null
		// nul表示没有实例，例如：String str; 此时：str = null
		// String str = ""; 已经实例化了，表示空字符而已
		// 如果一个变量为null，在调用他的大部分方法或者成员变量时，就会抛出空指针异常
		str = null;
		// System.err.println(str.toLowerCase());报错
		
	}

}
