package com.Object.IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class TestObjectOutputStream {
	/**
	 * 将对象用对象刘写入文件
	 * @throws IOException 
	 * 
	 * 对象必须实现序列化
	 * 注意：对象的静态属性不能序列化
	 * 
	 * */
	
	public static void main(String[] args) throws IOException {
		List<TestWriteObject> objects = new ArrayList<TestWriteObject>();
		// 对象不能有静态属性，因为不能序列化，不然无法写入文件中
		objects.add(new TestWriteObject("daisuke", 100, "guangzhou"));
		objects.add(new TestWriteObject("alex", 120, "sganghai"));
		objects.add(new TestWriteObject("rolse", 130, "beijing"));
		objects.add(new TestWriteObject("owen", 150, "hefei"));
		objects.add(new TestWriteObject("jump", 170, "tianjin"));
		
		String path = "/Users/DaiSuke/Desktop/MyGitHubProject/JavaLeanDemo/JavaBaseDataType/src/com/Object/IO/IOObject.txt";
		FileOutputStream fileOutputStream;
		try {
			fileOutputStream = new FileOutputStream(path);
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(objects);
			objectOutputStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		
	}
}
